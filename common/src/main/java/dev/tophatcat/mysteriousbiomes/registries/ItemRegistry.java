package dev.tophatcat.mysteriousbiomes.registries;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.utils.RegistryTools;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

public class ItemRegistry {

    public static void init() {
        MysteriousCommon.LOG.debug("Registering items...");
    }

    //Spawn eggs
    public static final Supplier<SpawnEggItem> THE_FORGOTTEN_WARLOCK_SPAWN_EGG = RegistryTools.registerItem(
        "the_forgotten_warlock_spawn_egg", MysteriousCommon.COMMON_PLATFORM.registerSpawnEggItem(
        EntityRegistry.THE_FORGOTTEN_WARLOCK, 0x00127A, 0x702700, new SpawnEggItem.Properties()));

    //Grass
    public static final Supplier<Item> BLOODIED_GRASS = RegistryTools.registerItem(
        "bloodied_grass", () -> new BlockItem(BlockRegistry.BLOODIED_GRASS.get(), new Item.Properties()));
    public static final Supplier<Item> BLOODIED_DIRT = RegistryTools.registerItem(
        "bloodied_dirt", () -> new BlockItem(BlockRegistry.BLOODIED_DIRT.get(), new Item.Properties()));

    // Logs
    public static final Supplier<Item> BLOODWOOD_LOG = RegistryTools.registerItem("bloodwood_log",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_LOG = RegistryTools.registerItem("ghostly_log",
        () -> new BlockItem(BlockRegistry.GHOSTLY_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_LOG = RegistryTools.registerItem("seeping_log",
        () -> new BlockItem(BlockRegistry.SEEPING_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_LOG = RegistryTools.registerItem("sorbus_log",
        () -> new BlockItem(BlockRegistry.SORBUS_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_LOG = RegistryTools.registerItem("walnut_log",
        () -> new BlockItem(BlockRegistry.WALNUT_LOG.get(), new Item.Properties()));

    // Stripped logs
    public static final Supplier<Item> BLOODWOOD_STRIPPED_LOG = RegistryTools.registerItem("bloodwood_stripped_log",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_STRIPPED_LOG = RegistryTools.registerItem("ghostly_stripped_log",
        () -> new BlockItem(BlockRegistry.GHOSTLY_STRIPPED_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_STRIPPED_LOG = RegistryTools.registerItem("seeping_stripped_log",
        () -> new BlockItem(BlockRegistry.SEEPING_STRIPPED_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_STRIPPED_LOG = RegistryTools.registerItem("sorbus_stripped_log",
        () -> new BlockItem(BlockRegistry.SORBUS_STRIPPED_LOG.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_STRIPPED_LOG = RegistryTools.registerItem("walnut_stripped_log",
        () -> new BlockItem(BlockRegistry.WALNUT_STRIPPED_LOG.get(), new Item.Properties()));

    // Woods
    public static final Supplier<Item> BLOODWOOD_WOOD = RegistryTools.registerItem("bloodwood_wood",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_WOOD = RegistryTools.registerItem("ghostly_wood",
        () -> new BlockItem(BlockRegistry.GHOSTLY_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_WOOD = RegistryTools.registerItem("seeping_wood",
        () -> new BlockItem(BlockRegistry.SEEPING_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_WOOD = RegistryTools.registerItem("sorbus_wood",
        () -> new BlockItem(BlockRegistry.SORBUS_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_WOOD = RegistryTools.registerItem("walnut_wood",
        () -> new BlockItem(BlockRegistry.WALNUT_WOOD.get(), new Item.Properties()));

    //Stripped woods
    public static final Supplier<Item> BLOODWOOD_STRIPPED_WOOD = RegistryTools.registerItem("bloodwood_stripped_wood",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_STRIPPED_WOOD = RegistryTools.registerItem("ghostly_stripped_wood",
        () -> new BlockItem(BlockRegistry.GHOSTLY_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_STRIPPED_WOOD = RegistryTools.registerItem("seeping_stripped_wood",
        () -> new BlockItem(BlockRegistry.SEEPING_STRIPPED_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_STRIPPED_WOOD = RegistryTools.registerItem("sorbus_stripped_wood",
        () -> new BlockItem(BlockRegistry.SORBUS_STRIPPED_WOOD.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_STRIPPED_WOOD = RegistryTools.registerItem("walnut_stripped_wood",
        () -> new BlockItem(BlockRegistry.WALNUT_STRIPPED_WOOD.get(), new Item.Properties()));

    // Planks
    public static final Supplier<Item> BLOODWOOD_PLANKS = RegistryTools.registerItem("bloodwood_planks",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_PLANKS.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_PLANKS = RegistryTools.registerItem("ghostly_planks",
        () -> new BlockItem(BlockRegistry.GHOSTLY_PLANKS.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_PLANKS = RegistryTools.registerItem("seeping_planks",
        () -> new BlockItem(BlockRegistry.SEEPING_PLANKS.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_PLANKS = RegistryTools.registerItem("sorbus_planks",
        () -> new BlockItem(BlockRegistry.SORBUS_PLANKS.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_PLANKS = RegistryTools.registerItem("walnut_planks",
        () -> new BlockItem(BlockRegistry.WALNUT_PLANKS.get(), new Item.Properties()));

    // Stairs
    public static final Supplier<Item> BLOODWOOD_STAIRS = RegistryTools.registerItem("bloodwood_stairs",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_STAIRS.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_STAIRS = RegistryTools.registerItem("ghostly_stairs",
        () -> new BlockItem(BlockRegistry.GHOSTLY_STAIRS.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_STAIRS = RegistryTools.registerItem("seeping_stairs",
        () -> new BlockItem(BlockRegistry.SEEPING_STAIRS.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_STAIRS = RegistryTools.registerItem("sorbus_stairs",
        () -> new BlockItem(BlockRegistry.SORBUS_STAIRS.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_STAIRS = RegistryTools.registerItem("walnut_stairs",
        () -> new BlockItem(BlockRegistry.WALNUT_STAIRS.get(), new Item.Properties()));

    // Leaves
    public static final Supplier<Item> BLOODWOOD_LEAVES = RegistryTools.registerItem("bloodwood_leaves",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_LEAVES.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_LEAVES = RegistryTools.registerItem("ghostly_leaves",
        () -> new BlockItem(BlockRegistry.GHOSTLY_LEAVES.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_LEAVES = RegistryTools.registerItem("seeping_leaves",
        () -> new BlockItem(BlockRegistry.SEEPING_LEAVES.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_LEAVES = RegistryTools.registerItem("sorbus_leaves",
        () -> new BlockItem(BlockRegistry.SORBUS_LEAVES.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_LEAVES = RegistryTools.registerItem("walnut_leaves",
        () -> new BlockItem(BlockRegistry.WALNUT_LEAVES.get(), new Item.Properties()));

    // Slabs
    public static final Supplier<Item> BLOODWOOD_SLAB = RegistryTools.registerItem("bloodwood_slab",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_SLAB.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_SLAB = RegistryTools.registerItem("ghostly_slab",
        () -> new BlockItem(BlockRegistry.GHOSTLY_SLAB.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_SLAB = RegistryTools.registerItem("seeping_slab",
        () -> new BlockItem(BlockRegistry.SEEPING_SLAB.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_SLAB = RegistryTools.registerItem("sorbus_slab",
        () -> new BlockItem(BlockRegistry.SORBUS_SLAB.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_SLAB = RegistryTools.registerItem("walnut_slab",
        () -> new BlockItem(BlockRegistry.WALNUT_SLAB.get(), new Item.Properties()));

    // Fences
    public static final Supplier<Item> BLOODWOOD_FENCE = RegistryTools.registerItem("bloodwood_fence",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_FENCE.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_FENCE = RegistryTools.registerItem("ghostly_fence",
        () -> new BlockItem(BlockRegistry.GHOSTLY_FENCE.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_FENCE = RegistryTools.registerItem("seeping_fence",
        () -> new BlockItem(BlockRegistry.SEEPING_FENCE.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_FENCE = RegistryTools.registerItem("sorbus_fence",
        () -> new BlockItem(BlockRegistry.SORBUS_FENCE.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_FENCE = RegistryTools.registerItem("walnut_fence",
        () -> new BlockItem(BlockRegistry.WALNUT_FENCE.get(), new Item.Properties()));

    // Gates
    public static final Supplier<Item> BLOODWOOD_GATE = RegistryTools.registerItem("bloodwood_gate",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_GATE.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_GATE = RegistryTools.registerItem("ghostly_gate",
        () -> new BlockItem(BlockRegistry.GHOSTLY_GATE.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_GATE = RegistryTools.registerItem("seeping_gate",
        () -> new BlockItem(BlockRegistry.SEEPING_GATE.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_GATE = RegistryTools.registerItem("sorbus_gate",
        () -> new BlockItem(BlockRegistry.SORBUS_GATE.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_GATE = RegistryTools.registerItem("walnut_gate",
        () -> new BlockItem(BlockRegistry.WALNUT_GATE.get(), new Item.Properties()));

    // Buttons
    public static final Supplier<Item> BLOODWOOD_BUTTON = RegistryTools.registerItem("bloodwood_button",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_BUTTON.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_BUTTON = RegistryTools.registerItem("ghostly_button",
        () -> new BlockItem(BlockRegistry.GHOSTLY_BUTTON.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_BUTTON = RegistryTools.registerItem("seeping_button",
        () -> new BlockItem(BlockRegistry.SEEPING_BUTTON.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_BUTTON = RegistryTools.registerItem("sorbus_button",
        () -> new BlockItem(BlockRegistry.SORBUS_BUTTON.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_BUTTON = RegistryTools.registerItem("walnut_button",
        () -> new BlockItem(BlockRegistry.WALNUT_BUTTON.get(), new Item.Properties()));

    // Pressure plates
    public static final Supplier<Item> BLOODWOOD_PRESSURE_PLATE = RegistryTools.registerItem("bloodwood_pressure_plate",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_PRESSURE_PLATE = RegistryTools.registerItem("ghostly_pressure_plate",
        () -> new BlockItem(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_PRESSURE_PLATE = RegistryTools.registerItem("seeping_pressure_plate",
        () -> new BlockItem(BlockRegistry.SEEPING_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_PRESSURE_PLATE = RegistryTools.registerItem("sorbus_pressure_plate",
        () -> new BlockItem(BlockRegistry.SORBUS_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_PRESSURE_PLATE = RegistryTools.registerItem("walnut_pressure_plate",
        () -> new BlockItem(BlockRegistry.WALNUT_PRESSURE_PLATE.get(), new Item.Properties()));

    // Trapdoors
    public static final Supplier<Item> BLOODWOOD_TRAPDOOR = RegistryTools.registerItem("bloodwood_trapdoor",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_TRAPDOOR = RegistryTools.registerItem("ghostly_trapdoor",
        () -> new BlockItem(BlockRegistry.GHOSTLY_TRAPDOOR.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_TRAPDOOR = RegistryTools.registerItem("seeping_trapdoor",
        () -> new BlockItem(BlockRegistry.SEEPING_TRAPDOOR.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_TRAPDOOR = RegistryTools.registerItem("sorbus_trapdoor",
        () -> new BlockItem(BlockRegistry.SORBUS_TRAPDOOR.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_TRAPDOOR = RegistryTools.registerItem("walnut_trapdoor",
        () -> new BlockItem(BlockRegistry.WALNUT_TRAPDOOR.get(), new Item.Properties()));

    // Doors
    public static final Supplier<Item> BLOODWOOD_DOOR = RegistryTools.registerItem("bloodwood_door",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_DOOR.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_DOOR = RegistryTools.registerItem("ghostly_door",
        () -> new BlockItem(BlockRegistry.GHOSTLY_DOOR.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_DOOR = RegistryTools.registerItem("seeping_door",
        () -> new BlockItem(BlockRegistry.SEEPING_DOOR.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_DOOR = RegistryTools.registerItem("sorbus_door",
        () -> new BlockItem(BlockRegistry.SORBUS_DOOR.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_DOOR = RegistryTools.registerItem("walnut_door",
        () -> new BlockItem(BlockRegistry.WALNUT_DOOR.get(), new Item.Properties()));

    // Saplings
    public static final Supplier<Item> BLOODWOOD_SAPLING = RegistryTools.registerItem("bloodwood_sapling",
        () -> new BlockItem(BlockRegistry.BLOODWOOD_SAPLING.get(), new Item.Properties()));
    public static final Supplier<Item> GHOSTLY_SAPLING = RegistryTools.registerItem("ghostly_sapling",
        () -> new BlockItem(BlockRegistry.GHOSTLY_SAPLING.get(), new Item.Properties()));
    public static final Supplier<Item> SEEPING_SAPLING = RegistryTools.registerItem("seeping_sapling",
        () -> new BlockItem(BlockRegistry.SEEPING_SAPLING.get(), new Item.Properties()));
    public static final Supplier<Item> SORBUS_SAPLING = RegistryTools.registerItem("sorbus_sapling",
        () -> new BlockItem(BlockRegistry.SORBUS_SAPLING.get(), new Item.Properties()));
    public static final Supplier<Item> WALNUT_SAPLING = RegistryTools.registerItem("walnut_sapling",
        () -> new BlockItem(BlockRegistry.WALNUT_SAPLING.get(), new Item.Properties()));

    // Sign items
    public static final Supplier<SignItem> BLOODWOOD_SIGN = RegistryTools.createSign(
        "bloodwood_sign", BlockRegistry.BLOODWOOD_FLOOR_SIGN, BlockRegistry.BLOODWOOD_WALL_SIGN);
    public static final Supplier<SignItem> GHOSTLY_SIGN = RegistryTools.createSign(
        "ghostly_sign", BlockRegistry.GHOSTLY_FLOOR_SIGN, BlockRegistry.GHOSTLY_WALL_SIGN);
    public static final Supplier<SignItem> SEEPING_SIGN = RegistryTools.createSign(
        "seeping_sign", BlockRegistry.SEEPING_FLOOR_SIGN, BlockRegistry.SEEPING_WALL_SIGN);
    public static final Supplier<SignItem> SORBUS_SIGN = RegistryTools.createSign(
        "sorbus_sign", BlockRegistry.SORBUS_FLOOR_SIGN, BlockRegistry.SORBUS_WALL_SIGN);
    public static final Supplier<SignItem> WALNUT_SIGN = RegistryTools.createSign(
        "walnut_sign", BlockRegistry.WALNUT_FLOOR_SIGN, BlockRegistry.WALNUT_WALL_SIGN);

    // Hanging sign items
    public static final Supplier<HangingSignItem> BLOODWOOD_HANGING_SIGN = RegistryTools.createHangingSign(
        "bloodwood_hanging_sign", BlockRegistry.BLOODWOOD_HANGING_SIGN, BlockRegistry.BLOODWOOD_WALL_HANGING_SIGN);
    public static final Supplier<HangingSignItem> GHOSTLY_HANGING_SIGN = RegistryTools.createHangingSign(
        "ghostly_hanging_sign", BlockRegistry.GHOSTLY_HANGING_SIGN, BlockRegistry.GHOSTLY_WALL_HANGING_SIGN);
    public static final Supplier<HangingSignItem> SEEPING_HANGING_SIGN = RegistryTools.createHangingSign(
        "seeping_hanging_sign", BlockRegistry.SEEPING_HANGING_SIGN, BlockRegistry.SEEPING_WALL_HANGING_SIGN);
    public static final Supplier<HangingSignItem> SORBUS_HANGING_SIGN = RegistryTools.createHangingSign(
        "sorbus_hanging_sign", BlockRegistry.SORBUS_HANGING_SIGN, BlockRegistry.SORBUS_WALL_HANGING_SIGN);
    public static final Supplier<HangingSignItem> WALNUT_HANGING_SIGN = RegistryTools.createHangingSign(
        "walnut_hanging_sign", BlockRegistry.WALNUT_HANGING_SIGN, BlockRegistry.WALNUT_WALL_HANGING_SIGN);
}
