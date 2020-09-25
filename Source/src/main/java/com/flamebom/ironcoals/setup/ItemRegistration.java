package com.flamebom.ironcoals.setup;




import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.block.DiamondCoalBlockItem;
import com.flamebom.ironcoals.block.EmeraldCoalBlockItem;
import com.flamebom.ironcoals.block.GoldCoalBlockItem;
import com.flamebom.ironcoals.block.IronCoalBlockItem;
import com.flamebom.ironcoals.items.AeonCoal;
import com.flamebom.ironcoals.items.BaseCoalChunk;
import com.flamebom.ironcoals.items.DiamondCoal;
import com.flamebom.ironcoals.items.EmeraldCoal;
import com.flamebom.ironcoals.items.GoldCoal;
import com.flamebom.ironcoals.items.IronCoal;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistration {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			IronCoals.MOD_ID);
	public static final RegistryObject<Item> IRONCOAL = ITEMS.register("iron_coal", IronCoal::new);
	
	public static final RegistryObject<Item> GOLDCOAL = ITEMS.register("gold_coal", GoldCoal::new);
	public static final RegistryObject<Item> DIAMONDCOAL = ITEMS.register("diamond_coal", DiamondCoal::new);
	public static final RegistryObject<Item> EMERALDCOAL = ITEMS.register("emerald_coal", EmeraldCoal::new);
	public static final RegistryObject<Item> AEONCOAL = ITEMS.register("aeon_coal", AeonCoal::new);
	public static final RegistryObject<Item> BASECOALCHUNK = ITEMS.register("base_coal_chunk", BaseCoalChunk::new);
	
	public static final RegistryObject<Item> IRONCOALBLOCKITEM = ITEMS.register("iron_coal_block",IronCoalBlockItem::new);
	public static final RegistryObject<Item> GOLDCOALBLOCKITEM = ITEMS.register("gold_coal_block",GoldCoalBlockItem::new);
	public static final RegistryObject<Item> DIAMONDCOALBLOCKITEM = ITEMS.register("diamond_coal_block",DiamondCoalBlockItem::new);
	public static final RegistryObject<Item> EMERALDCOALBLOCKITEM = ITEMS.register("emerald_coal_block",EmeraldCoalBlockItem::new);
}
