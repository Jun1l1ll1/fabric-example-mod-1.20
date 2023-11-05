package com.testmod.item;

import com.testmod.effect.ModEffects;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HEART = new FoodComponent.Builder().saturationModifier(0.02f).statusEffect(new StatusEffectInstance(ModEffects.ADD_HEART, -1, 1), 1.0f).alwaysEdible().meat().build();
    // public static final FoodComponent HEART = new FoodComponent.Builder().saturationModifier(0.02f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 0), 1.0f).alwaysEdible().meat().build();
}
