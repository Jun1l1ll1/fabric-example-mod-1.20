package com.testmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class AddHeartEffect extends StatusEffect {
    public AddHeartEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getAbsorptionAmount() <= 0.0f && !entity.getWorld().isClient) {
            entity.removeStatusEffect(this);
        }

        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        super.onApplied(entity, amplifier);
        entity.setAbsorptionAmount(Math.max(entity.getAbsorptionAmount(), (float)(4 * (1 + amplifier)))); //TODO get heart to add one absorbation heart even if it is eaten (encrese amplifier?)

        // int thisAmplifier = amplifier;
        // System.out.println(entity.getStatusEffect(ModEffects.ADD_HEART).getAmplifier());
        // if (entity.getStatusEffects().toString().contains(ModEffects.ADD_HEART.getTranslationKey())) {
        //     thisAmplifier = entity.getStatusEffect(ModEffects.ADD_HEART).getAmplifier() + 1;
        // }
        // entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20000, 5));

        // EntityAttribute.GENERIC_MAX_HEALTH
        // entity.addAttributeModifier(EntityAttribute.GENERIC_MAX_HEALTH, getTranslationKey(), amplifier);
    }
}