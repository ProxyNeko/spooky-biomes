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

import dev.tophatcat.mysteriousbiomes.platform.Services;
import dev.tophatcat.mysteriousbiomes.utils.MysteriousWoodType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysteriousCommon {

    public static final String MOD_ID = "mysteriousbiomes";
    public static final String MOD_NAME = "Mysterious Biomes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static final ResourceKey<Biome> BLOODIED_PLAINS = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "bloodied_plains"));
    public static final ResourceKey<Biome> GHOSTLY_WOODLANDS = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "ghostly_woodlands"));
    public static final ResourceKey<Biome> SEEPING_FOREST = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "seeping_forest"));
    public static final ResourceKey<Biome> SORBUS_HIGHLANDS = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sorbus_highlands"));
    public static final ResourceKey<Biome> WALNUT_WOODLANDS = ResourceKey.create(Registries.BIOME,
        ResourceLocation.fromNamespaceAndPath(MOD_ID, "walnut_woodlands"));

    public static void init() {
        LOG.debug("We are currently loaded via the {} mod loader in a {} environment!",
            Services.PLATFORM.getPlatformName(),
            Services.PLATFORM.getEnvironmentName());

        MysteriousRegistry.init();
        MysteriousWoodType.init();
    }
}
