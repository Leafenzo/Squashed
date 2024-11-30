package net.leafenzo.squashed.compat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.leafenzo.squashed.compat.dyemod.DyeModCompat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

//Based off of how Spectrum does Major Mod Integration
public class SquashedIntegrationPacks {

    protected static final Map<String, ModIntegrationPack> INTEGRATION_PACKS = new HashMap<>();

    public abstract static class ModIntegrationPack {
        public abstract void register();

        public abstract void registerClient();
    }

    protected static void registerIntegrationPack(String modId, Supplier<ModIntegrationPack> container) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            INTEGRATION_PACKS.put(modId, container.get());
        }
    }

    public static final String DYE_MOD_ID = "mint";

    @SuppressWarnings("Convert2MethodRef")
    public static void register() {
        registerIntegrationPack(DYE_MOD_ID, () -> new DyeModCompat());

        for (ModIntegrationPack container : INTEGRATION_PACKS.values()) {
            container.register();
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        for (ModIntegrationPack container : INTEGRATION_PACKS.values()) {
            container.registerClient();
        }
    }

    public static boolean isIntegrationPackActive(String modId) {
        return INTEGRATION_PACKS.containsKey(modId);
    }
}
