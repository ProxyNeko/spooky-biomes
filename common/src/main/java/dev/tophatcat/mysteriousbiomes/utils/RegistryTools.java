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
package dev.tophatcat.mysteriousbiomes.utils;

import com.google.common.base.Suppliers;
import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

/**
 * A collection of methods or tools I use to help clean up code duplication and make things easier to set up.
 * The first 7 "register" methods are used to help register things to the game.
 * The rest of "make" methods are to help make things.
 */
public final class RegistryTools {

    /**
     * Helper method for registering block entities.
     * @param id The block entities registry name.
     * @param blockEntity the block entity to be registered.
     */
    public static <T extends BlockEntity> Supplier<BlockEntityType<T>> registerBlockEntity(String id, Supplier<BlockEntityType<T>> blockEntity) {
        return MysteriousCommon.COMMON_PLATFORM.registerBlockEntity(id, blockEntity);
    }

    /**
     * Helper method for registering blocks.
     * @param id the blocks registry name.
     * @param block The block to be registered.
     */
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block) {
        return MysteriousCommon.COMMON_PLATFORM.registerBlock(id, block);
    }

    /**
     * Helper method for registering entities.
     * @param name The entities registry name.
     * @param entity The entity to be registered.
     * @param width The width of the mobs hit box.
     * @param height The height of the mobs hit box.
     * @param category The category the mob belongs to.
     */
    public static <T extends Mob> Supplier<EntityType<T>> registerEntity(
        String name, EntityType.EntityFactory<T> entity, float width, float height, MobCategory category) {
        return MysteriousCommon.COMMON_PLATFORM.registerEntity(name, () -> EntityType.Builder.of(
            entity, category).sized(width, height).build(name));
    }

    /**
     * Helper method for registering items.
     * @param id The items registry name.
     * @param item The item to be registered with optional properties.
     */
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return MysteriousCommon.COMMON_PLATFORM.registerItem(id, item);
    }

    /**
     * Helper method for registering sounds.
     * @param id The sounds registry name.
     * @param sound The sound to be registered.
     */
    public static <T extends SoundEvent> Supplier<T> registerSound(String id, Supplier<T> sound) {
        return MysteriousCommon.COMMON_PLATFORM.registerSound(id, sound);
    }

    /**
     * Helper method for registering creative tabs.
     * @param id The name of the creative tab.
     * @param tab The creative tab to be registered.
     */
    public static <T extends CreativeModeTab> Supplier<T> registerCreativeTab(String id, Supplier<T> tab) {
        return MysteriousCommon.COMMON_PLATFORM.registerCreativeTab(id, tab);
    }

    /**
     * Helper method for registering spawn eggs for entities.
     * You can use this website to help find colors for the egg: http://tslat.net/minitools/colourpicker/index.html
     * @param entityType The entity to register a spawn egg for.
     * @param primaryColor Primary egg color.
     * @param secondaryColor Secondary egg color.
     * @param properties The item to be registered with optional properties.
     */
    public static <E extends Mob> Supplier<SpawnEggItem> registerSpawnEggItem(
        Supplier<EntityType<E>> entityType, int primaryColor, int secondaryColor, Item.Properties properties) {
        return MysteriousCommon.COMMON_PLATFORM.registerSpawnEggItem(entityType, primaryColor, secondaryColor, properties);
    }

    /**
     * A helper method to create pillar like blocks, logs, stripped logs, columns and so on.
     * @param name The name of the block being registered.
     */
    public static Supplier<RotatedPillarBlock> createPillarBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new RotatedPillarBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))));
    }

    /**
     * A helper method to create wooden plank type blocks.
     * @param name The name of the planks being registered.
     */
    public static Supplier<Block> createPlanksBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS))));
    }

    /**
     * A helper method to create stair blocks.
     * @param name The name of the stairs being registered.
     * @param blockState The default block state of the planks that these stairs are to be made of.
     */
    public static Supplier<StairBlock> createStairsBlock(String name, Supplier<BlockState> blockState) {
        return registerBlock(name, Suppliers.memoize(() -> new StairBlock(blockState.get(),
            Block.Properties.ofFullCopy(Blocks.OAK_STAIRS))));
    }

    /**
     * A helper method to create leaf blocks.
     * @param name The name of the leaves being registered.
     */
    public static Supplier<Block> createLeavesBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new LeavesBlock(
            Block.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    }

    /**
     * A helper method to create slab blocks.
     * @param name The name of the slabs being registered.
     */
    public static Supplier<SlabBlock> createSlabBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new SlabBlock(
            Block.Properties.ofFullCopy(Blocks.OAK_SLAB))));
    }

    /**
     * A helper method to create fence blocks.
     * @param name The name of the fence being registered.
     */
    public static Supplier<FenceBlock> createFenceBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new FenceBlock(
            Block.Properties.ofFullCopy(Blocks.OAK_FENCE))));
    }

    /**
     * A helper method to create fence gates.
     * @param name The name of the gate being registered.
     */
    public static Supplier<FenceGateBlock> createGateBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new FenceGateBlock(
            WoodType.OAK, Block.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))));
    }

    /**
     * A helper method to create buttons.
     * @param name The name of the button being registered.
     */
    public static Supplier<ButtonBlock> createButtonBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new ButtonBlock(
            BlockSetType.OAK, 30, Block.Properties.ofFullCopy(Blocks.OAK_BUTTON))));
    }

    /**
     * A helper method to create pressure plates.
     * @param name The name of the pressure plates being registered.
     */
    public static Supplier<PressurePlateBlock> createPressurePlateBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new PressurePlateBlock(
            BlockSetType.OAK, Block.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))));
    }

    /**
     * A helper method to create trap doors.
     * @param name The name of the trap door being registered.
     */
    public static Supplier<TrapDoorBlock> createTrapdoorBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new TrapDoorBlock(
            BlockSetType.OAK, Block.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR))));
    }

    /**
     * A helper method to create doors.
     * @param name The name of the door being registered.
     */
    public static Supplier<DoorBlock> createDoorBlock(String name) {
        return registerBlock(name, Suppliers.memoize(() -> new DoorBlock(BlockSetType.OAK,
            Block.Properties.ofFullCopy(Blocks.OAK_DOOR).strength(3.0F)
                .noOcclusion().ignitedByLava())));
    }

    /**
     * A helper method to create saplings.
     * @param name The name of the sapling being registered.
     * @param generator the {@link TreeGrower} to be used to grow trees.
     */
    public static Supplier<SaplingBlock> createSaplingBlock(String name, TreeGrower generator) {
        return registerBlock(name, Suppliers.memoize(() -> new SaplingBlock(generator,
            Block.Properties.ofFullCopy(Blocks.OAK_SAPLING))));
    }







    //The rest of these methods are all older helper methods to be refactored or removed.
    public static Supplier<SignItem> makeSignItem(
        String name,
        Supplier<StandingSignBlock> signBlock,
        Supplier<WallSignBlock> wallSignBlock) {
        return registerItem(name, Suppliers.memoize(() -> new SignItem(new Item.Properties()
            .stacksTo(16), signBlock.get(), wallSignBlock.get())));
    }

    public static Supplier<StandingSignBlock> makeFloorSignBlock(
        String name,
        WoodType signType) {
        return registerBlock(name, Suppliers.memoize(() -> new StandingSignBlock(
            signType, Block.Properties.ofFullCopy(Blocks.OAK_SIGN))));
    }

    public static Supplier<WallSignBlock> makeWallSignBlock(
        String name,
        WoodType signType) {
        return registerBlock(name, Suppliers.memoize(() -> new WallSignBlock(
            signType, Block.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN))));
    }

    public static Supplier<HangingSignItem> makeHangingSignItem(String name,
        Supplier<CeilingHangingSignBlock> hangingSignBlock, Supplier<WallHangingSignBlock> wallHangingSignBlock) {
        return registerItem(name, Suppliers.memoize(() -> new HangingSignItem(hangingSignBlock.get(),
            wallHangingSignBlock.get(), new Item.Properties().stacksTo(16))));
    }

    public static Supplier<CeilingHangingSignBlock> makeHangingSignBlock(String name, WoodType signType) {
        return registerBlock(name, Suppliers.memoize(() -> new CeilingHangingSignBlock(
            signType, Block.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN))));
    }

    public static Supplier<WallHangingSignBlock> makeWallHangingSignBlock(String name, WoodType signType) {
        return registerBlock(name, Suppliers.memoize(() -> new WallHangingSignBlock(
            signType, Block.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN))));
    }
}
