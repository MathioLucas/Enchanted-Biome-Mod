// TreeGuardianEntity.java
package com.yourname.enchantedforest.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvent;

public class TreeGuardianEntity extends HostileEntity {
    public TreeGuardianEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    // Define attack behavior
    @Override
    protected void attack(LivingEntity target, float pullProgress) {
        // Implement custom attack logic
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_IRON_GOLEM_STEP;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_WOOD_HIT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_WOOD_BREAK;
    }
}
