package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.block.DiamondCoalBlock;
import com.flamebom.ironcoals.block.DiamondCoalBlockItem;
import com.flamebom.ironcoals.block.EmeraldCoalBlock;
import com.flamebom.ironcoals.block.EmeraldCoalBlockItem;
import com.flamebom.ironcoals.block.GoldCoalBlock;
import com.flamebom.ironcoals.block.GoldCoalBlockItem;
import com.flamebom.ironcoals.block.IronCoalBlock;
import com.flamebom.ironcoals.block.IronCoalBlockItem;
import com.flamebom.ironcoals.items.AeonCoal;
import com.flamebom.ironcoals.items.BaseCoalChunk;
import com.flamebom.ironcoals.items.CharcoalChunk;
import com.flamebom.ironcoals.items.DiamondCoal;
import com.flamebom.ironcoals.items.DiamondCoalChunk;
import com.flamebom.ironcoals.items.EmeraldCoal;
import com.flamebom.ironcoals.items.EmeraldCoalChunk;
import com.flamebom.ironcoals.items.GoldCoal;
import com.flamebom.ironcoals.items.GoldCoalChunk;
import com.flamebom.ironcoals.items.IronCoal;
import com.flamebom.ironcoals.items.IronCoalChunk;
import com.flamebom.ironcoals.items.NetheriteCoal;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			IronCoals.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			IronCoals.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	public static final RegistryObject<Item> IRONCOAL = ITEMS.register("iron_coal", IronCoal::new);
	
	public static final RegistryObject<Item> GOLDCOAL = ITEMS.register("gold_coal", GoldCoal::new);
	public static final RegistryObject<Item> DIAMONDCOAL = ITEMS.register("diamond_coal", DiamondCoal::new);
	public static final RegistryObject<Item> EMERALDCOAL = ITEMS.register("emerald_coal", EmeraldCoal::new);
	public static final RegistryObject<Item> AEONCOAL = ITEMS.register("aeon_coal", AeonCoal::new);
	public static final RegistryObject<Item> NETHERITECOAL = ITEMS.register("netherite_coal", NetheriteCoal::new);
	
	public static final RegistryObject<Item> CHARCOALCHUNK = ITEMS.register("charcoal_chunk", CharcoalChunk::new);
	public static final RegistryObject<Item> BASECOALCHUNK = ITEMS.register("base_coal_chunk", BaseCoalChunk::new);
	public static final RegistryObject<Item> IRONCOALCHUNK = ITEMS.register("iron_coal_chunk", IronCoalChunk::new);
	public static final RegistryObject<Item> GOLDCOALCHUNK = ITEMS.register("gold_coal_chunk", GoldCoalChunk::new);
	public static final RegistryObject<Item> DIAMONDCOALCHUNK = ITEMS.register("diamond_coal_chunk", DiamondCoalChunk::new);
	public static final RegistryObject<Item> EMERALDCOALCHUNK = ITEMS.register("emerald_coal_chunk", EmeraldCoalChunk::new);
	
	public static final RegistryObject<Item> IRONCOALBLOCKITEM = ITEMS.register("iron_coal_block",IronCoalBlockItem::new);

	public static final RegistryObject<Item> GOLDCOALBLOCKITEM = ITEMS.register("gold_coal_block",GoldCoalBlockItem::new);
	public static final RegistryObject<Item> DIAMONDCOALBLOCKITEM = ITEMS.register("diamond_coal_block",DiamondCoalBlockItem::new);
	public static final RegistryObject<Item> EMERALDCOALBLOCKITEM = ITEMS.register("emerald_coal_block",EmeraldCoalBlockItem::new);
	public static final RegistryObject<Block> IRONCOALBLOCK = BLOCKS.register("iron_coal_block", IronCoalBlock::new);
	public static final RegistryObject<Block> GOLDCOALBLOCK = BLOCKS.register("gold_coal_block", GoldCoalBlock::new);
	public static final RegistryObject<Block> DIAMONDCOALBLOCK = BLOCKS.register("diamond_coal_block", DiamondCoalBlock::new);
	public static final RegistryObject<Block> EMERALDCOALBLOCK = BLOCKS.register("emerald_coal_block", EmeraldCoalBlock::new);
	//public static final RegistryObject<Item> IRONCOALTORCH = ITEMS.register("iron_coal_torch",IronCoalTorchBlockItem::new);
/* Temporary (or maybe forever?) removal of iron torch cause it doesn't fit with the theme very well
	public static final RegistryObject<Block> IRONCOALTORCH = BLOCKS.register("iron_coal_torch", IronCoalTorchBlock::new);
	public static final RegistryObject<Block> IRONCOALWALLTORCH = BLOCKS.register("iron_coal_wall_torch", IronCoalWallTorchBlock::new);
			*/
}
