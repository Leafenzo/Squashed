package net.leafenzo.squashed.client.render;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ModRenderLayers {
    public static void registerBlockCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                ModBlocks.DENSE_COBWEB_BLOCK,
                ModBlocks.COMPRESSED_SPONGE,
                ModBlocks.SEA_PICKLE_BLOCK
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.MAGMA_CREAM_BLOCK,
                ModBlocks.COMPRESSED_AMETHYST_BLOCK,
                ModBlocks.COMPRESSED_QUARTZ_BLOCK
        );
    }
}
