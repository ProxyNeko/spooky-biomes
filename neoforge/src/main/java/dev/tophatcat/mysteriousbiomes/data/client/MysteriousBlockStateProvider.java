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
        getVariantBuilder(BlockRegistry.BLOODIED_GRASS.get())
            .partialState()
            .with(BlockStateProperties.SNOWY, true)
            .modelForState()
            .modelFile(
                models()
                    .withExistingParent(
                        getName(BlockRegistry.BLOODIED_GRASS.get()) + "_snow",
                        "minecraft:block/cube_bottom_top")
                    .texture("bottom", modLoc("block/bloodied_dirt"))
                    .texture("side", modLoc("block/bloodied_grass_snow"))
                    .texture("top", modLoc("block/bloodied_grass_top"))
                    .texture("particle", modLoc("block/bloodied_dirt")))
            .addModel()
            .partialState()
            .with(BlockStateProperties.SNOWY, false)
            .modelForState()
            .modelFile(
                models()
                    .withExistingParent(
                        getName(BlockRegistry.BLOODIED_GRASS.get()),
                        "minecraft:block/cube_bottom_top")
                    .texture("bottom", modLoc("block/bloodied_dirt"))
                    .texture("side", modLoc("block/bloodied_grass_side"))
                    .texture("top", modLoc("block/bloodied_grass_top"))
                    .texture("particle", modLoc("block/bloodied_dirt")))
            .addModel();
        simpleBlock(BlockRegistry.BLOODIED_DIRT.get());

        // Logs
        logBlock(BlockRegistry.BLOODWOOD_LOG.get());
        logBlock(BlockRegistry.GHOSTLY_LOG.get());
        logBlock(BlockRegistry.SEEPING_LOG.get());
        logBlock(BlockRegistry.SORBUS_LOG.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // logBlock(MysteriousRegistry.WALNUT_LOG.get());

        // Stripped logs
        logBlock(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get());
        logBlock(BlockRegistry.GHOSTLY_STRIPPED_LOG.get());
        logBlock(BlockRegistry.SEEPING_STRIPPED_LOG.get());
        logBlock(BlockRegistry.SORBUS_STRIPPED_LOG.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // logBlock(MysteriousRegistry.WALNUT_STRIPPED_LOG.get());

        // Woods
        simpleBlock(BlockRegistry.BLOODWOOD_WOOD.get());
        simpleBlock(BlockRegistry.GHOSTLY_WOOD.get());
        simpleBlock(BlockRegistry.SEEPING_WOOD.get());
        simpleBlock(BlockRegistry.SORBUS_WOOD.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_WOOD.get());

        // Stripped woods
        simpleBlock(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.SEEPING_STRIPPED_WOOD.get());
        simpleBlock(BlockRegistry.SORBUS_STRIPPED_WOOD.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_STRIPPED_WOOD.get());

        // Planks
        simpleBlock(BlockRegistry.BLOODWOOD_PLANKS.get());
        simpleBlock(BlockRegistry.GHOSTLY_PLANKS.get());
        simpleBlock(BlockRegistry.SEEPING_PLANKS.get());
        simpleBlock(BlockRegistry.SORBUS_PLANKS.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_PLANKS.get());

        // Stairs
        stairsBlock(BlockRegistry.BLOODWOOD_STAIRS.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
        stairsBlock(BlockRegistry.GHOSTLY_STAIRS.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        stairsBlock(BlockRegistry.SEEPING_STAIRS.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        stairsBlock(BlockRegistry.SORBUS_STAIRS.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // stairsBlock(MysteriousRegistry.WALNUT_STAIRS.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Leaves
        simpleBlock(BlockRegistry.BLOODWOOD_LEAVES.get());
        simpleBlock(BlockRegistry.GHOSTLY_LEAVES.get());
        simpleBlock(BlockRegistry.SEEPING_LEAVES.get());
        simpleBlock(BlockRegistry.SORBUS_LEAVES.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_LEAVES.get());

        // Slabs
        slabBlock(BlockRegistry.BLOODWOOD_SLAB.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()),
            blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
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
        fenceBlock(BlockRegistry.BLOODWOOD_FENCE.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
        fenceBlock(BlockRegistry.GHOSTLY_FENCE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        fenceBlock(BlockRegistry.SEEPING_FENCE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        fenceBlock(BlockRegistry.SORBUS_FENCE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // fenceBlock(MysteriousRegistry.WALNUT_FENCE.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Gates
        fenceGateBlock(BlockRegistry.BLOODWOOD_GATE.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
        fenceGateBlock(BlockRegistry.GHOSTLY_GATE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        fenceGateBlock(BlockRegistry.SEEPING_GATE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        fenceGateBlock(BlockRegistry.SORBUS_GATE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // fenceGateBlock(MysteriousRegistry.WALNUT_GATE.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Buttons
        buttonBlock(BlockRegistry.BLOODWOOD_BUTTON.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
        buttonBlock(BlockRegistry.GHOSTLY_BUTTON.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        buttonBlock(BlockRegistry.SEEPING_BUTTON.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        buttonBlock(BlockRegistry.SORBUS_BUTTON.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // buttonBlock(MysteriousRegistry.WALNUT_BUTTON.get(), blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Pressure plates
        pressurePlateBlock(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.GHOSTLY_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.SEEPING_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.SEEPING_PLANKS.get()));
        pressurePlateBlock(BlockRegistry.SORBUS_PRESSURE_PLATE.get(), blockTexture(BlockRegistry.SORBUS_PLANKS.get()));
        // TODO Enable these once we have textures, data generation fails without them.
        // pressurePlateBlock(MysteriousRegistry.WALNUT_PRESSURE_PLATE.get(),
        //    blockTexture(MysteriousRegistry.WALNUT_PLANKS.get()));

        // Trapdoors
        trapdoorBlock(BlockRegistry.BLOODWOOD_TRAPDOOR.get(), modLoc("block/bloodwood_trapdoor"), true);
        trapdoorBlock(BlockRegistry.GHOSTLY_TRAPDOOR.get(), modLoc("block/ghostly_trapdoor"), true);
        trapdoorBlock(BlockRegistry.SEEPING_TRAPDOOR.get(), modLoc("block/seeping_trapdoor"), true);
        trapdoorBlock(BlockRegistry.SORBUS_TRAPDOOR.get(), modLoc("block/sorbus_trapdoor"), true);
        // TODO Enable these once we have textures, data generation fails without them.
        // trapdoorBlock(MysteriousRegistry.WALNUT_TRAPDOOR.get(), modLoc("block/walnut_trapdoor"), true);

        // Doors
        doorBlock(BlockRegistry.BLOODWOOD_DOOR.get(), modLoc("block/bloodwood_door_bottom"),
            modLoc("block/bloodwood_door_top"));
        doorBlock(BlockRegistry.GHOSTLY_DOOR.get(), modLoc("block/ghostly_door_bottom"),
            modLoc("block/ghostly_door_top"));
        doorBlock(BlockRegistry.SEEPING_DOOR.get(), modLoc("block/seeping_door_bottom"),
            modLoc("block/seeping_door_top"));
        doorBlock(BlockRegistry.SORBUS_DOOR.get(), modLoc("block/sorbus_door_bottom"),
            modLoc("block/sorbus_door_top"));
        // TODO Enable these once we have textures, data generation fails without them.
        // doorBlock(MysteriousRegistry.WALNUT_DOOR.get(), modLoc("block/walnut_door_bottom"),
        //    modLoc("block/walnut_door_top"));

        // Saplings
        simpleBlock(BlockRegistry.BLOODWOOD_SAPLING.get(),
            models().cross("bloodwood_sapling", modLoc("block/bloodwood_sapling")));
        simpleBlock(BlockRegistry.GHOSTLY_SAPLING.get(),
            models().cross("ghostly_sapling", modLoc("block/ghostly_sapling")));
        simpleBlock(BlockRegistry.SEEPING_SAPLING.get(),
            models().cross("seeping_sapling", modLoc("block/seeping_sapling")));
        simpleBlock(BlockRegistry.SORBUS_SAPLING.get(),
            models().cross("sorbus_sapling", modLoc("block/sorbus_sapling")));
        // TODO Enable these once we have textures, data generation fails without them.
        // simpleBlock(MysteriousRegistry.WALNUT_SAPLING.get(),
        // models().cross("walnut_sapling", modLoc("block/walnut_sapling")));

        // Floor/wall signs
        signBlock(BlockRegistry.BLOODWOOD_FLOOR_SIGN.get(), BlockRegistry.BLOODWOOD_WALL_SIGN.get(),
            blockTexture(BlockRegistry.BLOODWOOD_PLANKS.get()));
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
        // simpleBlock(MysteriousRegistry.BLOODWOOD_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.GHOSTLY_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SEEPING_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SORBUS_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.WALNUT_HANGING_SIGN.get());

        // TODO Enable these once we have textures, data generation fails without them.
        // Wall hanging signs
        // simpleBlock(MysteriousRegistry.BLOODWOOD_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.GHOSTLY_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SEEPING_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.SORBUS_WALL_HANGING_SIGN.get());
        // simpleBlock(MysteriousRegistry.WALNUT_WALL_HANGING_SIGN.get());

        // Sign items
        itemModels().basicItem(ItemRegistry.BLOODWOOD_SIGN.get());
        itemModels().basicItem(ItemRegistry.GHOSTLY_SIGN.get());
        itemModels().basicItem(ItemRegistry.SEEPING_SIGN.get());
        itemModels().basicItem(ItemRegistry.SORBUS_SIGN.get());
        // TODO Enable these once we have textures, data generation fails without them.
        // itemModels().basicItem(MysteriousRegistry.WALNUT_SIGN.get());
    }
}
