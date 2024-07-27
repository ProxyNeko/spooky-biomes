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
package dev.tophatcat.mysteriousbiomes.data.server;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import dev.tophatcat.mysteriousbiomes.utils.MysteriousTags;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MysteriousTagProvider {

    public static class MysteriousItemTags extends ItemTagsProvider {

        public MysteriousItemTags(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider,
            CompletableFuture<TagsProvider.TagLookup<Block>> blockLookup,
            ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, blockLookup, MysteriousCommon.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(ItemTags.PLANKS)
                .add(BlockRegistry.BLOODWOOD_PLANKS.get().asItem())
                .add(BlockRegistry.GHOSTLY_PLANKS.get().asItem())
                .add(BlockRegistry.SEEPING_PLANKS.get().asItem())
                .add(BlockRegistry.SORBUS_PLANKS.get().asItem())
                .add(BlockRegistry.WALNUT_PLANKS.get().asItem());

            tag(ItemTags.WOODEN_BUTTONS)
                .add(BlockRegistry.BLOODWOOD_BUTTON.get().asItem())
                .add(BlockRegistry.GHOSTLY_BUTTON.get().asItem())
                .add(BlockRegistry.SEEPING_BUTTON.get().asItem())
                .add(BlockRegistry.SORBUS_BUTTON.get().asItem())
                .add(BlockRegistry.WALNUT_BUTTON.get().asItem());

            tag(ItemTags.WOODEN_DOORS)
                .add(BlockRegistry.BLOODWOOD_DOOR.get().asItem())
                .add(BlockRegistry.GHOSTLY_DOOR.get().asItem())
                .add(BlockRegistry.SEEPING_DOOR.get().asItem())
                .add(BlockRegistry.SORBUS_DOOR.get().asItem())
                .add(BlockRegistry.WALNUT_DOOR.get().asItem());

            tag(ItemTags.WOODEN_STAIRS)
                .add(BlockRegistry.BLOODWOOD_STAIRS.get().asItem())
                .add(BlockRegistry.GHOSTLY_STAIRS.get().asItem())
                .add(BlockRegistry.SEEPING_STAIRS.get().asItem())
                .add(BlockRegistry.SORBUS_STAIRS.get().asItem())
                .add(BlockRegistry.WALNUT_STAIRS.get().asItem());

            tag(ItemTags.WOODEN_SLABS)
                .add(BlockRegistry.BLOODWOOD_SLAB.get().asItem())
                .add(BlockRegistry.GHOSTLY_SLAB.get().asItem())
                .add(BlockRegistry.SEEPING_SLAB.get().asItem())
                .add(BlockRegistry.SORBUS_SLAB.get().asItem())
                .add(BlockRegistry.WALNUT_SLAB.get().asItem());

            tag(ItemTags.WOODEN_FENCES)
                .add(BlockRegistry.BLOODWOOD_FENCE.get().asItem())
                .add(BlockRegistry.GHOSTLY_FENCE.get().asItem())
                .add(BlockRegistry.SEEPING_FENCE.get().asItem())
                .add(BlockRegistry.SORBUS_FENCE.get().asItem())
                .add(BlockRegistry.WALNUT_FENCE.get().asItem());

            tag(ItemTags.SAPLINGS)
                .add(BlockRegistry.BLOODWOOD_SAPLING.get().asItem())
                .add(BlockRegistry.GHOSTLY_SAPLING.get().asItem())
                .add(BlockRegistry.SEEPING_SAPLING.get().asItem())
                .add(BlockRegistry.SORBUS_SAPLING.get().asItem())
                .add(BlockRegistry.WALNUT_SAPLING.get().asItem());

            tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get().asItem())
                .add(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get().asItem())
                .add(BlockRegistry.SEEPING_PRESSURE_PLATE.get().asItem())
                .add(BlockRegistry.SORBUS_PRESSURE_PLATE.get().asItem())
                .add(BlockRegistry.WALNUT_PRESSURE_PLATE.get().asItem());

            tag(ItemTags.LEAVES)
                .add(BlockRegistry.BLOODWOOD_LEAVES.get().asItem())
                .add(BlockRegistry.GHOSTLY_LEAVES.get().asItem())
                .add(BlockRegistry.SEEPING_LEAVES.get().asItem())
                .add(BlockRegistry.SORBUS_LEAVES.get().asItem())
                .add(BlockRegistry.WALNUT_LEAVES.get().asItem());

            tag(ItemTags.WOODEN_TRAPDOORS)
                .add(BlockRegistry.BLOODWOOD_TRAPDOOR.get().asItem())
                .add(BlockRegistry.GHOSTLY_TRAPDOOR.get().asItem())
                .add(BlockRegistry.SEEPING_TRAPDOOR.get().asItem())
                .add(BlockRegistry.SORBUS_TRAPDOOR.get().asItem())
                .add(BlockRegistry.WALNUT_TRAPDOOR.get().asItem());

            tag(ItemTags.FENCE_GATES)
                .add(BlockRegistry.BLOODWOOD_GATE.get().asItem())
                .add(BlockRegistry.GHOSTLY_GATE.get().asItem())
                .add(BlockRegistry.SEEPING_GATE.get().asItem())
                .add(BlockRegistry.SORBUS_GATE.get().asItem())
                .add(BlockRegistry.WALNUT_GATE.get().asItem());

            tag(ItemTags.DIRT)
                .add(BlockRegistry.BLOODIED_DIRT.get().asItem())
                .add(BlockRegistry.BLOODIED_GRASS.get().asItem());

            tag(MysteriousTags.MysteriousItems.BLOODWOOD_LOGS)
                .add(BlockRegistry.BLOODWOOD_LOG.get().asItem())
                .add(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get().asItem())
                .add(BlockRegistry.BLOODWOOD_WOOD.get().asItem())
                .add(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get().asItem());

            tag(MysteriousTags.MysteriousItems.GHOSTLY_LOGS)
                .add(BlockRegistry.GHOSTLY_LOG.get().asItem())
                .add(BlockRegistry.GHOSTLY_STRIPPED_LOG.get().asItem())
                .add(BlockRegistry.GHOSTLY_WOOD.get().asItem())
                .add(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get().asItem());

            tag(MysteriousTags.MysteriousItems.SORBUS_LOGS)
                .add(BlockRegistry.SORBUS_LOG.get().asItem())
                .add(BlockRegistry.SORBUS_STRIPPED_LOG.get().asItem())
                .add(BlockRegistry.SORBUS_WOOD.get().asItem())
                .add(BlockRegistry.SORBUS_STRIPPED_WOOD.get().asItem());

            tag(MysteriousTags.MysteriousItems.SEEPING_LOGS)
                .add(BlockRegistry.SEEPING_LOG.get().asItem())
                .add(BlockRegistry.SEEPING_STRIPPED_LOG.get().asItem())
                .add(BlockRegistry.SEEPING_WOOD.get().asItem())
                .add(BlockRegistry.SEEPING_STRIPPED_WOOD.get().asItem());

            tag(MysteriousTags.MysteriousItems.WALNUT_LOGS)
                .add(BlockRegistry.WALNUT_LOG.get().asItem())
                .add(BlockRegistry.WALNUT_STRIPPED_LOG.get().asItem())
                .add(BlockRegistry.WALNUT_WOOD.get().asItem())
                .add(BlockRegistry.WALNUT_STRIPPED_WOOD.get().asItem());

            tag(ItemTags.LOGS_THAT_BURN)
                .addTag(MysteriousTags.MysteriousItems.BLOODWOOD_LOGS)
                .addTag(MysteriousTags.MysteriousItems.GHOSTLY_LOGS)
                .addTag(MysteriousTags.MysteriousItems.SORBUS_LOGS)
                .addTag(MysteriousTags.MysteriousItems.SEEPING_LOGS)
                .addTag(MysteriousTags.MysteriousItems.WALNUT_LOGS);
        }
    }

    public static class MysteriousBlockTags extends BlockTagsProvider {

        public MysteriousBlockTags(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider,
            ExistingFileHelper existingHelper) {
            super(output, lookupProvider, MysteriousCommon.MOD_ID, existingHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(BlockTags.PLANKS)
                .add(BlockRegistry.BLOODWOOD_PLANKS.get())
                .add(BlockRegistry.GHOSTLY_PLANKS.get())
                .add(BlockRegistry.SEEPING_PLANKS.get())
                .add(BlockRegistry.SORBUS_PLANKS.get())
                .add(BlockRegistry.WALNUT_PLANKS.get());

            tag(BlockTags.WOODEN_BUTTONS)
                .add(BlockRegistry.BLOODWOOD_BUTTON.get())
                .add(BlockRegistry.GHOSTLY_BUTTON.get())
                .add(BlockRegistry.SEEPING_BUTTON.get())
                .add(BlockRegistry.SORBUS_BUTTON.get())
                .add(BlockRegistry.WALNUT_BUTTON.get());

            tag(BlockTags.WOODEN_DOORS)
                .add(BlockRegistry.BLOODWOOD_DOOR.get())
                .add(BlockRegistry.GHOSTLY_DOOR.get())
                .add(BlockRegistry.SEEPING_DOOR.get())
                .add(BlockRegistry.SORBUS_DOOR.get())
                .add(BlockRegistry.WALNUT_DOOR.get());

            tag(BlockTags.WOODEN_STAIRS)
                .add(BlockRegistry.BLOODWOOD_STAIRS.get())
                .add(BlockRegistry.GHOSTLY_STAIRS.get())
                .add(BlockRegistry.SEEPING_STAIRS.get())
                .add(BlockRegistry.SORBUS_STAIRS.get())
                .add(BlockRegistry.WALNUT_STAIRS.get());

            tag(BlockTags.WOODEN_SLABS)
                .add(BlockRegistry.BLOODWOOD_SLAB.get())
                .add(BlockRegistry.GHOSTLY_SLAB.get())
                .add(BlockRegistry.SEEPING_SLAB.get())
                .add(BlockRegistry.SORBUS_SLAB.get())
                .add(BlockRegistry.WALNUT_SLAB.get());

            tag(BlockTags.WOODEN_FENCES)
                .add(BlockRegistry.BLOODWOOD_FENCE.get())
                .add(BlockRegistry.GHOSTLY_FENCE.get())
                .add(BlockRegistry.SEEPING_FENCE.get())
                .add(BlockRegistry.SORBUS_FENCE.get())
                .add(BlockRegistry.WALNUT_FENCE.get());

            tag(BlockTags.SAPLINGS)
                .add(BlockRegistry.BLOODWOOD_SAPLING.get())
                .add(BlockRegistry.GHOSTLY_SAPLING.get())
                .add(BlockRegistry.SEEPING_SAPLING.get())
                .add(BlockRegistry.SORBUS_SAPLING.get())
                .add(BlockRegistry.WALNUT_SAPLING.get());

            tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get())
                .add(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get())
                .add(BlockRegistry.SEEPING_PRESSURE_PLATE.get())
                .add(BlockRegistry.SORBUS_PRESSURE_PLATE.get())
                .add(BlockRegistry.WALNUT_PRESSURE_PLATE.get());

            tag(BlockTags.LEAVES)
                .add(BlockRegistry.BLOODWOOD_LEAVES.get())
                .add(BlockRegistry.GHOSTLY_LEAVES.get())
                .add(BlockRegistry.SEEPING_LEAVES.get())
                .add(BlockRegistry.SORBUS_LEAVES.get())
                .add(BlockRegistry.WALNUT_LEAVES.get());

            tag(BlockTags.WOODEN_TRAPDOORS)
                .add(BlockRegistry.BLOODWOOD_TRAPDOOR.get())
                .add(BlockRegistry.GHOSTLY_TRAPDOOR.get())
                .add(BlockRegistry.SEEPING_TRAPDOOR.get())
                .add(BlockRegistry.SORBUS_TRAPDOOR.get())
                .add(BlockRegistry.WALNUT_TRAPDOOR.get());

            tag(BlockTags.FENCE_GATES)
                .add(BlockRegistry.BLOODWOOD_GATE.get())
                .add(BlockRegistry.GHOSTLY_GATE.get())
                .add(BlockRegistry.SEEPING_GATE.get())
                .add(BlockRegistry.SORBUS_GATE.get())
                .add(BlockRegistry.WALNUT_GATE.get());

            tag(BlockTags.DIRT)
                .add(BlockRegistry.BLOODIED_DIRT.get())
                .add(BlockRegistry.BLOODIED_GRASS.get());

            tag(MysteriousTags.MysteriousBlocks.BLOODWOOD_LOGS)
                .add(BlockRegistry.BLOODWOOD_LOG.get())
                .add(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get())
                .add(BlockRegistry.BLOODWOOD_WOOD.get())
                .add(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get());

            tag(MysteriousTags.MysteriousBlocks.GHOSTLY_LOGS)
                .add(BlockRegistry.GHOSTLY_LOG.get())
                .add(BlockRegistry.GHOSTLY_STRIPPED_LOG.get())
                .add(BlockRegistry.GHOSTLY_WOOD.get())
                .add(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get());

            tag(MysteriousTags.MysteriousBlocks.SORBUS_LOGS)
                .add(BlockRegistry.SORBUS_LOG.get())
                .add(BlockRegistry.SORBUS_STRIPPED_LOG.get())
                .add(BlockRegistry.SORBUS_WOOD.get())
                .add(BlockRegistry.SORBUS_STRIPPED_WOOD.get());

            tag(MysteriousTags.MysteriousBlocks.SEEPING_LOGS)
                .add(BlockRegistry.SEEPING_LOG.get())
                .add(BlockRegistry.SEEPING_STRIPPED_LOG.get())
                .add(BlockRegistry.SEEPING_WOOD.get())
                .add(BlockRegistry.SEEPING_STRIPPED_WOOD.get());

            tag(MysteriousTags.MysteriousBlocks.WALNUT_LOGS)
                .add(BlockRegistry.WALNUT_LOG.get())
                .add(BlockRegistry.WALNUT_STRIPPED_LOG.get())
                .add(BlockRegistry.WALNUT_WOOD.get())
                .add(BlockRegistry.WALNUT_STRIPPED_WOOD.get());

            tag(BlockTags.LOGS_THAT_BURN)
                .addTag(MysteriousTags.MysteriousBlocks.BLOODWOOD_LOGS)
                .addTag(MysteriousTags.MysteriousBlocks.GHOSTLY_LOGS)
                .addTag(MysteriousTags.MysteriousBlocks.SORBUS_LOGS)
                .addTag(MysteriousTags.MysteriousBlocks.SEEPING_LOGS)
                .addTag(MysteriousTags.MysteriousBlocks.WALNUT_LOGS);

            tag(MysteriousTags.MysteriousBlocks.SIGNS)
                .add(BlockRegistry.BLOODWOOD_WALL_SIGN.get())
                .add(BlockRegistry.GHOSTLY_WALL_SIGN.get())
                .add(BlockRegistry.SEEPING_WALL_SIGN.get())
                .add(BlockRegistry.SORBUS_WALL_SIGN.get())
                .add(BlockRegistry.WALNUT_WALL_SIGN.get())
                .add(BlockRegistry.BLOODWOOD_FLOOR_SIGN.get())
                .add(BlockRegistry.GHOSTLY_FLOOR_SIGN.get())
                .add(BlockRegistry.SEEPING_FLOOR_SIGN.get())
                .add(BlockRegistry.SORBUS_FLOOR_SIGN.get())
                .add(BlockRegistry.WALNUT_FLOOR_SIGN.get());

            tag(MysteriousTags.MysteriousBlocks.HANGING_SIGNS)
                .add(BlockRegistry.BLOODWOOD_HANGING_SIGN.get())
                .add(BlockRegistry.GHOSTLY_HANGING_SIGN.get())
                .add(BlockRegistry.SEEPING_HANGING_SIGN.get())
                .add(BlockRegistry.SORBUS_HANGING_SIGN.get())
                .add(BlockRegistry.WALNUT_HANGING_SIGN.get())
                .add(BlockRegistry.BLOODWOOD_WALL_HANGING_SIGN.get())
                .add(BlockRegistry.GHOSTLY_WALL_HANGING_SIGN.get())
                .add(BlockRegistry.SEEPING_WALL_HANGING_SIGN.get())
                .add(BlockRegistry.SORBUS_WALL_HANGING_SIGN.get())
                .add(BlockRegistry.WALNUT_WALL_HANGING_SIGN.get());

            tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(MysteriousTags.MysteriousBlocks.SIGNS)
                .addTag(MysteriousTags.MysteriousBlocks.HANGING_SIGNS);

            tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockRegistry.BLOODIED_DIRT.get())
                .add(BlockRegistry.BLOODIED_GRASS.get());
        }
    }
}
