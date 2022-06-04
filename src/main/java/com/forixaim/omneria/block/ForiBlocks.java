package com.forixaim.omneria.block;

import com.forixaim.omneria.Omneria;
import com.forixaim.omneria.items.CreativeTabs;
import com.forixaim.omneria.items.ForiItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ForiBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Omneria.ModID);

	public static final RegistryObject<Block> Orichalcum_Block = RegisterBlock("orichalcum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(15f).requiresCorrectToolForDrops()), CreativeTabs.OMNERIA_MATS);
	public static final RegistryObject<Block> Raw_Orichalcum_Block = RegisterBlock("raw_orichalcum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeTabs.OMNERIA_MATS);
	public static final RegistryObject<Block> Orichalcum_Ore = RegisterBlock("orichalcum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), CreativeTabs.OMNERIA_MATS);
	public static final RegistryObject<Block> Deepslate_Orichalcum_Ore = RegisterBlock("deepslate_orichalcum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f).requiresCorrectToolForDrops()), CreativeTabs.OMNERIA_MATS);


	public static <T extends Block> RegistryObject<T> RegisterBlock(String Name, Supplier<T> Block, CreativeModeTab Tab)
	{
		RegistryObject<T> toReturn = BLOCKS.register(Name, Block);
		RegisterBlockItem(Name, toReturn, Tab);
		return toReturn;
	}

    private static <T extends Block> RegistryObject<Item> RegisterBlockItem(String Name, RegistryObject<T> Block, CreativeModeTab Tab)
    {
        return ForiItems.ITEMS.register(Name, () -> new BlockItem(Block.get(), new Item.Properties().tab(Tab)));
    }
	public static void Register(IEventBus Bus)
	{
		BLOCKS.register(Bus);
	}
}
