// EnchantedForestBiome.java
package com.yourname.enchantedforest.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.sound.SoundEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.Registry;

public class EnchantedForestBiome {
    public static Biome createEnchantedForest() {
        // Create biome effects
        BiomeEffects effects = new BiomeEffects.Builder()
                .fogColor(0x88ccee)
                .waterColor(0x3f76e4)
                .waterFogColor(0x050533)
                .skyColor(0x77adff)
                .grassColor(0x33cc33)
                .foliageColor(0x33cc33)
                .ambientParticle(new BiomeParticleConfig(ParticleTypes.ENCHANT, 0.005f))
                .ambientLoopSound(SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP)
                .build();

        // Create biome settings
        Biome.Builder builder = new Biome.Builder();
        builder.precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.FOREST)
                .temperature(0.7f)
                .downfall(0.8f)
                .effects(effects)
                .spawnSettings(createSpawnSettings())
                .generationSettings(createGenerationSettings());

        return builder.build();
    }

    private static Biome.SpawnSettings createSpawnSettings() {
        Biome.SpawnSettings.Builder builder = new Biome.SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(ModEntities.FOREST_SPRITE, 10, 2, 4));
        builder.spawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(ModEntities.TREE_GUARDIAN, 5, 1, 2));
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addMonsters(builder, 95, 5, 100);
        return builder.build();
    }

    private static Biome.GenerationSettings createGenerationSettings() {
        Biome.GenerationSettings.Builder builder = new Biome.GenerationSettings.Builder();
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addForestTrees(builder);
        // Add custom features like Mystic Trees
        return builder.build();
    }
}
