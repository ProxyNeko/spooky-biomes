package dev.tophatcat.mysteriousbiomes.registries;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class CreativeTabRegistry {

    public static void init() {
        MysteriousCommon.LOG.debug("Registering creative tabs...");
    }

    public static final Supplier<CreativeModeTab> MYSTERIOUS_TAB = MysteriousCommon.COMMON_PLATFORM.registerCreativeTab(
        "mysterious_tab", () -> MysteriousCommon.COMMON_PLATFORM.newCreativeTabBuilder()
        .title(Component.translatable("item_group." + MysteriousCommon.MOD_ID + ".mysterious_tab"))
        .icon(() -> new ItemStack(ItemRegistry.GHOSTLY_SAPLING.get()))
        .displayItems((enabledFeatures, entries) -> {
            // Logs
            entries.accept(ItemRegistry.BLOODWOOD_LOG.get());
            entries.accept(ItemRegistry.GHOSTLY_LOG.get());
            entries.accept(ItemRegistry.SEEPING_LOG.get());
            entries.accept(ItemRegistry.SORBUS_LOG.get());
            entries.accept(ItemRegistry.WALNUT_LOG.get());

            // Stripped logs
            entries.accept(ItemRegistry.BLOODWOOD_STRIPPED_LOG.get());
            entries.accept(ItemRegistry.GHOSTLY_STRIPPED_LOG.get());
            entries.accept(ItemRegistry.SEEPING_STRIPPED_LOG.get());
            entries.accept(ItemRegistry.SORBUS_STRIPPED_LOG.get());
            entries.accept(ItemRegistry.WALNUT_STRIPPED_LOG.get());

            // Woods
            entries.accept(ItemRegistry.BLOODWOOD_WOOD.get());
            entries.accept(ItemRegistry.GHOSTLY_WOOD.get());
            entries.accept(ItemRegistry.SEEPING_WOOD.get());
            entries.accept(ItemRegistry.SORBUS_WOOD.get());
            entries.accept(ItemRegistry.WALNUT_WOOD.get());

            // Stripped woods
            entries.accept(ItemRegistry.BLOODWOOD_STRIPPED_WOOD.get());
            entries.accept(ItemRegistry.GHOSTLY_STRIPPED_WOOD.get());
            entries.accept(ItemRegistry.SEEPING_STRIPPED_WOOD.get());
            entries.accept(ItemRegistry.SORBUS_STRIPPED_WOOD.get());
            entries.accept(ItemRegistry.WALNUT_STRIPPED_WOOD.get());

            // Planks
            entries.accept(ItemRegistry.BLOODWOOD_PLANKS.get());
            entries.accept(ItemRegistry.GHOSTLY_PLANKS.get());
            entries.accept(ItemRegistry.SEEPING_PLANKS.get());
            entries.accept(ItemRegistry.SORBUS_PLANKS.get());
            entries.accept(ItemRegistry.WALNUT_PLANKS.get());

            // Stairs
            entries.accept(ItemRegistry.BLOODWOOD_STAIRS.get());
            entries.accept(ItemRegistry.GHOSTLY_STAIRS.get());
            entries.accept(ItemRegistry.SEEPING_STAIRS.get());
            entries.accept(ItemRegistry.SORBUS_STAIRS.get());
            entries.accept(ItemRegistry.WALNUT_STAIRS.get());

            // Leaves
            entries.accept(ItemRegistry.BLOODWOOD_LEAVES.get());
            entries.accept(ItemRegistry.GHOSTLY_LEAVES.get());
            entries.accept(ItemRegistry.SEEPING_LEAVES.get());
            entries.accept(ItemRegistry.SORBUS_LEAVES.get());
            entries.accept(ItemRegistry.WALNUT_LEAVES.get());

            // Slabs
            entries.accept(ItemRegistry.BLOODWOOD_SLAB.get());
            entries.accept(ItemRegistry.GHOSTLY_SLAB.get());
            entries.accept(ItemRegistry.SEEPING_SLAB.get());
            entries.accept(ItemRegistry.SORBUS_SLAB.get());
            entries.accept(ItemRegistry.WALNUT_SLAB.get());

            // Fences
            entries.accept(ItemRegistry.BLOODWOOD_FENCE.get());
            entries.accept(ItemRegistry.GHOSTLY_FENCE.get());
            entries.accept(ItemRegistry.SEEPING_FENCE.get());
            entries.accept(ItemRegistry.SORBUS_FENCE.get());
            entries.accept(ItemRegistry.WALNUT_FENCE.get());

            // Gates
            entries.accept(ItemRegistry.BLOODWOOD_GATE.get());
            entries.accept(ItemRegistry.GHOSTLY_GATE.get());
            entries.accept(ItemRegistry.SEEPING_GATE.get());
            entries.accept(ItemRegistry.SORBUS_GATE.get());
            entries.accept(ItemRegistry.WALNUT_GATE.get());

            // Buttons
            entries.accept(ItemRegistry.BLOODWOOD_BUTTON.get());
            entries.accept(ItemRegistry.GHOSTLY_BUTTON.get());
            entries.accept(ItemRegistry.SEEPING_BUTTON.get());
            entries.accept(ItemRegistry.SORBUS_BUTTON.get());
            entries.accept(ItemRegistry.WALNUT_BUTTON.get());

            // Pressure plates
            entries.accept(ItemRegistry.BLOODWOOD_PRESSURE_PLATE.get());
            entries.accept(ItemRegistry.GHOSTLY_PRESSURE_PLATE.get());
            entries.accept(ItemRegistry.SEEPING_PRESSURE_PLATE.get());
            entries.accept(ItemRegistry.SORBUS_PRESSURE_PLATE.get());
            entries.accept(ItemRegistry.WALNUT_PRESSURE_PLATE.get());

            // Trapdoor
            entries.accept(ItemRegistry.BLOODWOOD_TRAPDOOR.get());
            entries.accept(ItemRegistry.GHOSTLY_TRAPDOOR.get());
            entries.accept(ItemRegistry.SEEPING_TRAPDOOR.get());
            entries.accept(ItemRegistry.SORBUS_TRAPDOOR.get());
            entries.accept(ItemRegistry.WALNUT_TRAPDOOR.get());

            // Door
            entries.accept(ItemRegistry.BLOODWOOD_DOOR.get());
            entries.accept(ItemRegistry.GHOSTLY_DOOR.get());
            entries.accept(ItemRegistry.SEEPING_DOOR.get());
            entries.accept(ItemRegistry.SORBUS_DOOR.get());
            entries.accept(ItemRegistry.WALNUT_DOOR.get());

            // Saplings
            entries.accept(ItemRegistry.BLOODWOOD_SAPLING.get());
            entries.accept(ItemRegistry.GHOSTLY_SAPLING.get());
            entries.accept(ItemRegistry.SEEPING_SAPLING.get());
            entries.accept(ItemRegistry.SORBUS_SAPLING.get());
            entries.accept(ItemRegistry.WALNUT_SAPLING.get());

            // Signs
            entries.accept(ItemRegistry.BLOODWOOD_SIGN.get());
            entries.accept(ItemRegistry.GHOSTLY_SIGN.get());
            entries.accept(ItemRegistry.SEEPING_SIGN.get());
            entries.accept(ItemRegistry.SORBUS_SIGN.get());
            entries.accept(ItemRegistry.WALNUT_SIGN.get());

            // Hanging Signs
            entries.accept(ItemRegistry.BLOODWOOD_HANGING_SIGN.get());
            entries.accept(ItemRegistry.GHOSTLY_HANGING_SIGN.get());
            entries.accept(ItemRegistry.SEEPING_HANGING_SIGN.get());
            entries.accept(ItemRegistry.SORBUS_HANGING_SIGN.get());
            entries.accept(ItemRegistry.WALNUT_HANGING_SIGN.get());

            // Mob eggs
            entries.accept(ItemRegistry.THE_FORGOTTEN_WARLOCK_SPAWN_EGG.get());

            // Dirt/Grass
            entries.accept(ItemRegistry.BLOODIED_DIRT.get());
            entries.accept(ItemRegistry.BLOODIED_GRASS.get());
        })
        .build());
}
