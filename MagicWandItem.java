// MagicWandItem.java
package com.yourname.enchantedforest.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.entity.projectile.FireballEntity;

public class MagicWandItem extends Item {
    public MagicWandItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Cast a spell (e.g., shoot a fireball)
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F);

        if (!world.isClient) {
            FireballEntity fireball = new FireballEntity(world, user, 0, 0, 0);
            fireball.refreshPositionAndAngles(user.getX(), user.getEyeY(), user.getZ(), user.getYaw(), user.getPitch());
            fireball.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(fireball);
        }

        user.getItemCooldownManager().set(this, 100);
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
