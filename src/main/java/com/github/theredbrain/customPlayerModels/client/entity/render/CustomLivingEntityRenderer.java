package com.github.theredbrain.customPlayerModels.client.entity.render;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class CustomLivingEntityRenderer<T extends LivingEntity & IAnimatable, M extends AnimatedGeoModel<T>> extends EntityRenderer<T>
        implements CustomFeatureRendererContext<T, M> {
    protected M model;

    public CustomLivingEntityRenderer(EntityRendererFactory.Context ctx, M model) {
        super(ctx);
        this.model = model;
//        this.shadowRadius = shadowRadius;
    }

    @Override
    public M getModel() {
        return null;
    }

//    @Override
//    public Identifier getTexture(T entity) {
//        return null;
//    }
}
