package com.example.examplemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BLOOBERRIES = new FoodProperties.Builder().nutrition(3).saturationMod(3)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.20f).build();
}
