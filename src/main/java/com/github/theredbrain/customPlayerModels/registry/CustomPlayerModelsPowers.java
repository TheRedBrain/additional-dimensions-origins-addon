package com.github.theredbrain.customPlayerModels.registry;

import com.github.theredbrain.customPlayerModels.CustomPlayerModels;
import com.github.theredbrain.customPlayerModels.power.*;
//import io.github.apace100.apoli.power.Power;
//import io.github.apace100.apoli.power.factory.PowerFactory;
//import io.github.apace100.apoli.registry.ApoliRegistries;
//import io.github.apace100.calio.data.SerializableData;
//import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

// TODO revive when the time comes
public class CustomPlayerModelsPowers {
//    private static final Map<PowerFactory<?>, Identifier> POWER_FACTORIES = new LinkedHashMap<>();
//
//    public static final PowerFactory<Power> MODIFY_PLAYER_MODEL = create(new PowerFactory<>(CustomPlayerModels.identifier("modify_player_model"),
//            new SerializableData()
//                    .add("model_location", SerializableDataTypes.IDENTIFIER, null)
//                    .add("texture_location", SerializableDataTypes.IDENTIFIER, null)
//                    .add("animation_location", SerializableDataTypes.IDENTIFIER, null),
//            data ->
//                    (type, player) ->
//                            new ModifyPlayerModel(type, player, data.getId("model_location"), data.getId("texture_location"), data.getId("animation_location")))
//            .allowCondition());
//
//    private static <T extends Power> PowerFactory<T> create(PowerFactory<T> factory) {
//        POWER_FACTORIES.put(factory, factory.getSerializerId());
//        return factory;
//    }
//
//    public static void init() {
//        POWER_FACTORIES.keySet().forEach(powerType -> Registry.register(ApoliRegistries.POWER_FACTORY, POWER_FACTORIES.get(powerType), powerType));
//    }
}
