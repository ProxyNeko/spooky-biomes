/*
 * A Minecraft mod made for SpookyJam 2017, contains Halloween themed biomes and content.
 * Copyright (C) KiriCattus 2013 - 2025
 * https://github.com/kiris-mods/mysterious-biomes/blob/dev/LICENSE.md
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package dev.tophatcat.mysteriousbiomes;

import dev.tophatcat.mysteriousbiomes.client.MysteriousRenderingNeo;
import dev.tophatcat.mysteriousbiomes.data.MysteriousBiomeGen;
import dev.tophatcat.mysteriousbiomes.data.MysteriousFeaturesGen;
import dev.tophatcat.mysteriousbiomes.data.MysteriousPlacementsGen;
import dev.tophatcat.mysteriousbiomes.data.client.MysteriousBlockStateProvider;
import dev.tophatcat.mysteriousbiomes.data.client.MysteriousItemModelProvider;
import dev.tophatcat.mysteriousbiomes.data.client.MysteriousLanguageProvider;
import dev.tophatcat.mysteriousbiomes.data.server.MysteriousLootTableProvider;
import dev.tophatcat.mysteriousbiomes.data.server.MysteriousRecipeProvider;
import dev.tophatcat.mysteriousbiomes.data.server.MysteriousTagProvider;
import dev.tophatcat.mysteriousbiomes.entity.TheForgottenWarlockEntity;
import dev.tophatcat.mysteriousbiomes.registries.EntityRegistry;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(MysteriousCommon.MOD_ID)
public class MysteriousNeo {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(
        Registries.BLOCK_ENTITY_TYPE, MysteriousCommon.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
        Registries.BLOCK, MysteriousCommon.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
        Registries.ENTITY_TYPE, MysteriousCommon.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        Registries.ITEM, MysteriousCommon.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(
        Registries.SOUND_EVENT, MysteriousCommon.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
        Registries.CREATIVE_MODE_TAB, MysteriousCommon.MOD_ID);

    public MysteriousNeo(IEventBus bus) {
        BLOCK_ENTITIES.register(bus);
        BLOCKS.register(bus);
        ENTITIES.register(bus);
        ITEMS.register(bus);
        SOUND_EVENTS.register(bus);
        CREATIVE_TABS.register(bus);
        bus.<EntityAttributeCreationEvent>addListener(event -> EntityRegistry.registerEntityAttributes(event::put));
        bus.addListener(this::registerSpawnPlacements);
        bus.<FMLCommonSetupEvent>addListener(event -> MysteriousCommon.setupBlockEntities());
        MysteriousCommon.init();

        bus.addListener(this::gatherData);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            bus.addListener(MysteriousRenderingNeo::registerEntityModels);
            bus.addListener(MysteriousRenderingNeo::registerModelLayers);
        }
    }

    private void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(EntityRegistry.THE_FORGOTTEN_WARLOCK.get(), SpawnPlacementTypes.ON_GROUND,
            Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, TheForgottenWarlockEntity::checkSpawnRules,
            RegisterSpawnPlacementsEvent.Operation.AND);
    }

    public void gatherData(GatherDataEvent event) {
        RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MysteriousFeaturesGen::run)
            .add(Registries.PLACED_FEATURE, MysteriousPlacementsGen::run)
            .add(Registries.BIOME, MysteriousBiomeGen::run);

        var generator = event.getGenerator();
        boolean includeClient = event.includeClient();
        boolean includeServer = event.includeServer();
        var existingHelper = event.getExistingFileHelper();
        var packOutput = event.getGenerator().getPackOutput();
        var lookupProvider = event.getLookupProvider();

        var blockTags = generator.addProvider(includeServer, new MysteriousTagProvider.MysteriousBlockTags(
            packOutput, lookupProvider, existingHelper));
        generator.addProvider(includeServer, new MysteriousTagProvider.MysteriousItemTags(packOutput,
            lookupProvider, blockTags.contentsGetter(), existingHelper));
        generator.addProvider(includeClient, new MysteriousLanguageProvider(packOutput,
            MysteriousCommon.MOD_ID, "en_us"));
        generator.addProvider(includeClient, new MysteriousBlockStateProvider(packOutput, existingHelper));
        generator.addProvider(includeClient, new MysteriousItemModelProvider(packOutput, existingHelper));
        generator.addProvider(includeServer, new MysteriousRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), MysteriousLootTableProvider.create(packOutput, lookupProvider));
        generator.addProvider(includeServer, new MysteriousBiomeGen(packOutput, lookupProvider, BUILDER));
    }
}
