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

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MysteriousFlammableBlocks {

    public MysteriousFlammableBlocks() {
        init();
    }

    private static void init() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(MysteriousRegistry.BLOODWOOD_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.BLOODWOOD_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.BLOODWOOD_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.BLOODWOOD_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.BLOODWOOD_PLANKS.get(), 5, 20);
        registry.add(MysteriousRegistry.BLOODWOOD_LEAVES.get(), 30, 60);
        registry.add(MysteriousRegistry.BLOODWOOD_SLAB.get(), 5, 20);
        registry.add(MysteriousRegistry.BLOODWOOD_GATE.get(), 5, 20);
        registry.add(MysteriousRegistry.BLOODWOOD_FENCE.get(), 5, 20);
        registry.add(MysteriousRegistry.BLOODWOOD_STAIRS.get(), 5, 20);

        registry.add(MysteriousRegistry.GHOSTLY_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.GHOSTLY_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.GHOSTLY_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.GHOSTLY_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.GHOSTLY_PLANKS.get(), 5, 20);
        registry.add(MysteriousRegistry.GHOSTLY_LEAVES.get(), 30, 60);
        registry.add(MysteriousRegistry.GHOSTLY_SLAB.get(), 5, 20);
        registry.add(MysteriousRegistry.GHOSTLY_GATE.get(), 5, 20);
        registry.add(MysteriousRegistry.GHOSTLY_FENCE.get(), 5, 20);
        registry.add(MysteriousRegistry.GHOSTLY_STAIRS.get(), 5, 20);

        registry.add(MysteriousRegistry.SEEPING_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.SEEPING_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.SEEPING_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.SEEPING_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.SEEPING_PLANKS.get(), 5, 20);
        registry.add(MysteriousRegistry.SEEPING_LEAVES.get(), 30, 60);
        registry.add(MysteriousRegistry.SEEPING_SLAB.get(), 5, 20);
        registry.add(MysteriousRegistry.SEEPING_GATE.get(), 5, 20);
        registry.add(MysteriousRegistry.SEEPING_FENCE.get(), 5, 20);
        registry.add(MysteriousRegistry.SEEPING_STAIRS.get(), 5, 20);

        registry.add(MysteriousRegistry.SORBUS_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.SORBUS_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.SORBUS_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.SORBUS_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.SORBUS_PLANKS.get(), 5, 20);
        registry.add(MysteriousRegistry.SORBUS_LEAVES.get(), 30, 60);
        registry.add(MysteriousRegistry.SORBUS_SLAB.get(), 5, 20);
        registry.add(MysteriousRegistry.SORBUS_GATE.get(), 5, 20);
        registry.add(MysteriousRegistry.SORBUS_FENCE.get(), 5, 20);
        registry.add(MysteriousRegistry.SORBUS_STAIRS.get(), 5, 20);

        registry.add(MysteriousRegistry.WALNUT_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.WALNUT_STRIPPED_LOG.get(), 5, 5);
        registry.add(MysteriousRegistry.WALNUT_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.WALNUT_STRIPPED_WOOD.get(), 5, 5);
        registry.add(MysteriousRegistry.WALNUT_PLANKS.get(), 5, 20);
        registry.add(MysteriousRegistry.WALNUT_LEAVES.get(), 30, 60);
        registry.add(MysteriousRegistry.WALNUT_SLAB.get(), 5, 20);
        registry.add(MysteriousRegistry.WALNUT_GATE.get(), 5, 20);
        registry.add(MysteriousRegistry.WALNUT_FENCE.get(), 5, 20);
        registry.add(MysteriousRegistry.WALNUT_STAIRS.get(), 5, 20);
    }
}
