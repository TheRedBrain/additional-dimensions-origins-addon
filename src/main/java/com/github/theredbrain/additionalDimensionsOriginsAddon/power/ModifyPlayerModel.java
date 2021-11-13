package com.github.theredbrain.additionalDimensionsOriginsAddon.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class ModifyPlayerModel extends Power {

    public final Identifier model_location;
    public final Identifier texture_location;
    public final Identifier animation_location;

    public ModifyPlayerModel(PowerType<?> type, LivingEntity entity, Identifier model_location, Identifier texture_location, Identifier animation_location){
        super(type, entity);
        this.model_location = model_location;
        this.texture_location = texture_location;
        this.animation_location = animation_location;

    }
}
