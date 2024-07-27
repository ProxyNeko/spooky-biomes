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
package dev.tophatcat.mysteriousbiomes.blocks;

import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

public class BloodiedGrass extends GrassBlock {

    public BloodiedGrass() {
        super(Properties.of().strength(0.5F).sound(SoundType.WET_GRASS).randomTicks());
    }

    public static boolean canBeGrass(
        final BlockState state, final ServerLevel world, final BlockPos pos) {
        final BlockPos blockpos = pos.above();
        final BlockState blockstate = world.getBlockState(blockpos);

        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else {
            if (blockstate.getFluidState().getAmount() == 8) {
                return false;
            } else {
                int i =
                    LightEngine.getLightBlockInto(
                        world,
                        state,
                        pos,
                        blockstate,
                        blockpos,
                        Direction.UP,
                        blockstate.getLightBlock(world, blockpos));
                return i < world.getMaxLightLevel();
            }
        }
    }

    public static boolean canPropagate(BlockState blockStateIn, ServerLevel world, BlockPos pos) {
        BlockPos blockpos = pos.above();
        return canBeGrass(blockStateIn, world, pos)
            && !world.getFluidState(blockpos).is(FluidTags.WATER);
    }

    /**
     * Every tick, it'll attempt to spread bloodied grass onto dirt. If covered, will turn into
     * bloodied dirt.
     */
    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!world.isClientSide) {
            if (!world.hasChunk(SectionPos.of(pos).getX(), SectionPos.of(pos).getZ())) {
                // Prevent loading unloaded chunks when checking neighbor's light and spreading.
                return;
            }

            if (!canBeGrass(state, world, pos)) {
                // Block is covered, turn it into bloodied dirt.
                world.setBlockAndUpdate(pos, BlockRegistry.BLOODIED_DIRT.get().defaultBlockState());
            } else {
                if (world.getMaxLocalRawBrightness(pos.above()) >= 9) {
                    // Attempt to spread grass onto neighboring bloodied dirt.
                    BlockState replacementBlock = BlockRegistry.BLOODIED_GRASS.get().defaultBlockState();

                    for (int i = 0; i < 4; ++i) {
                        BlockPos blockpos =
                            pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);

                        if (world.getBlockState(blockpos).getBlock() == BlockRegistry.BLOODIED_DIRT.get()
                            && canPropagate(replacementBlock, world, blockpos)) {
                            world.setBlockAndUpdate(
                                blockpos,
                                replacementBlock.setValue(
                                    SNOWY, world.getBlockState(blockpos.above()).getBlock() == Blocks.SNOW));
                        }
                    }
                }
            }
        }
    }
}
