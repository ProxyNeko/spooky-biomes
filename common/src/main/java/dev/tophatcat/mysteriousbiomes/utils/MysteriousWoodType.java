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

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class MysteriousWoodType {

    public static void init() {
        WoodType.register(BLOOD_SOAKED_TYPE);
        WoodType.register(GHOSTLY_TYPE);
        WoodType.register(SORBUS_TYPE);
        WoodType.register(SEEPING_TYPE);
        WoodType.register(WALNUT_TYPE);

        BlockSetType.register(BLOOD_SOAKED_SET);
        BlockSetType.register(GHOSTLY_SET);
        BlockSetType.register(SORBUS_SET);
        BlockSetType.register(SEEPING_SET);
        BlockSetType.register(WALNUT_SET);
    }

    private static final BlockSetType BLOOD_SOAKED_SET = new BlockSetType("blood_soaked");
    private static final BlockSetType GHOSTLY_SET = new BlockSetType("ghostly");
    private static final BlockSetType SORBUS_SET = new BlockSetType("sorbus");
    private static final BlockSetType SEEPING_SET = new BlockSetType("seeping");
    private static final BlockSetType WALNUT_SET = new BlockSetType("walnut");

    public static final WoodType BLOOD_SOAKED_TYPE = new WoodType(ResourceLocation.fromNamespaceAndPath(
        MysteriousCommon.MOD_ID, "blood_soaked").toString(), BLOOD_SOAKED_SET);
    public static final WoodType GHOSTLY_TYPE = new WoodType(ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "ghostly").toString(), GHOSTLY_SET);
    public static final WoodType SORBUS_TYPE = new WoodType(ResourceLocation.fromNamespaceAndPath(
        MysteriousCommon.MOD_ID, "sorbus").toString(), SORBUS_SET);
    public static final WoodType SEEPING_TYPE = new WoodType(ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "seeping").toString(), SEEPING_SET);
    public static final WoodType WALNUT_TYPE = new WoodType(ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "walnut").toString(), WALNUT_SET);
}
