package dev.tophatcat.mysteriousbiomes.datagen;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
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

import java.util.List;

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
