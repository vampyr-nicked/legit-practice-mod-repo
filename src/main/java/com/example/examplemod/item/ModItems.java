package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.custom.ChiselItem;
import com.example.examplemod.item.custom.FuelItem;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> HEMOPHYTE_SWORD = ITEMS.register("hemophyte_sword",
            () -> new SwordItem(ModToolTiers.hemophyte, 3, 3, new Item.Properties()));
    public static final RegistryObject<Item> HEMOPHYTE_PICKAXE = ITEMS.register("hemophyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.hemophyte, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> HEMOPHYTE_AXE = ITEMS.register("hemophyte_axe",
            () -> new AxeItem(ModToolTiers.hemophyte, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> HEMOPHYTE_SHOVEL = ITEMS.register("hemophyte_shovel",
            () -> new ShovelItem(ModToolTiers.hemophyte, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> HEMOPHYTE_HOE = ITEMS.register("hemophyte_hoe",
            () -> new HoeItem(ModToolTiers.hemophyte, 0, 0, new Item.Properties()));

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

    public static final RegistryObject<Item> TEDDYBEAR = ITEMS.register("teddy_bear",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
