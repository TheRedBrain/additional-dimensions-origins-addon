package com.github.theredbrain.customPlayerModels.client.network;

import com.github.theredbrain.customPlayerModels.entity.CustomPlayerEntity;
import com.github.theredbrain.customPlayerModels.mixin.PlayerEntityMixin;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public abstract class 2CustomAbstractClientPlayerEntity extends PlayerEntity {
    public CustomAbstractClientPlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
}
