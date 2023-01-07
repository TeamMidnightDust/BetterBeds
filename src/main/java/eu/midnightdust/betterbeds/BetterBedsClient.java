package eu.midnightdust.betterbeds;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class BetterBedsClient implements ClientModInitializer {

    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("betterbeds").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("betterbeds:fancybeds"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("betterbeds:connectedbeds"),  modContainer, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("betterbeds:fancyconnectedbeds"),  modContainer, ResourcePackActivationType.NORMAL);
        });
    }
}
