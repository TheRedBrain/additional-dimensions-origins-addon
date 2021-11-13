package com.github.theredbrain.additionalDimensionsOriginsAddon.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;

public class ModifyPlayerDimensions extends Power {
    public final float width_default;
    public final float height_default;
    public final float eyeHeight_default;
    public final float width_swimming;
    public final float height_swimming;
    public final float eyeHeight_swimming;
    public final float width_fall_flying;
    public final float height_fall_flying;
    public final float eyeHeight_fall_flying;
    public final float width_spin_attack;
    public final float height_spin_attack;
    public final float eyeHeight_spin_attack;
    public final float width_crouching;
    public final float height_crouching;
    public final float eyeHeight_crouching;
    public final float width_sleeping;
    public final float height_sleeping;
    public final float eyeHeight_sleeping;
    public final float width_dying;
    public final float height_dying;
    public final float eyeHeight_dying;

    // TODO list of player poses
    //  default, crouching, swimming, fall_flying, spin_attack

    public ModifyPlayerDimensions(PowerType<?> type, LivingEntity entity,
          float width_default, float height_default, float eyeHeight_default,
                                  float width_swimming, float height_swimming, float eyeHeight_swimming,
                                  float width_fall_flying, float height_fall_flying,float eyeHeight_fall_flying,
                                  float width_spin_attack, float height_spin_attack, float eyeHeight_spin_attack,
                                  float width_crouching, float height_crouching, float eyeHeight_crouching,
                                  float width_sleeping, float height_sleeping, float eyeHeight_sleeping,
                                  float width_dying, float height_dying, float eyeHeight_dying) {
        super(type, entity);
        this.width_default = width_default;
        this.height_default = height_default;
        this.eyeHeight_default = eyeHeight_default;
        this.width_swimming = width_swimming;
        this.height_swimming = height_swimming;
        this.eyeHeight_swimming = eyeHeight_swimming;
        this.width_fall_flying = width_fall_flying;
        this.height_fall_flying = height_fall_flying;
        this.eyeHeight_fall_flying = eyeHeight_fall_flying;
        this.width_spin_attack = width_spin_attack;
        this.height_spin_attack = height_spin_attack;
        this.eyeHeight_spin_attack = eyeHeight_spin_attack;
        this.width_crouching = width_crouching;
        this.height_crouching = height_crouching;
        this.eyeHeight_crouching = eyeHeight_crouching;
        this.width_sleeping = width_sleeping;
        this.height_sleeping = height_sleeping;
        this.eyeHeight_sleeping = eyeHeight_sleeping;
        this.width_dying = width_dying;
        this.height_dying = height_dying;
        this.eyeHeight_dying = eyeHeight_dying;
    }
}
