// ModBlocks.java
package com.yourname.enchantedforest.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class ModBlocks {
    public static final Block MYSTIC_LOG = new Block(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block MYSTIC_LEAVES = new Block(Block.Settings.copy(Blocks.OAK_LEAVES));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("enchantedforest", "mystic_log"), MYSTIC_LOG);
        Registry.register(Registry.BLOCK, new Identifier("enchantedforest", "mystic_leaves"), MYSTIC_LEAVES);

        Registry.register(Registry.ITEM, new Identifier("enchantedforest", "mystic_log"),
                new BlockItem(MYSTIC_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("enchantedforest", "mystic_leaves"),
                new BlockItem(MYSTIC_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}
