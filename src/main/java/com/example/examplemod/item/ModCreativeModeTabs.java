package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);

    public static final RegistryObject<CreativeModeTab> AVIARY_ADVANCEMENTS = CREATIVE_MODE_TABS.register("aviary_advancements",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AVIANFEATHER.get()))
            .title(Component.translatable("creativetab.examplemod.aviary_advancements"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.AVIANFEATHER.get());
                output.accept(ModItems.BLOOBERRIES.get());
                output.accept(ModBlocks.AEROSTONE.get());
                output.accept(ModBlocks.GEOSTONE.get());


                output.accept(ModItems.HEMOPHYTE_CLUMP.get());
                output.accept(ModItems.HEMOPHYTE_INGOT.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> AVIARY_TOOLS = CREATIVE_MODE_TABS.register("aviary_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHISEL.get()))
                    .title(Component.translatable("creativetab.examplemod.aviary_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.FIREWOOD.get());
                        output.accept(ModItems.EMBERWOOD.get());
                        output.accept(ModItems.ECHOWOOD.get());
                        output.accept(ModItems.MISSINGWOOD.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AVIARY_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("aviary_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ECO_TILES.get()))
                    .title(Component.translatable("creativetab.examplemod.aviary_building_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PLASTIC_TILES.get());
                        output.accept(ModBlocks.PLASTIC_TILE.get());
                        output.accept(ModBlocks.PLASTIC_TILES_SLAB.get());
                        output.accept(ModBlocks.PLASTIC_TILES_STAIRS.get());
                        output.accept(ModBlocks.PLASTIC_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PLASTIC_BUTTON.get());
                        output.accept(ModBlocks.PLASTIC_DOOR.get());

                        output.accept(ModBlocks.ECO_TILES.get());
                        output.accept(ModBlocks.AQUA_TILES.get());
                        output.accept(ModBlocks.MAGMA_TILES.get());

                        output.accept(ModBlocks.VERDIGRIS_BRICKS.get());
                        output.accept(ModBlocks.VERDIGRIS_BRICK_STAIRS.get());
                        output.accept(ModBlocks.VERDIGRIS_BRICK_SLAB.get());
                        output.accept(ModBlocks.VERDIGRIS_SLIM_BRICKS.get());

                        output.accept(ModBlocks.CLOUD_BLOCK.get());
                        output.accept(ModBlocks.DENSE_CLOUD_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
