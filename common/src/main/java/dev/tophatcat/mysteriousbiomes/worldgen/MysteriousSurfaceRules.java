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
package dev.tophatcat.mysteriousbiomes.worldgen;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class MysteriousSurfaceRules {

    private static final SurfaceRules.RuleSource BLOOD_SOAKED_GRASS = SurfaceRules.state(
        BlockRegistry.BLOOD_SOAKED_GRASS.get().defaultBlockState());
    private static final SurfaceRules.RuleSource BLOOD_SOAKED_DIRT = SurfaceRules.state(
        BlockRegistry.BLOOD_SOAKED_DIRT.get().defaultBlockState());

    public static SurfaceRules.RuleSource makeRules() {
        return SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(MysteriousCommon.BLOOD_SOAKED_PLAINS),
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(0, 0), SurfaceRules.sequence(BLOOD_SOAKED_GRASS)),
                    BLOOD_SOAKED_DIRT)))), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, BLOOD_SOAKED_DIRT));
    }
}
