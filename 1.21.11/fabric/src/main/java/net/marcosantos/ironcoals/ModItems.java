package net.marcosantos.ironcoals;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

import net.marcosantos.ironcoals.world.item.IronCoalItem;
import net.marcosantos.ironcoals.world.item.IronCoalBlockItem;
import net.marcosantos.ironcoals.world.item.AeonCoalItem;
import net.marcosantos.ironcoals.world.item.BasicCoalChunkItem;

public class ModItems {

	static ResourceKey<Item> create(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
	}

	public static Item IRON_COAL;
	public static Item GOLD_COAL;
	public static Item EMERALD_COAL;
	public static Item DIAMOND_COAL;
	public static Item NETHERITE_COAL;
	public static Item AEON_COAL;

	public static Item COAL_CHUNK;
	public static Item CHARCOAL_CHUNK;
	public static Item IRON_COAL_CHUNK;
	public static Item GOLD_COAL_CHUNK;
	public static Item EMERALD_COAL_CHUNK;
	public static Item DIAMOND_COAL_CHUNK;

	public static BlockItem IRON_COAL_BLOCK;
	public static BlockItem GOLD_COAL_BLOCK;
	public static BlockItem EMERALD_COAL_BLOCK;
	public static BlockItem DIAMOND_COAL_BLOCK;

	public static void doRegister() {
		IRON_COAL = Registry.register(BuiltInRegistries.ITEM, create("iron_coal"),
				new IronCoalItem(ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN, false, create("iron_coal")));
		GOLD_COAL = Registry.register(BuiltInRegistries.ITEM, create("gold_coal"),
				new IronCoalItem(ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN, false, create("gold_coal")));
		EMERALD_COAL = Registry.register(BuiltInRegistries.ITEM, create("emerald_coal"),
				new IronCoalItem(ChatFormatting.GREEN, () -> Config.EMERALD_COAL_BURN, false, create("emerald_coal")));
		DIAMOND_COAL = Registry.register(BuiltInRegistries.ITEM, create("diamond_coal"),
				new IronCoalItem(ChatFormatting.AQUA, () -> Config.DIAMOND_COAL_BURN, false, create("diamond_coal")));
		NETHERITE_COAL = Registry.register(BuiltInRegistries.ITEM, create("netherite_coal"),
				new IronCoalItem(ChatFormatting.DARK_GRAY, () -> Config.NETHERITE_COAL_BURN, false,
						create("netherite_coal")));
		AEON_COAL = Registry.register(BuiltInRegistries.ITEM, create("aeon_coal"),
				new AeonCoalItem(create("aeon_coal")));

		COAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("coal_chunk"),
				new BasicCoalChunkItem(create("coal_chunk")));
		CHARCOAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("charcoal_chunk"),
				new BasicCoalChunkItem(create("charcoal_chunk")));

		IRON_COAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("iron_coal_chunk"),
				new IronCoalItem(ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN / 8, true,
						create("iron_coal_chunk")));
		GOLD_COAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("gold_coal_chunk"),
				new IronCoalItem(ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN / 8, true,
						create("gold_coal_chunk")));
		EMERALD_COAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("emerald_coal_chunk"),
				new IronCoalItem(ChatFormatting.GREEN, () -> Config.EMERALD_COAL_BURN / 8, true,
						create("emerald_coal_chunk")));
		DIAMOND_COAL_CHUNK = Registry.register(BuiltInRegistries.ITEM, create("diamond_coal_chunk"),
				new IronCoalItem(ChatFormatting.AQUA, () -> Config.DIAMOND_COAL_BURN / 8, true,
						create("diamond_coal_chunk")));

		IRON_COAL_BLOCK = Registry.register(BuiltInRegistries.ITEM, create("iron_coal_block_item"),
				new IronCoalBlockItem(() -> ModBlocks.IRON_COAL, ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN * 10,
						create("iron_coal_block_item")));
		GOLD_COAL_BLOCK = Registry.register(BuiltInRegistries.ITEM, create("gold_coal_block_item"),
				new IronCoalBlockItem(() -> ModBlocks.GOLD_COAL, ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN * 10,
						create("gold_coal_block_item")));
		EMERALD_COAL_BLOCK = Registry.register(BuiltInRegistries.ITEM, create("emerald_coal_block_item"),
				new IronCoalBlockItem(() -> ModBlocks.EMERALD_COAL, ChatFormatting.GREEN,
						() -> Config.EMERALD_COAL_BURN * 10,
						create("emerald_coal_block_item")));
		DIAMOND_COAL_BLOCK = Registry.register(BuiltInRegistries.ITEM, create("diamond_coal_block_item"),
				new IronCoalBlockItem(() -> ModBlocks.DIAMOND_COAL, ChatFormatting.AQUA,
						() -> Config.DIAMOND_COAL_BURN * 10,
						create("diamond_coal_block_item")));

	}
}
