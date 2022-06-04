package com.forixaim.omneria.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
	public static final CreativeModeTab OMNERIA_MATS = new CreativeModeTab("omneria_mats") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ForiItems.Orichalcum_Ingot.get());
		}
	};
}
