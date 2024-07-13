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

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MysteriousStrippableBlocks {

    public MysteriousStrippableBlocks() {
        init();
    }

    private void init() {
        StrippableBlockRegistry.register(MysteriousRegistry.BLOODWOOD_LOG.get(),
            MysteriousRegistry.BLOODWOOD_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousRegistry.BLOODWOOD_WOOD.get(),
            MysteriousRegistry.BLOODWOOD_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousRegistry.GHOSTLY_LOG.get(),
            MysteriousRegistry.GHOSTLY_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousRegistry.GHOSTLY_WOOD.get(),
            MysteriousRegistry.GHOSTLY_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousRegistry.SEEPING_LOG.get(),
            MysteriousRegistry.SEEPING_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousRegistry.SEEPING_WOOD.get(),
            MysteriousRegistry.SEEPING_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousRegistry.SORBUS_LOG.get(),
            MysteriousRegistry.SORBUS_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousRegistry.SORBUS_WOOD.get(),
            MysteriousRegistry.SORBUS_STRIPPED_WOOD.get());
        StrippableBlockRegistry.register(MysteriousRegistry.WALNUT_LOG.get(),
            MysteriousRegistry.WALNUT_STRIPPED_LOG.get());
        StrippableBlockRegistry.register(MysteriousRegistry.WALNUT_WOOD.get(),
            MysteriousRegistry.WALNUT_STRIPPED_WOOD.get());
    }
}
