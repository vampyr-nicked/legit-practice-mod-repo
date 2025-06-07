package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExampleMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.CLOUD_BLOCK);
        blockWithItem(ModBlocks.DENSE_CLOUD_BLOCK);
        blockWithItem(ModBlocks.AEROSTONE);
        blockWithItem(ModBlocks.GEOSTONE);
        blockWithItem(ModBlocks.ECO_TILES);
        blockWithItem(ModBlocks.AQUA_TILES);
        blockWithItem(ModBlocks.MAGMA_TILES);
        blockWithItem(ModBlocks.PLASTIC_TILES);
        blockWithItem(ModBlocks.VERDIGRIS_BRICKS);
        blockWithItem(ModBlocks.VERDIGRIS_SLIM_BRICKS);

        blockWithItem(ModBlocks.PLASTIC_TILE);
        stairsBlock(((StairBlock) ModBlocks.PLASTIC_TILES_STAIRS.get()), blockTexture(ModBlocks.PLASTIC_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.PLASTIC_TILES_SLAB.get()), blockTexture(ModBlocks.PLASTIC_TILES.get()), blockTexture(ModBlocks.PLASTIC_TILES.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PLASTIC_BUTTON.get()), blockTexture(ModBlocks.PLASTIC_TILE.get()));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PLASTIC_TRAPDOOR.get()), modLoc("block/plastic_tile"), true ,"cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.PLASTIC_DOOR.get()), modLoc("block/plastic_door_bottom"), modLoc("block/plastic_door_top"), "cutout");
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PLASTIC_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PLASTIC_TILE.get()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
