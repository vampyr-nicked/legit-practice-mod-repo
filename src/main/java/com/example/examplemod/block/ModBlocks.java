package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.custom.CloudBlock;
import com.example.examplemod.block.custom.DenseCloudBlock;
import com.example.examplemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<Block> AEROSTONE = registerBlock("aerostone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .jumpFactor(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));

    public static final RegistryObject<Block> CLOUD_BLOCK = registerBlock("cloud_block",
            () -> new CloudBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL).jumpFactor(1f).destroyTime(1)));
    public static final RegistryObject<Block> DENSE_CLOUD_BLOCK = registerBlock("dense_cloud_block",
            () -> new DenseCloudBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL).jumpFactor(2f).destroyTime(2)));

    public static final RegistryObject<Block> GEOSTONE = registerBlock("geostone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .jumpFactor(0f).requiresCorrectToolForDrops().sound(SoundType.STONE).speedFactor(1.5f).destroyTime(1)));

    public static final RegistryObject<Block> VERDIGRIS_BRICKS = registerBlock("verdigris_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(3)));
    public static final RegistryObject<Block> VERDIGRIS_SLIM_BRICKS = registerBlock("verdigris_slim_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(3)));
    public static final RegistryObject<Block> VERDIGRIS_BRICK_STAIRS = registerBlock("verdegris_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDIGRIS_BRICK_STAIRS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(3)));
    public static final RegistryObject<Block> VERDIGRIS_BRICK_SLAB = registerBlock("verdegris_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));

    public static final RegistryObject<Block> PLASTIC_TILES_STAIRS = registerBlock("plastic_tiles_stairs",
            () -> new StairBlock(() -> ModBlocks.PLASTIC_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));

    public static final RegistryObject<Block> PLASTIC_TILES = registerBlock("plastic_tiles",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));
    public static final RegistryObject<Block> PLASTIC_TILE = registerBlock("plastic_tile",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));

    public static final RegistryObject<Block> PLASTIC_TILES_SLAB = registerBlock("plastic_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));
    public static final RegistryObject<Block> PLASTIC_BUTTON = registerBlock("plastic_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> PLASTIC_PRESSURE_PLATE = registerBlock("plastic_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> PLASTIC_DOOR = registerBlock("plastic_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion().destroyTime(1),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> PLASTIC_TRAPDOOR = registerBlock("plastic_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).requiresCorrectToolForDrops().destroyTime(1).sound(SoundType.STONE).noOcclusion(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> ECO_TILES = registerBlock("eco_tiles",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));
    public static final RegistryObject<Block> AQUA_TILES = registerBlock("aqua_tiles",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));
    public static final RegistryObject<Block> MAGMA_TILES = registerBlock("magma_tiles",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
