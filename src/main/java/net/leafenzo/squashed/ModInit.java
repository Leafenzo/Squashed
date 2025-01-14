package net.leafenzo.squashed;

import net.fabricmc.api.ModInitializer;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.block.dispenser.ModDispenserBehaviors;
import net.leafenzo.squashed.compat.SquashedIntegrationPacks;
import net.leafenzo.squashed.entity.ModEntityTypes;
import net.leafenzo.squashed.item.ModItems;
import net.leafenzo.squashed.registries.ModFabricRegistries;
import net.leafenzo.squashed.registries.ModVillagerTrades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModInit implements ModInitializer {
    public static final String MOD_ID = Super.MOD_ID;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEntityTypes.registerModEntityTypes();
        SquashedIntegrationPacks.register();
        ModFabricRegistries.registerOxidizableBlocks();
        ModFabricRegistries.registerFlammableBlocks();
        ModFabricRegistries.registerFuels();
        ModFabricRegistries.registerCompostingChances();
        ModDispenserBehaviors.RegisterDispenserBehaviors();
        ModVillagerTrades.registerVillagerTrades();
    }
}

