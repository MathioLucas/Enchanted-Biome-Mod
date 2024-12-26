// ModItems.java
package com.yourname.enchantedforest.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import com.yourname.enchantedforest.items.MagicWandItem;
import com.yourname.enchantedforest.items.EnchantedFruitItem;

public class ModItems {
    public static final Item MAGIC_WAND = new MagicWandItem(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item ENCHANTED_FRUIT = new EnchantedFruitItem(new Item.Settings().group(ItemGroup.FOOD).food(
            new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).alwaysEdible().build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("enchantedforest", "magic_wand"), MAGIC_WAND);
        Registry.register(Registry.ITEM, new Identifier("enchantedforest", "enchanted_fruit"), ENCHANTED_FRUIT);
    }
}
