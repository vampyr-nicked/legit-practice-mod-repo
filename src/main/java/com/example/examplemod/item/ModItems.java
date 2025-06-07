package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.custom.ChiselItem;
import com.example.examplemod.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> AVIANFEATHER = ITEMS.register("avianfeather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEMOPHYTE_CLUMP = ITEMS.register("hemophyte_clump",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEMOPHYTE_INGOT = ITEMS.register("hemophyte_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BLOOBERRIES = ITEMS.register("blooberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOOBERRIES)));

    public static final RegistryObject<Item> FIREWOOD = ITEMS.register("firewood",
            () -> new FuelItem(new Item.Properties(),1400));

    public static final RegistryObject<Item> EMBERWOOD = ITEMS.register("emberwood",
            () -> new FuelItem(new Item.Properties(),2800));

    public static final RegistryObject<Item> ECHOWOOD = ITEMS.register("echowood",
            () -> new FuelItem(new Item.Properties(),4200));

    public static final RegistryObject<Item> MISSINGWOOD = ITEMS.register("missingwood",
            () -> new FuelItem(new Item.Properties(),9999));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
