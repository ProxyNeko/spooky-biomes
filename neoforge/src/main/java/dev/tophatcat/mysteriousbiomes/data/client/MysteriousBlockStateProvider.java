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
package dev.tophatcat.mysteriousbiomes.data.client;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import dev.tophatcat.mysteriousbiomes.registries.ItemRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MysteriousBlockStateProvider extends BlockStateProvider {

    public MysteriousBlockStateProvider(PackOutput output, ExistingFileHelper existingHelper) {
        super(output, MysteriousCommon.MOD_ID, existingHelper);
    }

    protected String getName(Block item) {
        return BuiltInRegistries.BLOCK.getKey(item).getPath();
    }

    @Override
    protected void registerStatesAndModels() {
        getVariantBuilder(BlockRegistry.BLOOD_SOAKED_GRASS.get())
            .partialState()
            .with(BlockStateProperties.SNOWY, true)
            .modelForState()
            .modelFile(
                models()
                    .withExistingParent(
                        getName(BlockRegistry.BLOOD_SOAKED_GRASS.get()) + "_snow",
                        "minecraft:block/cube_bottom_top")
                    .texture("bottom", modLoc("block/blood_soaked_dirt"))
                    .texture("side", modLoc("block/blood_soaked_grass_snow"))
                    .texture("top", modLoc("block/blood_soaked_grass_top"))
                    .texture("particle", modLoc("block/blood_soaked_dirt")))
            .addModel()
            .partialState()
            .with(BlockStateProperties.SNOWY, false)
            .modelForState()
            .modelFile(
                models()
                    .withExistingParent(
                        getName(BlockRegistry.BLOOD_SOAKED_GRASS.get()),
                        "minecraft:block/cube_bottom_top")
                    .texture("bottom", modLoc("block/blood_soaked_dirt"))
                    .texture("side", modLoc("block/blood_soaked_grass_side"))
                    .texture("top", modLoc("block/blood_soaked_grass_top"))
                    .texture("particle", modLoc("block/blood_soaked_dirt")))
            .addModel();
        simpleBlock(BlockRegistry.BLOOD_SOAKED_DIRT.get());

        // Logs
        logBlock(BlockRegistry.BLOOD_SOAKED_LOG.get());
        logBlock(BlockRegistry.GHOSTLY_LOG.get());
        logBlock(BlockRegistry.SEEPING_LOG.get());
        logBlock(BlockRegistry.SORBUS_LOG.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // logBlock(MysteriousRegistry.WALNUT_LOG.get());

        // Stripped logs
        logBlock(BlockRegistry.BLOOD_SOAKED_STRIPPED_LOG.get());
        logBlock(BlockRegistry.GHOSTLY_STRIPPED_LOG.get());
        logBlock(BlockRegistry.SEEPING_STRIPPED_LOG.get());
        logBlock(BlockRegistry.SORBUS_STRIPPED_LOG.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // logBlock(MysteriousRegistry.WALNUT_STRIPPED_LOG.get());

        // Woods
        simpleBlock(BlockRegistry.BLOOD_SOAKED_WOOD.get());
        simpleBlock(BlockRegistry.GHOSTLY_WOOD.get());
        simpleBlock(BlockRegistry.SEEPING_WOOD.get());
        simpleBlock(BlockRegistry.SORBUS_WOOD.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_WOOD.get());

        // Stripped woods
        simpleBlock(BlockRegistry.BLOOD_SOAKED_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.SEEPING_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.SORBUS_STRIPPED_WOOD.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_STRIPPED_WOOD.get());

        // Planks
        simpleBlock(BlockRegistry.BLOOD_SOAKED_PLANKS.get());
        simpleBlock(BlockRegistry.GHOSTLY_PLANKS.get());
        simpleBlock(BlockRegistry.SEEPING_PLANKS.get());
        simpleBlock(BlockRegistry.SORBUS_PLANKS.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_PLANKS.get());

        // Stairs
        stairsBlock(BlockRegistry.BLOOD_SOAKED_STAIRS.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        stairsBlock(BlockRegistry.GHOSTLY_STAIRS.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        stairsBlock(BlockRegistry.SEEPING_STAIRS.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        stairsBlock(BlockRegistry.SORBUS_STAIRS.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // stairsBlock(MysteriousRegistry.WALNUT_STAIRS.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Leaves
        simpleBlock(BlockRegistry.BLOOD_SOAKED_LEAVES.get());
        simpleBlock(BlockRegistry.GHOSTLY_LEAVES.get());
        simpleBlock(BlockRegistry.SEEPING_LEAVES.get());
        simpleBlock(BlockRegistry.SORBUS_LEAVES.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_LEAVES.get());

        // Slabs
        slabBlock(BlockRegistry.BLOOD_SOAKED_SLAB.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()),
            blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        slabBlock(BlockRegistry.GHOSTLY_SLAB.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()),
            blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        slabBlock(BlockRegistry.SEEPING_SLAB.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()),
            blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        slabBlock(BlockRegistry.SORBUS_SLAB.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()),
            blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // slabBlock(MysteriousRegistry.WALNUT_SLAB.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()),
        //    blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Fences
        fenceBlock(BlockRegistry.BLOOD_SOAKED_FENCE.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        fenceBlock(BlockRegistry.GHOSTLY_FENCE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        fenceBlock(BlockRegistry.SEEPING_FENCE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        fenceBlock(BlockRegistry.SORBUS_FENCE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // fenceBlock(MysteriousRegistry.WALNUT_FENCE.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Gates
        fenceGateBlock(BlockRegistry.BLOOD_SOAKED_GATE.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        fenceGateBlock(BlockRegistry.GHOSTLY_GATE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        fenceGateBlock(BlockRegistry.SEEPING_GATE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        fenceGateBlock(BlockRegistry.SORBUS_GATE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // fenceGateBlock(MysteriousRegistry.WALNUT_GATE.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Buttons
        buttonBlock(BlockRegistry.BLOOD_SOAKED_BUTTON.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        buttonBlock(BlockRegistry.GHOSTLY_BUTTON.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        buttonBlock(BlockRegistry.SEEPING_BUTTON.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        buttonBlock(BlockRegistry.SORBUS_BUTTON.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // buttonBlock(MysteriousRegistry.WALNUT_BUTTON.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Pressure plates
        pressurePlateBlock(BlockRegistry.BLOOD_SOAKED_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.SEEPING_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.SORBUS_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // pressurePlateBlock(MysteriousRegistry.WALNUT_PRESSURE_PLATE.get(),
        //    blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Trapdoors
        trapdoorBlockWithRenderType(BlockRegistry.BLOOD_SOAKED_TRAPDOOR.get(), modLoc("block/blood_soaked_trapdoor"),
            true, "cutout");
        trapdoorBlockWithRenderType(BlockRegistry.GHOSTLY_TRAPDOOR.get(), modLoc("block/ghostly_trapdoor"),
            true, "cutout");
        trapdoorBlockWithRenderType(BlockRegistry.SEEPING_TRAPDOOR.get(), modLoc("block/seeping_trapdoor"),
            true, "cutout");
        trapdoorBlockWithRenderType(BlockRegistry.SORBUS_TRAPDOOR.get(), modLoc("block/sorbus_trapdoor"),
            true, "cutout");
        // TODO Enable these once we have textures, data generation fails without them.
        // trapdoorBlockWithRenderType(MysteriousRegistry.WALNUT_TRAPDOOR.get(), modLoc("block/walnut_trapdoor"),
        // true, "cutout");

        // Doors
        doorBlockWithRenderType(BlockRegistry.BLOOD_SOAKED_DOOR.get(), modLoc("block/blood_soaked_door_bottom"),
            modLoc("block/blood_soaked_door_top"), "cutout");
        doorBlockWithRenderType(BlockRegistry.GHOSTLY_DOOR.get(), modLoc("block/ghostly_door_bottom"),
            modLoc("block/ghostly_door_top"), "cutout");
        doorBlockWithRenderType(BlockRegistry.SEEPING_DOOR.get(), modLoc("block/seeping_door_bottom"),
            modLoc("block/seeping_door_top"), "cutout");
        doorBlockWithRenderType(BlockRegistry.SORBUS_DOOR.get(), modLoc("block/sorbus_door_bottom"),
            modLoc("block/sorbus_door_top"), "cutout");
        // TODO Enable these once we have textures, data generation fails without them.
        // doorBlockWithRenderType(MysteriousRegistry.WALNUT_DOOR.get(), modLoc("block/walnut_door_bottom"),
        //    modLoc("block/walnut_door_top"), "cutout");

        // Saplings
        simpleBlock(BlockRegistry.BLOOD_SOAKED_SAPLING.get(),
            models().cross("blood_soaked_sapling", modLoc("block/blood_soaked_sapling")).renderType("cutout"));
        simpleBlock(BlockRegistry.GHOSTLY_SAPLING.get(),
            models().cross("ghostly_sapling", modLoc("block/ghostly_sapling")).renderType("cutout"));
        simpleBlock(BlockRegistry.SEEPING_SAPLING.get(),
            models().cross("seeping_sapling", modLoc("block/seeping_sapling")).renderType("cutout"));
        simpleBlock(BlockRegistry.SORBUS_SAPLING.get(),
            models().cross("sorbus_sapling", modLoc("block/sorbus_sapling")).renderType("cutout"));
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_SAPLING.get(),
        // models().cross("walnut_sapling", modLoc("block/walnut_sapling")).renderType("cutout"));

        // Floor/wall signs
        signBlock(BlockRegistry.BLOOD_SOAKED_FLOOR_SIGN.get(), BlockRegistry.BLOOD_SOAKED_WALL_SIGN.get(),
            blockTexture(BlockRegistry.BLOOD_SOAKED_PLANKS.get()));
        signBlock(BlockRegistry.GHOSTLY_FLOOR_SIGN.get(), BlockRegistry.GHOSTLY_WALL_SIGN.get(),
            blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        signBlock(BlockRegistry.SEEPING_FLOOR_SIGN.get(), BlockRegistry.SEEPING_WALL_SIGN.get(),
            blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        signBlock(BlockRegistry.SORBUS_FLOOR_SIGN.get(), BlockRegistry.SORBUS_WALL_SIGN.get(),
            blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // signBlock(MysteriousRegistry.WALNUT_FLOOR_SIGN.get(), MysteriousRegistry.WALNUT_WALL_SIGN.get(),
        //    blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // TODO Enable these once we have textures, data generation fails without them.
        // Hanging signs
        // simpleBlock(MysteriousRegistry.BLOOD_SOAKED_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.GHOSTLY_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SEEPING_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SORBUS_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.WALNUT_HANGING_SIGN.get());

        // TODO Enable these once we have textures, data generation fails without them.
        // Wall hanging signs
        // simpleBlock(MysteriousRegistry.BLOOD_SOAKED_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.GHOSTLY_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SEEPING_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SORBUS_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.WALNUT_WALL_HANGING_SIGN.get());

        // Sign items
        itemModels().basicItem(ItemRegistry.BLOOD_SOAKED_SIGN.get());
        itemModels().basicItem(ItemRegistry.GHOSTLY_SIGN.get());
        itemModels().basicItem(ItemRegistry.SEEPING_SIGN.get());
        itemModels().basicItem(ItemRegistry.SORBUS_SIGN.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // itemModels().basicItem(MysteriousRegistry.WALNUT_SIGN.get());
    }
}
