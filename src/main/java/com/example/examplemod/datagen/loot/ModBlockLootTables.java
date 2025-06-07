package com.example.examplemod.datagen.loot;

import com.example.examplemod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AEROSTONE.get());
        this.dropSelf(ModBlocks.GEOSTONE.get());
        this.dropSelf(ModBlocks.CLOUD_BLOCK.get());
        this.dropSelf(ModBlocks.DENSE_CLOUD_BLOCK.get());
        this.dropSelf(ModBlocks.PLASTIC_TILES.get());
        this.dropSelf(ModBlocks.ECO_TILES.get());
        this.dropSelf(ModBlocks.AQUA_TILES.get());
        this.dropSelf(ModBlocks.MAGMA_TILES.get());
        this.dropSelf(ModBlocks.VERDIGRIS_BRICKS.get());
        this.dropSelf(ModBlocks.VERDIGRIS_SLIM_BRICKS.get());

        this.dropSelf(ModBlocks.PLASTIC_TILE.get());
        this.dropSelf(ModBlocks.PLASTIC_BUTTON.get());
        this.dropSelf(ModBlocks.PLASTIC_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PLASTIC_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PLASTIC_TILES_STAIRS.get());

        this.add(ModBlocks.PLASTIC_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PLASTIC_TILES_SLAB.get()));
        this.add(ModBlocks.PLASTIC_DOOR.get(),
                block -> createDoorTable(ModBlocks.PLASTIC_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
