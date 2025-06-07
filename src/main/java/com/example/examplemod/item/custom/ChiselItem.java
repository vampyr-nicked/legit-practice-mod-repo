package com.example.examplemod.item.custom;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.advancements.critereon.KilledTrigger;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.END_STONE, Blocks.END_STONE_BRICKS,
                    Blocks.DEEPSLATE, Blocks.DEEPSLATE_BRICKS,
                    ModBlocks.AEROSTONE.get(), ModBlocks.GEOSTONE.get(),
                    ModBlocks.GEOSTONE.get(), ModBlocks.AEROSTONE.get()
            );
    public ChiselItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), CHISEL_MAP.get(clickedBlock).defaultBlockState());
                level.playSound(pContext.getPlayer(), pContext.getClickedPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.PLAYERS,1f,1f);
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
        player -> pContext.getPlayer().broadcastBreakEvent(player.getUsedItemHand()));


        return InteractionResult.SUCCESS;


    }
    

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
       pTooltipComponents.add(Component.translatable("tooltip.examplemod.chisel_tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
