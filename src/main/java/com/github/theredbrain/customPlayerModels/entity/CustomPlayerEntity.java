package com.github.theredbrain.customPlayerModels.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CustomPlayerEntity extends PlayerEntity implements IAnimatable {

    //TODO extend LivingEntity
    AnimationFactory factory = new AnimationFactory(this);

    public CustomPlayerEntity(World world, BlockPos pos, float yaw, GameProfile profile) {
        super(world, pos, yaw, profile);
    }
//
//    public CustomPlayerEntity() {
//        super();
//    }

//    public CustomPlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
//        super(entityType, world);
//    }

    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController<CustomPlayerEntity>(this, "controller", 20, this::predicate));
    }



    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public boolean isCreative() {
        return false;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return null;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {

    }

    @Override
    public Arm getMainArm() {
        return null;
    }
}
