package net.marcosantos.ironcoals.registries;

import com.google.common.base.Supplier;
import net.marcosantos.ironcoals.Config;
import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.world.item.*;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

	public static DeferredItem<Item> IRON_COAL = regCoal("iron_coal", ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN.get());
	public static DeferredItem<Item> GOLD_COAL = regCoal("gold_coal", ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN.get());
	public static DeferredItem<Item> EMERALD_COAL = regCoal("emerald_coal", ChatFormatting.GREEN, () -> Config.EMERALD_COAL_BURN.get());
	public static DeferredItem<Item> DIAMOND_COAL = regCoal("diamond_coal", ChatFormatting.AQUA, () -> Config.DIAMOND_COAL_BURN.get());
	public static DeferredItem<Item> NETHERITE_COAL = regCoal("netherite_coal", ChatFormatting.DARK_GRAY, () -> Config.NETHERITE_COAL_BURN.get());
	public static DeferredItem<Item> AEON_COAL = ITEMS.register("aeon_coal", AeonCoalItem::new);

	public static DeferredItem<Item> COAL_CHUNK = ITEMS.register("coal_chunk", BasicCoalChunkItem::new);
	public static DeferredItem<Item> CHARCOAL_CHUNK = ITEMS.register("charcoal_chunk", BasicCoalChunkItem::new);
	public static DeferredItem<Item> IRON_COAL_CHUNK = regCoalChunk("iron_coal_chunk", ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN.get());
	public static DeferredItem<Item> GOLD_COAL_CHUNK = regCoalChunk("gold_coal_chunk", ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN.get());
	public static DeferredItem<Item> EMERALD_COAL_CHUNK = regCoalChunk("emerald_coal_chunk", ChatFormatting.GREEN, () -> Config.EMERALD_COAL_BURN.get());
	public static DeferredItem<Item> DIAMOND_COAL_CHUNK = regCoalChunk("diamond_coal_chunk", ChatFormatting.AQUA, () -> Config.DIAMOND_COAL_BURN.get());

	public static DeferredItem<BlockItem> IRON_COAL_BLOCK = regCoalBlock("iron_coal_block", ChatFormatting.GRAY, () -> Config.IRON_COAL_BURN.get(), ModBlocks.IRON_COAL::get);
	public static DeferredItem<BlockItem> GOLD_COAL_BLOCK = regCoalBlock("gold_coal_block", ChatFormatting.GOLD, () -> Config.GOLD_COAL_BURN.get(), ModBlocks.GOLD_COAL::get);
	public static DeferredItem<BlockItem> EMERALD_COAL_BLOCK = regCoalBlock("emerald_coal_block", ChatFormatting.GREEN, () -> Config.EMERALD_COAL_BURN.get(), ModBlocks.EMERALD_COAL::get);
	public static DeferredItem<BlockItem> DIAMOND_COAL_BLOCK = regCoalBlock("diamond_coal_block", ChatFormatting.AQUA, () -> Config.DIAMOND_COAL_BURN.get(), ModBlocks.DIAMOND_COAL::get);

	private static DeferredItem<Item> regCoal(String name, ChatFormatting color, Supplier<Integer> burnTime) {
		return ITEMS.register(name, () -> new IronCoalItem(color, burnTime, false));
	}

	private static DeferredItem<Item> regCoalChunk(String name, ChatFormatting color, Supplier<Integer> burnTime) {
		return ITEMS.register(name, () -> new IronCoalItem(color, burnTime, true));
	}

	private static DeferredItem<BlockItem> regCoalBlock(String name, ChatFormatting color, Supplier<Integer> burnTime, Supplier<Block> block) {
		return ITEMS.register(name, () -> new IronCoalBlockItem(block, color, burnTime));
	}

	public static void init(IEventBus bus) {
		ITEMS.register(bus);
	}
}
