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
package dev.tophatcat.mysteriousbiomes.datagen;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.MysteriousRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class MysteriousFeaturesGen {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOODWOOD_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "bloodwood_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> GHOSTLY_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "ghostly_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SORBUS_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "sorbus_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEEPING_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "seeping_tree"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_TREE = ResourceKey.create(
        Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysteriousCommon.MOD_ID, "walnut_tree"));

    public static void run(BootstrapContext<ConfiguredFeature<?, ?>> feature) {
        feature.register(BLOODWOOD_TREE, new ConfiguredFeature<>(Feature.TREE,
            new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(MysteriousRegistry.BLOODWOOD_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(MysteriousRegistry.BLOODWOOD_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2),
                ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0))
                .dirt(BlockStateProvider.simple(MysteriousRegistry.BLOODIED_DIRT.get())).build()));
    }
}
