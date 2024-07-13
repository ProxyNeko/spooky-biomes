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
package dev.tophatcat.mysteriousbiomes.data;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import java.util.List;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;

public class MysteriousPlacementsGen {

    public static final ResourceKey<PlacedFeature> BLOODWOOD_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "bloodwood_tree"));
    public static final ResourceKey<PlacedFeature> GHOSTLY_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "ghostly_tree"));
    public static final ResourceKey<PlacedFeature> SORBUS_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "sorbus_tree"));
    public static final ResourceKey<PlacedFeature> SEEPING_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "seeping_tree"));
    public static final ResourceKey<PlacedFeature> WALNUT_TREE = ResourceKey.create(
        Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "walnut_tree"));

    public static void run(BootstrapContext<PlacedFeature> feature) {
        HolderGetter<ConfiguredFeature<?, ?>> getter = feature.lookup(Registries.CONFIGURED_FEATURE);
        feature.register(BLOODWOOD_TREE, new PlacedFeature(getter.getOrThrow(MysteriousFeaturesGen.BLOODWOOD_TREE),
            List.of(CountPlacement.of(10), RandomOffsetPlacement.horizontal(
                UniformInt.of(0, 8)), HeightmapPlacement.onHeightmap(
                    Heightmap.Types.MOTION_BLOCKING), BiomeFilter.biome())));
    }
}
