package com.forixaim.omneria.util;

import com.forixaim.omneria.Omneria;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraftforge.common.Tags;

public class ForiTags
{
	public static class Blocks
	{
		private static final TagKey<Block> BlockTags(String Name)
		{
			return BlockTags.create(new ResourceLocation(Omneria.ModID, Name));
		}
		private static final TagKey<Block> Forge(String Name)
		{
			return BlockTags.create(new ResourceLocation("forge", Name));
		}
	}
	public static class Items
	{
		public static final TagKey<Item> ORICHALCUM_INGOT = ItemTags.create(new ResourceLocation(Omneria.ModID, "ingots/orichalcum"));
		public static final TagKey<Item> ORICHALCUM_BLOCK = ItemTags.create(new ResourceLocation(Omneria.ModID, "blocks/orichalcum"));
		private static final TagKey<Item> BlockTags(String Name)
		{
			return ItemTags.create(new ResourceLocation(Omneria.ModID, Name));
		}
		private static final TagKey<Item> Forge(String Name)
		{
			return ItemTags.create(new ResourceLocation("forge", Name));
		}
	}
}
