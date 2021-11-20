package com.github.theredbrain.customPlayerModels;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

public class CustomPlayerModels implements ModInitializer {

	public static final String MODID = "custom-player-models";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(CustomPlayerModels.class);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Custom player models when?");
		GeckoLibMod.DISABLE_IN_DEV = true;
		GeckoLib.initialize();
//		CustomPlayerModelsPowers.init();
	}

	public static Identifier identifier(String path) {
		return new Identifier(MODID, path);
	}
}
