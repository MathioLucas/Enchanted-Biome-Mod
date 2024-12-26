// ModBiomes.java
package com.yourname.enchantedforest.registry;

import com.yourname.enchantedforest.world.biome.EnchantedForestBiome;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final Biome ENCHANTED_FOREST = EnchantedForestBiome.createEnchantedForest();

    public static void registerBiomes() {
        Registry.register(Registry.BIOME, new Identifier("enchantedforest", "enchanted_forest"), ENCHANTED_FOREST);
    }
}
