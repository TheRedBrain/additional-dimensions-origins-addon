package com.github.theredbrain.customPlayerModels.client.entity.render;

import com.github.theredbrain.customPlayerModels.client.entity.model.CustomPlayerEntityModel;
import com.github.theredbrain.customPlayerModels.client.network.CustomAbstractClientPlayerEntity;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.util.Identifier;

public class CustomPlayerEntityRenderer extends CustomLivingEntityRenderer<AbstractClientPlayerEntity, CustomPlayerEntityModel<AbstractClientPlayerEntity>> {

    float entityShadow;
    public CustomPlayerEntityRenderer(EntityRendererFactory.Context ctx)
    {
        super(ctx, new CustomPlayerEntityModel<AbstractClientPlayerEntity>());
    }

    @Override
    public Identifier getTexture(AbstractClientPlayerEntity entity) {
        return null;
    }

//    @Override
//    public Identifier getTexture(AbstractClientPlayerEntity entity) {
//        return null;
//    }

//    @Override
//    public Identifier getTexture(AbstractClientPlayerEntity entity) {
//        return null;
//    }

//    @Override
//    public boolean callAddFeature(FeatureRenderer<net.minecraft.entity.Entity, net.minecraft.client.render.entity.model.EntityModel<net.minecraft.entity.Entity>> featureRenderer) {
//        return false;
//    }
}
