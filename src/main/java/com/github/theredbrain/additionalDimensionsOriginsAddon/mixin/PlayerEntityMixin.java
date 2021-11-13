package com.github.theredbrain.additionalDimensionsOriginsAddon.mixin;

import com.github.theredbrain.additionalDimensionsOriginsAddon.power.ModifyPlayerDimensions;
import io.github.apace100.apoli.component.PowerHolderComponent;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {


    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "getActiveEyeHeight", at = @At("HEAD"))
    public void getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions, CallbackInfoReturnable<Float> cir) {
        if(PowerHolderComponent.hasPower(this, ModifyPlayerDimensions.class)) {
            if (PowerHolderComponent.hasPower(this, ModifyPlayerDimensions.class)) {
                if (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default != 0.0f) {
                    switch (pose) {
                        case SWIMMING:
                            if (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_swimming != 0.0f) {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_swimming);
                            }
                            else {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default);
                            }
                        case FALL_FLYING:
                            if (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_fall_flying != 0.0f) {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_fall_flying);
                            }
                            else {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default);
                            }
                        case SPIN_ATTACK:
                            if (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_spin_attack != 0.0f) {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_spin_attack);
                            }
                            else {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default);
                            }
                        case CROUCHING:
                            if (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_crouching != 0.0f) {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_crouching);
                            }
                            else {
                                cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default);
                            }
                        // case SLEEPING:
                        // case DYING:
                        default:
                            cir.setReturnValue(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).eyeHeight_default);
                    }
                }
            }
        }
    }

    @Inject(method = "getDimensions", at = @At("HEAD"))
    public void getDimensions(EntityPose pose, CallbackInfoReturnable<EntityDimensions> cir) {
        if (PowerHolderComponent.hasPower(this, ModifyPlayerDimensions.class)) {
            if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default != 0.0f) &&
                    (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default != 0.0f)) {
                switch (pose) {
                    case SWIMMING:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_swimming != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_swimming != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_swimming,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_swimming));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    case FALL_FLYING:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_fall_flying != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_fall_flying != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_fall_flying,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_fall_flying));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    case SPIN_ATTACK:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_spin_attack != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_spin_attack != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_spin_attack,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_spin_attack));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    case CROUCHING:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_crouching != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_crouching != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_crouching,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_crouching));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    case SLEEPING:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_sleeping != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_sleeping != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_sleeping,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_sleeping));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    case DYING:
                        if ((PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_dying != 0.0f) &&
                                (PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_dying != 0.0f)) {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_dying,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_dying));
                        }
                        else {
                            cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).width_default,
                                    PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));
                        }
                    default:
                        cir.setReturnValue(EntityDimensions.changing(PowerHolderComponent.getPowers(this,ModifyPlayerDimensions.class).get(0).width_default,
                                PowerHolderComponent.getPowers(this, ModifyPlayerDimensions.class).get(0).height_default));

                }
            }
        }
    }
}
