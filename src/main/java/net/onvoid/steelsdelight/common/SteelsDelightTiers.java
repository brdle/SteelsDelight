package net.onvoid.steelsdelight.common;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.onvoid.steelsdelight.SteelsDelight;

import java.util.function.Supplier;

public enum SteelsDelightTiers implements Tier {
    STEEL(2, 484, 6.5F, 2.0F, 16, SteelsDelight.steelIngredient);

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    SteelsDelightTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}