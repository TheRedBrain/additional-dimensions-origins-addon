package com.github.theredbrain.customPlayerModels;

import com.github.theredbrain.customPlayerModels.client.entity.render.CustomLivingEntityRenderer;
import com.github.theredbrain.customPlayerModels.client.entity.render.CustomPlayerEntityRenderer;
//import com.github.theredbrain.customPlayerModels.client.entity.render.entity.CustomPlayerEntityRenderer;
//import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import com.github.theredbrain.customPlayerModels.entity.CustomPlayerEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;

public class CustomPlayerModelsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient()
    {

        CustomPlayerModels.LOGGER.info("Custom player models on client when?");


        EntityRendererRegistry.register(EntityType.PLAYER,
                (ctx) -> new CustomPlayerEntityRenderer(ctx));
    }
}
