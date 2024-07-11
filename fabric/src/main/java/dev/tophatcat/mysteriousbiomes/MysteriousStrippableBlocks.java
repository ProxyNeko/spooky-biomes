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
