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
package dev.tophatcat.mysteriousbiomes.client;

import dev.tophatcat.mysteriousbiomes.MysteriousRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class MysteriousRenderingNeo {

    public static void registerEntityModels(EntityRenderersEvent.RegisterRenderers event) {
        MysteriousRenderingCommon.getRenderers().forEach(
            record -> event.registerEntityRenderer((EntityType) record.type().get(), record.renderer()));
    }

    public static void registerModelLayers(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        MysteriousRenderingCommon.getLayerDefinitions().forEach(
            layers -> event.registerLayerDefinition(layers.layerLocation(), layers::supplier));
    }

    public static void registerCutouts(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.BLOODWOOD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.BLOODWOOD_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.BLOODWOOD_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.GHOSTLY_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.GHOSTLY_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.GHOSTLY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SEEPING_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SEEPING_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SEEPING_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SORBUS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SORBUS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.SORBUS_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.WALNUT_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.WALNUT_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MysteriousRegistry.WALNUT_SAPLING.get(), RenderType.cutout());
    }
}
