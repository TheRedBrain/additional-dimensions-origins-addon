package com.github.theredbrain.customPlayerModels.client.entity.model;

import com.github.theredbrain.customPlayerModels.CustomPlayerModels;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@SuppressWarnings("rawtypes")
@Environment(value=EnvType.CLIENT)
public class CustomPlayerEntityModel<T extends LivingEntity & IAnimatable> extends AnimatedGeoModel<T> {

//    public CustomPlayerEntityModel(ModelPart root, boolean thinArms) {
//        super(root, RenderLayer::getEntityTranslucent);
//    }
    // TODO get paths from power type

    @Override
    public Identifier getModelLocation(T object)
    {
        return new Identifier(CustomPlayerModels.MODID, "geo/player_centaur.geo.json");
    }

    @Override
    public Identifier getTextureLocation(T object)
    {
        return new Identifier(CustomPlayerModels.MODID, "textures/model/entity/player_centaur.png");
    }

    @Override
    public Identifier getAnimationFileLocation(T object)
    {
        return new Identifier(CustomPlayerModels.MODID, "animations/player_centaur.animation.json");
    }

    @Override
    public void setLivingAnimations(T o, Integer integer, AnimationEvent animationEvent) {
        super.setLivingAnimations(o, integer, animationEvent);
    }
}
