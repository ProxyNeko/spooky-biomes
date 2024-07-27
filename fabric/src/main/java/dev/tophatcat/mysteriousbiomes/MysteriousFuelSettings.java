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

import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import dev.tophatcat.mysteriousbiomes.registries.ItemRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class MysteriousFuelSettings {

    public MysteriousFuelSettings() {
        init();
    }

    private static void init() {
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_PLANKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_STAIRS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_SLAB.get(), 150);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_TRAPDOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_FENCE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_GATE.get(), 300);
        FuelRegistry.INSTANCE.add(ItemRegistry.BLOODWOOD_SIGN.get(), 200);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_HANGING_SIGN.get(), 800);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_BUTTON.get(), 100);
        FuelRegistry.INSTANCE.add(BlockRegistry.BLOODWOOD_SAPLING.get(), 100);

        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_STRIPPED_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_PLANKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_STAIRS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_SLAB.get(), 150);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_TRAPDOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_FENCE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_GATE.get(), 300);
        FuelRegistry.INSTANCE.add(ItemRegistry.GHOSTLY_SIGN.get(), 200);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_HANGING_SIGN.get(), 800);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_BUTTON.get(), 100);
        FuelRegistry.INSTANCE.add(BlockRegistry.GHOSTLY_SAPLING.get(), 100);

        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_STRIPPED_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_STRIPPED_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_PLANKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_STAIRS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_SLAB.get(), 150);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_TRAPDOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_PRESSURE_PLATE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_FENCE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_GATE.get(), 300);
        FuelRegistry.INSTANCE.add(ItemRegistry.SEEPING_SIGN.get(), 200);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_HANGING_SIGN.get(), 800);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_BUTTON.get(), 100);
        FuelRegistry.INSTANCE.add(BlockRegistry.SEEPING_SAPLING.get(), 100);

        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_STRIPPED_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_STRIPPED_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_PLANKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_STAIRS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_SLAB.get(), 150);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_TRAPDOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_PRESSURE_PLATE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_FENCE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_GATE.get(), 300);
        FuelRegistry.INSTANCE.add(ItemRegistry.SORBUS_SIGN.get(), 200);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_HANGING_SIGN.get(), 800);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_BUTTON.get(), 100);
        FuelRegistry.INSTANCE.add(BlockRegistry.SORBUS_SAPLING.get(), 100);

        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_STRIPPED_LOG.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_STRIPPED_WOOD.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_PLANKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_STAIRS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_SLAB.get(), 150);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_TRAPDOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_PRESSURE_PLATE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_FENCE.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_GATE.get(), 300);
        FuelRegistry.INSTANCE.add(ItemRegistry.WALNUT_SIGN.get(), 200);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_HANGING_SIGN.get(), 800);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_BUTTON.get(), 100);
        FuelRegistry.INSTANCE.add(BlockRegistry.WALNUT_SAPLING.get(), 100);
    }
}
