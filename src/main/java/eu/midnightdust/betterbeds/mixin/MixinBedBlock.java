package eu.midnightdust.betterbeds.mixin;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BedBlock.class, priority = 2000)
public abstract class MixinBedBlock extends HorizontalFacingBlock {

    protected MixinBedBlock(Settings settings) {
        super(settings);
    }

    @Inject(at = @At("RETURN"), method = "getRenderType", cancellable = true)
    private void getRenderType(BlockState state, CallbackInfoReturnable<BlockRenderType> cir) {
        cir.setReturnValue(BlockRenderType.MODEL);
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isSideInvisible(BlockState state, BlockState neighborState, Direction offset) {
        return neighborState.getBlock() instanceof BedBlock;
    }
}
