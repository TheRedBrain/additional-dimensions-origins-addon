package com.github.theredbrain.customPlayerModels.mixin;

import com.github.theredbrain.customPlayerModels.entity.CustomPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityType.class)
public interface EntityTypeInvoker {

    @Invoker("register")
    public static <T extends Entity> EntityType<CustomPlayerEntity> invokeRegister(String id, EntityType.Builder<T> type) {
        throw new AssertionError();
    }
}
