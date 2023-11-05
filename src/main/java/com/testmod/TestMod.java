package com.testmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testmod.effect.ModEffects;
import com.testmod.item.ModItems;
import com.testmod.util.ModLootTableModifiers;


public class TestMod implements ModInitializer {
    public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModEffects.registerEffects();
		
		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();

	}
}