package eu.midnightdust.fabric.betterbeds;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class BetterBedsFabric implements ClientModInitializer {
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("betterbeds").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(Identifier.of("betterbeds:fancyconnectedbeds"),  modContainer, ResourcePackActivationType.NORMAL);
        });
    }
}
