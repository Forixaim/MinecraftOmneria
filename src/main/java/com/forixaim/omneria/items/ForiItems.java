package com.forixaim.omneria.items;

import com.forixaim.omneria.Omneria;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForiItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Omneria.ModID);
    public static final RegistryObject<Item> Raw_Orichalcum = ITEMS.register("raw_orichalcum", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> Orichalcum_Ingot = ITEMS.register("orichalcum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static void Register(IEventBus Bus)
    {
        ITEMS.register(Bus);
    }
}
