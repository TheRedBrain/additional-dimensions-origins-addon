package com.github.theredbrain.customPlayerModels.client.entity.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@Environment(value= EnvType.CLIENT)
public interface CustomFeatureRendererContext<T extends Entity & IAnimatable, M extends AnimatedGeoModel<T>> {
    public M getModel();

    public Identifier getTexture(T var1);
}
