package com.example.examplemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class DenseCloudBlock extends Block{
    public DenseCloudBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (!pEntity.isSteppingCarefully() && pEntity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)pEntity)) {
            pEntity.resetFallDistance();
            pEntity.addDeltaMovement(new Vec3(0,1.4,0));

            pLevel.playSound(pEntity, pPos, SoundEvents.WOOL_HIT, SoundSource.BLOCKS,1f,0f);

            super.stepOn(pLevel, pPos, pState, pEntity);

        }
    }}
