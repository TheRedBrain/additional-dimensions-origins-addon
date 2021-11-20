package com.github.theredbrain.customPlayerModels.mixin;

import com.github.theredbrain.customPlayerModels.entity.CustomPlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements IAnimatable {

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller", 20, this::predicate));
    }

    // TODO replace with player_animations
    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walking", true)
//                    .addAnimation("player_centaur.walking_legs", true)
//                    .addAnimation("player_centaur.moving_body", true)
            );
        }
        else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}
