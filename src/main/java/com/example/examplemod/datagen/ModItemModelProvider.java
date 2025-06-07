package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AVIANFEATHER);
        simpleItem(ModItems.FIREWOOD);
        simpleItem(ModItems.EMBERWOOD);
        simpleItem(ModItems.ECHOWOOD);
        simpleItem(ModItems.CHISEL);
        simpleItem(ModItems.BLOOBERRIES);
        simpleItem(ModItems.MISSINGWOOD);
        simpleItem(ModItems.HEMOPHYTE_CLUMP);
        simpleItem(ModItems.HEMOPHYTE_INGOT);

        simpleBlockItem(ModBlocks.PLASTIC_DOOR);

        buttonItem(ModBlocks.PLASTIC_BUTTON, ModBlocks.PLASTIC_TILE);
        evenSimplerBlockItem(ModBlocks.PLASTIC_TILES_STAIRS);
        evenSimplerBlockItem(ModBlocks.PLASTIC_TILES_SLAB);
        evenSimplerBlockItem(ModBlocks.PLASTIC_PRESSURE_PLATE);

        evenSimplerBlockItem(ModBlocks.VERDIGRIS_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.VERDIGRIS_BRICK_SLAB);


    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ExampleMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }


    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(ExampleMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExampleMod.MODID + ":" + "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExampleMod.MODID + ":" + "item/" + item.getId().getPath()));
    }


}
