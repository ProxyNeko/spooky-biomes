/*
 * Mysterious Biomes - https://github.com/tophatcats-mods/mysterious-biomes
 * Copyright (C) 2013-2023 <KiriCattus>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * Specifically version 2.1 of the License.
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
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 */
package dev.tophatcat.mysteriousbiomes.setup;

import dev.tophatcat.kirislib.RegHelpers;
import dev.tophatcat.mysteriousbiomes.MysteriousBiomes;
import dev.tophatcat.mysteriousbiomes.blocks.BloodiedGrass;
import dev.tophatcat.mysteriousbiomes.utils.MysteriousBlockTypes;
import dev.tophatcat.mysteriousbiomes.utils.MysteriousRegistrationUtils;
import dev.tophatcat.mysteriousbiomes.utils.MysteriousWoodType;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public final class MysteriousContentSetup {

    public static final Map<Identifier, Supplier<Block>> BLOCKS = new LinkedHashMap<>();
    public static final Map<Identifier, Supplier<Item>> ITEMS = new LinkedHashMap<>();

    public static Supplier<Block> BLOODIED_GRASS = null;
    public static Supplier<Block> BLOODIED_DIRT = null;

    private MysteriousContentSetup() {
        throw new UnsupportedOperationException();
    }

    public static void init() {
        var mysteriousWoodTypes = List.of(
                MysteriousBlockTypes.BLOODWOOD,
                MysteriousBlockTypes.GHOSTLY,
                MysteriousBlockTypes.SORBUS,
                MysteriousBlockTypes.SEEPING,
                MysteriousBlockTypes.SAKURA);

        mysteriousWoodTypes.forEach(woodType -> {
            woodType.log = MysteriousRegistrationUtils.setupPillarBlock(woodType, "_log");
            woodType.stripped_log = MysteriousRegistrationUtils.setupPillarBlock(woodType,
                    "_stripped_log");
            woodType.wood = MysteriousRegistrationUtils.setupPillarBlock(woodType, "_wood");
            woodType.stripped_wood = MysteriousRegistrationUtils.setupPillarBlock(woodType,
                    "_stripped_wood");
            woodType.planks = MysteriousRegistrationUtils.setupPlanksBlock(woodType);
            woodType.stairs = MysteriousRegistrationUtils.setupStairsBlock(woodType,
                    woodType.getPlanks().get().getDefaultState());
            woodType.leaves = MysteriousRegistrationUtils.setupLeavesBlock(woodType);
            woodType.slab = MysteriousRegistrationUtils.setupSlabBlock(woodType);
            woodType.fence = MysteriousRegistrationUtils.setupFenceBlock(woodType);
            woodType.gate = MysteriousRegistrationUtils.setupGateBlock(woodType);
            woodType.button = MysteriousRegistrationUtils.setupButtonBlock(woodType);
            woodType.pressure_plate = MysteriousRegistrationUtils.setupPressurePlateBlock(woodType);
            woodType.trapdoor = MysteriousRegistrationUtils.setupTrapdoorBlock(woodType);
            woodType.door = MysteriousRegistrationUtils.setupDoorBlock(woodType);
            StrippableBlockRegistry.register(woodType.getLog().get(), woodType.getStrippedLog().get());
        });

        //TODO Change the sapling generators.
        MysteriousBlockTypes.BLOODWOOD.sapling = MysteriousRegistrationUtils.setupSaplingBlock("bloodwood_sapling",
                new OakSaplingGenerator());
        MysteriousBlockTypes.GHOSTLY.sapling = MysteriousRegistrationUtils.setupSaplingBlock("ghostly_sapling",
                new OakSaplingGenerator());
        MysteriousBlockTypes.SORBUS.sapling = MysteriousRegistrationUtils.setupSaplingBlock("sorbus_sapling",
                new OakSaplingGenerator());
        MysteriousBlockTypes.SEEPING.sapling = MysteriousRegistrationUtils.setupSaplingBlock("seeping_sapling",
                new OakSaplingGenerator());
        MysteriousBlockTypes.SAKURA.sapling = MysteriousRegistrationUtils.setupSaplingBlock("sakura_sapling",
                new OakSaplingGenerator());


        MysteriousBlockTypes.BLOODWOOD.floor_sign = MysteriousRegistrationUtils.setupFloorSignBlock("bloodwood_sign",
                MysteriousWoodType.BLOODWOOD_WOOD_TYPE);
        MysteriousBlockTypes.GHOSTLY.floor_sign = MysteriousRegistrationUtils.setupFloorSignBlock("ghostly_sign",
                MysteriousWoodType.GHOSTLY_WOOD_TYPE);
        MysteriousBlockTypes.SORBUS.floor_sign = MysteriousRegistrationUtils.setupFloorSignBlock("sorbus_sign",
                MysteriousWoodType.SORBUS_WOOD_TYPE);
        MysteriousBlockTypes.SEEPING.floor_sign = MysteriousRegistrationUtils.setupFloorSignBlock("seeping_sign",
                MysteriousWoodType.SEEPING_WOOD_TYPE);
        MysteriousBlockTypes.SAKURA.floor_sign = MysteriousRegistrationUtils.setupFloorSignBlock("sakura_sign",
                MysteriousWoodType.SAKURA_WOOD_TYPE);


        MysteriousBlockTypes.BLOODWOOD.wall_sign = MysteriousRegistrationUtils.setupWallSignBlock("bloodwood_wall_sign",
                MysteriousWoodType.BLOODWOOD_WOOD_TYPE);
        MysteriousBlockTypes.GHOSTLY.wall_sign = MysteriousRegistrationUtils.setupWallSignBlock("ghostly_wall_sign",
                MysteriousWoodType.GHOSTLY_WOOD_TYPE);
        MysteriousBlockTypes.SORBUS.wall_sign = MysteriousRegistrationUtils.setupWallSignBlock("sorbus_wall_sign",
                MysteriousWoodType.SORBUS_WOOD_TYPE);
        MysteriousBlockTypes.SEEPING.wall_sign = MysteriousRegistrationUtils.setupWallSignBlock("seeping_wall_sign",
                MysteriousWoodType.SEEPING_WOOD_TYPE);
        MysteriousBlockTypes.SAKURA.wall_sign = MysteriousRegistrationUtils.setupWallSignBlock("sakura_wall_sign",
                MysteriousWoodType.SAKURA_WOOD_TYPE);

        MysteriousBlockTypes.BLOODWOOD.sign = MysteriousRegistrationUtils.setupSignItem("bloodwood_sign",
                MysteriousBlockTypes.BLOODWOOD.getFloorSign().get(),
                MysteriousBlockTypes.BLOODWOOD.getWallSign().get());
        MysteriousBlockTypes.GHOSTLY.sign = MysteriousRegistrationUtils.setupSignItem("ghostly_sign",
                MysteriousBlockTypes.GHOSTLY.getFloorSign().get(),
                MysteriousBlockTypes.GHOSTLY.getWallSign().get());
        MysteriousBlockTypes.SORBUS.sign = MysteriousRegistrationUtils.setupSignItem("sorbus_sign",
                MysteriousBlockTypes.SORBUS.getFloorSign().get(),
                MysteriousBlockTypes.SORBUS.getWallSign().get());
        MysteriousBlockTypes.SEEPING.sign = MysteriousRegistrationUtils.setupSignItem("seeping_sign",
                MysteriousBlockTypes.SEEPING.getFloorSign().get(),
                MysteriousBlockTypes.SEEPING.getWallSign().get());
        MysteriousBlockTypes.SAKURA.sign = MysteriousRegistrationUtils.setupSignItem("sakura_sign",
                MysteriousBlockTypes.SAKURA.getFloorSign().get(),
                MysteriousBlockTypes.SAKURA.getWallSign().get());

        MysteriousBlockTypes.BLOODWOOD.hanging_sign = MysteriousRegistrationUtils.setupHangingSignBlock(
                "bloodwood_hanging_sign", MysteriousWoodType.BLOODWOOD_WOOD_TYPE);
        MysteriousBlockTypes.GHOSTLY.hanging_sign = MysteriousRegistrationUtils.setupHangingSignBlock(
                "ghostly_hanging_sign", MysteriousWoodType.GHOSTLY_WOOD_TYPE);
        MysteriousBlockTypes.SORBUS.hanging_sign = MysteriousRegistrationUtils.setupHangingSignBlock(
                "sorbus_hanging_sign", MysteriousWoodType.SORBUS_WOOD_TYPE);
        MysteriousBlockTypes.SEEPING.hanging_sign = MysteriousRegistrationUtils.setupHangingSignBlock(
                "seeping_hanging_sign", MysteriousWoodType.SEEPING_WOOD_TYPE);
        MysteriousBlockTypes.SAKURA.hanging_sign = MysteriousRegistrationUtils.setupHangingSignBlock(
                "sakura_hanging_sign", MysteriousWoodType.SAKURA_WOOD_TYPE);

        MysteriousBlockTypes.BLOODWOOD.wall_hanging_sign = MysteriousRegistrationUtils.setupWallHangingSignBlock(
                "bloodwood_wall_hanging_sign", MysteriousWoodType.BLOODWOOD_WOOD_TYPE);
        MysteriousBlockTypes.GHOSTLY.wall_hanging_sign = MysteriousRegistrationUtils.setupWallHangingSignBlock(
                "ghostly_wall_hanging_sign", MysteriousWoodType.GHOSTLY_WOOD_TYPE);
        MysteriousBlockTypes.SORBUS.wall_hanging_sign = MysteriousRegistrationUtils.setupWallHangingSignBlock(
                "sorbus_wall_hanging_sign", MysteriousWoodType.SORBUS_WOOD_TYPE);
        MysteriousBlockTypes.SEEPING.wall_hanging_sign = MysteriousRegistrationUtils.setupWallHangingSignBlock(
                "seeping_wall_hanging_sign", MysteriousWoodType.SEEPING_WOOD_TYPE);
        MysteriousBlockTypes.SAKURA.wall_hanging_sign = MysteriousRegistrationUtils.setupWallHangingSignBlock(
                "sakura_wall_hanging_sign", MysteriousWoodType.SAKURA_WOOD_TYPE);

        MysteriousBlockTypes.BLOODWOOD.hanging_sign_item = MysteriousRegistrationUtils.setupHangingSignItem(
                "bloodwood_hanging_sign_item", MysteriousBlockTypes.BLOODWOOD.getHangingSign().get(),
                MysteriousBlockTypes.BLOODWOOD.getWallHangingSign().get());
        MysteriousBlockTypes.GHOSTLY.hanging_sign_item = MysteriousRegistrationUtils.setupHangingSignItem(
                "ghostly_hanging_sign_item", MysteriousBlockTypes.GHOSTLY.getHangingSign().get(),
                MysteriousBlockTypes.GHOSTLY.getWallHangingSign().get());
        MysteriousBlockTypes.SORBUS.hanging_sign_item = MysteriousRegistrationUtils.setupHangingSignItem(
                "sorbus_hanging_sign_item", MysteriousBlockTypes.SORBUS.getHangingSign().get(),
                MysteriousBlockTypes.SORBUS.getWallHangingSign().get());
        MysteriousBlockTypes.SEEPING.hanging_sign_item = MysteriousRegistrationUtils.setupHangingSignItem(
                "seeping_hanging_sign_item", MysteriousBlockTypes.SEEPING.getHangingSign().get(),
                MysteriousBlockTypes.SEEPING.getWallHangingSign().get());
        MysteriousBlockTypes.SAKURA.hanging_sign_item = MysteriousRegistrationUtils.setupHangingSignItem(
                "sakura_hanging_sign_item", MysteriousBlockTypes.SAKURA.getHangingSign().get(),
                MysteriousBlockTypes.SAKURA.getWallHangingSign().get());

        BLOODIED_GRASS = RegHelpers.createBlockWithItem(new Identifier(MysteriousBiomes.MOD_ID,
                "bloodied_grass"), () -> new BloodiedGrass(Block.Settings
                .copy(Blocks.DIRT).strength(0.5F).sounds(BlockSoundGroup.WET_GRASS).ticksRandomly()), BLOCKS, ITEMS);
        BLOODIED_DIRT = RegHelpers.createBlockWithItem(
                new Identifier(MysteriousBiomes.MOD_ID, "bloodied_dirt"),
                () -> new Block(Block.Settings.copy(Blocks.DIRT).strength(0.5F).sounds(BlockSoundGroup.ROOTED_DIRT)),
                BLOCKS, ITEMS);

        MysteriousRegistrationUtils.setupMobEgg("the_forgotten_warlock_spawn_egg",
                new SpawnEggItem(MysteriousBiomes.THE_FORGOTTEN_WARLOCK, 0x0519f7,
                        0x161a4a, new Item.Settings()));
    }
}
