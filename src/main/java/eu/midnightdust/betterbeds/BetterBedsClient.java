package eu.midnightdust.betterbeds;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class BetterBedsClient implements ClientModInitializer {

    public void onInitializeClient() {

        FabricLoader.getInstance().getModContainer("betterbeds").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("betterbeds:fancybeds"), "resourcepacks/fancybeds", modContainer, false);
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("betterbeds:connectedbeds"), "resourcepacks/connectedbeds", modContainer, false);
        });
    }
}
