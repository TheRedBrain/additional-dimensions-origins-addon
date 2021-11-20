package com.github.theredbrain.customPlayerModels.mixin;

import com.github.theredbrain.customPlayerModels.client.entity.render.CustomPlayerEntityRenderer;
import com.github.theredbrain.customPlayerModels.client.network.CustomAbstractClientPlayerEntity;
import com.github.theredbrain.customPlayerModels.entity.CustomPlayerEntity;
import com.google.common.collect.ImmutableMap;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.EntityRenderers;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(EntityRenderers.class)
public class EntityRenderersMixin {

    @Shadow
    @Final
    @Mutable
    private static Map<String, EntityRendererFactory<AbstractClientPlayerEntity>> PLAYER_RENDERER_FACTORIES = ImmutableMap.of("custom", context -> new CustomPlayerEntityRenderer(context));

    @Inject(at= @At("RETURN"), method="reloadPlayerRenderers")
    private static void reloadPlayerRenderers(EntityRendererFactory.Context ctx, CallbackInfoReturnable<Map<String, EntityRenderer<? extends CustomPlayerEntity>>> cir) {
        ImmutableMap.Builder builder = ImmutableMap.builder();

//        PLAYER_RENDERER_FACTORIES.forEach((string, entityRendererFactory) -> {
//            try {
//                builder.put(string, entityRendererFactory.create(ctx));
//            }
//            catch (Exception exception) {
//                throw new IllegalArgumentException("Failed to create player model for " + string, exception);
//            }
//        });
//        return builder.build();

        builder.put("custom", new CustomPlayerEntityRenderer(ctx));
        builder = (ImmutableMap.Builder) cir.getReturnValue();

    }

//    @Inject(method = "<clinit>",
//            at = @At(value = "FIELD",
//                    opcode = Opcodes.PUTSTATIC,
//                    target = "Lnet/minecraft/client/render/entity/EntityRenderers;PLAYER_RENDERER_FACTORIES:Ljava/util/Map;:Ljava/lang/String;Lnet/minecraft/client/render/entity/EntityRenderer;",
//                    shift = At.Shift.AFTER))
//    private static void tweaks(CallbackInfo ci) {
//        PLAYER_RENDERER_FACTORIES = ImmutableMap.of("default", context -> new PlayerEntityRenderer(context, false),
//                "slim", context -> new PlayerEntityRenderer(context, true),
//                "custom", CustomPlayerEntityRenderer::new);
//    }
}
