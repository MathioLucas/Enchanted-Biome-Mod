// EnchantedForestMod.java
package com.yourname.enchantedforest;

import net.fabricmc.api.ModInitializer;
import com.yourname.enchantedforest.registry.ModBlocks;
import com.yourname.enchantedforest.registry.ModItems;
import com.yourname.enchantedforest.registry.ModEntities;
import com.yourname.enchantedforest.registry.ModBiomes;

public class EnchantedForestMod implements ModInitializer {
    public static final String MOD_ID = "enchantedforest";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModEntities.registerEntities();
        ModBiomes.registerBiomes();

        System.out.println("Enchanted Forest Mod has been initialized!");
    }
}
