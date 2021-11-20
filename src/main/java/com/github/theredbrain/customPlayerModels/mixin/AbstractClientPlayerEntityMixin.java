package com.github.theredbrain.customPlayerModels.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

@Environment(value= EnvType.CLIENT)
@Mixin(AbstractClientPlayerEntity.class)
public class AbstractClientPlayerEntityMixin implements IAnimatable {
    @Override
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}
