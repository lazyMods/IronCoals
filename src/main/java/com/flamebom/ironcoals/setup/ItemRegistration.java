package com.flamebom.ironcoals.setup;




import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.items.AeonCoal;
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
}
