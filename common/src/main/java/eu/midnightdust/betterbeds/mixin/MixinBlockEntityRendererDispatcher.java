package eu.midnightdust.betterbeds.mixin;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(BlockEntityRendererFactories.class)
public abstract class MixinBlockEntityRendererDispatcher {

    @Shadow @Final private static Map<BlockEntityType<?>, BlockEntityRendererFactory<?>> FACTORIES;

    @Inject(method = "register", at = @At("TAIL"))
    private static <T extends BlockEntity>  void bb$onRegister(BlockEntityType<? extends T> type, BlockEntityRendererFactory<T> factory, CallbackInfo ci) {
        FACTORIES.remove(BlockEntityType.BED);
    }
}