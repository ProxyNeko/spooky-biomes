/*
 * A Minecraft mod made for SpookyJam 2017, contains Halloween themed biomes and content.
 * Copyright (C) KiriCattus 2013 - 2024
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
import dev.tophatcat.mysteriousbiomes.platform.PlatformNeoForge;
import java.util.Comparator;

import dev.tophatcat.mysteriousbiomes.registries.EntityRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLanguageProvider;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

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
            bus.addListener(MysteriousRenderingNeo::registerCutouts);
        }
    }

    private void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(EntityRegistry.THE_FORGOTTEN_WARLOCK.get(), SpawnPlacementTypes.ON_GROUND,
            Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, TheForgottenWarlockEntity::checkSpawnRules,
            RegisterSpawnPlacementsEvent.Operation.AND);
    }

    public void gatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var existingHelper = event.getExistingFileHelper();

        // Datagen trees.
        RegistrySetBuilder builder = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MysteriousFeaturesGen::run)
            .add(Registries.PLACED_FEATURE, MysteriousPlacementsGen::run)
            .add(Registries.BIOME, MysteriousBiomeGen::run);

        // Datagen block and item tags.
        var blockTags = gen.addProvider(true, new MysteriousTagProvider.MysteriousBlockTags(gen.getPackOutput(),
            event.getLookupProvider(), existingHelper));

        gen.addProvider(true, new MysteriousTagProvider.MysteriousItemTags(gen.getPackOutput(),
            event.getLookupProvider(), blockTags.contentsGetter(), existingHelper));

        // Datagen language files.
        gen.addProvider(event.includeClient(), new MysteriousLanguageProvider(gen.getPackOutput(),
            MysteriousCommon.MOD_ID, "en_us"));

        // Datagen the block states and model files.
        gen.addProvider(event.includeClient(), new MysteriousBlockStateProvider(gen.getPackOutput(), existingHelper));

        // Datagen item model files.
        gen.addProvider(event.includeClient(), new MysteriousItemModelProvider(gen.getPackOutput(), existingHelper));

        // Datagen recipes.
        gen.addProvider(event.includeServer(), new MysteriousRecipeProvider(
            gen.getPackOutput(), event.getLookupProvider()));

        // Datagen loot tables.
        gen.addProvider(event.includeServer(), MysteriousLootTableProvider.create(gen.getPackOutput(),
            event.getLookupProvider()));
    }
}
