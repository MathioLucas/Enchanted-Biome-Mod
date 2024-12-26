// ModEntities.java
package com.yourname.enchantedforest.registry;

import com.yourname.enchantedforest.entities.ForestSpriteEntity;
import com.yourname.enchantedforest.entities.TreeGuardianEntity;
import com.yourname.enchantedforest.EnchantedForestMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<ForestSpriteEntity> FOREST_SPRITE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(EnchantedForestMod.MOD_ID, "forest_sprite"),
            FabricEntityTypeBuilder.create(EntityCategory.CREATURE, ForestSpriteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final EntityType<TreeGuardianEntity> TREE_GUARDIAN = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(EnchantedForestMod.MOD_ID, "tree_guardian"),
            FabricEntityTypeBuilder.create(EntityCategory.MONSTER, TreeGuardianEntity::new)
                    .dimensions(EntityDimensions.fixed(1.4f, 2.9f)).build());

    public static void registerEntities() {
        // Additional registration if needed
    }
}
