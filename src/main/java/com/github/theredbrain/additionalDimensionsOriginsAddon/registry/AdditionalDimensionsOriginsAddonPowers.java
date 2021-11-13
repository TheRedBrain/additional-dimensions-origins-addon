package com.github.theredbrain.additionalDimensionsOriginsAddon.registry;

import com.github.theredbrain.additionalDimensionsOriginsAddon.AdditionalDimensionsOriginsAddon;
import com.github.theredbrain.additionalDimensionsOriginsAddon.power.*;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class AdditionalDimensionsOriginsAddonPowers {
    private static final Map<PowerFactory<?>, Identifier> POWER_FACTORIES = new LinkedHashMap<>();

    public static final PowerFactory<Power> MODIFY_PLAYER_DIMENSIONS = create(new PowerFactory<>(AdditionalDimensionsOriginsAddon.identifier("modify_player_dimensions"),
            new SerializableData()
                    .add("width_default", SerializableDataTypes.FLOAT, 0.0f).add("height_default", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_default", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_swimming", SerializableDataTypes.FLOAT, 0.0f).add("height_swimming", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_swimming", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_fall_flying", SerializableDataTypes.FLOAT, 0.0f).add("height_fall_flying", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_fall_flying", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_spin_attack", SerializableDataTypes.FLOAT, 0.0f).add("height_spin_attack", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_spin_attack", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_crouching", SerializableDataTypes.FLOAT, 0.0f).add("height_crouching", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_crouching", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_sleeping", SerializableDataTypes.FLOAT, 0.0f).add("height_sleeping", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_sleeping", SerializableDataTypes.FLOAT, 0.0f)
                    .add("width_dying", SerializableDataTypes.FLOAT, 0.0f).add("height_dying", SerializableDataTypes.FLOAT, 0.0f).add("eyeHeight_dying", SerializableDataTypes.FLOAT, 0.0f),
            data ->
                    (type, player) ->
                            new ModifyPlayerDimensions(type, player, data.getFloat("width_default"), data.getFloat("height_default"), data.getFloat("eyeHeight_default"),
                                    data.getFloat("width_swimming"), data.getFloat("height_swimming"), data.getFloat("eyeHeight_swimming"),
                                    data.getFloat("width_fall_flying"), data.getFloat("height_fall_flying"), data.getFloat("eyeHeight_fall_flying"),
                                    data.getFloat("width_spin_attack"), data.getFloat("height_spin_attack"), data.getFloat("eyeHeight_spin_attack"),
                                    data.getFloat("width_crouching"), data.getFloat("height_crouching"), data.getFloat("eyeHeight_crouching"),
                                    data.getFloat("width_sleeping"), data.getFloat("height_sleeping"), data.getFloat("eyeHeight_sleeping"),
                                    data.getFloat("width_dying"), data.getFloat("height_dying"), data.getFloat("eyeHeight_dying")))
            .allowCondition());

    public static final PowerFactory<Power> MODIFY_PLAYER_MODEL = create(new PowerFactory<>(AdditionalDimensionsOriginsAddon.identifier("modify_player_model"),
            new SerializableData()
                    .add("model_location", SerializableDataTypes.IDENTIFIER, null)
                    .add("texture_location", SerializableDataTypes.IDENTIFIER, null)
                    .add("animation_location", SerializableDataTypes.IDENTIFIER, null),
            data ->
                    (type, player) ->
                            new ModifyPlayerModel(type, player, data.getId("model_location"), data.getId("texture_location"), data.getId("animation_location")))
            .allowCondition());

    private static <T extends Power> PowerFactory<T> create(PowerFactory<T> factory) {
        POWER_FACTORIES.put(factory, factory.getSerializerId());
        return factory;
    }

    public static void init() {
        POWER_FACTORIES.keySet().forEach(powerType -> Registry.register(ApoliRegistries.POWER_FACTORY, POWER_FACTORIES.get(powerType), powerType));
    }
}
