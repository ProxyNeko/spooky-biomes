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
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.EntityType;

public class MysteriousRenderingFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MysteriousRenderingCommon.getRenderers().forEach(
            record -> EntityRendererRegistry.register((EntityType) record.type().get(), record.renderer()));

        MysteriousRenderingCommon.getLayerDefinitions().forEach(
            layers -> EntityModelLayerRegistry.registerModelLayer(layers.layerLocation(), layers::supplier));

        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.BLOODWOOD_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.BLOODWOOD_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.BLOODWOOD_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.GHOSTLY_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.GHOSTLY_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.GHOSTLY_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SEEPING_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SEEPING_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SEEPING_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SORBUS_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SORBUS_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.SORBUS_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.WALNUT_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.WALNUT_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MysteriousRegistry.WALNUT_SAPLING.get(), RenderType.cutout());
    }
}
