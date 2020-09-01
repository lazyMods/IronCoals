package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class Language extends LanguageProvider {
	public Language(DataGenerator gen) {
		super(gen, IronCoals.MOD_ID, "en_us");

	}

	@Override
	protected void addTranslations() {
		
		addBlock(BlockRegistration.IRONCOALBLOCK, "Iron Coal Block");
		addBlock(BlockRegistration.GOLDCOALBLOCK, "Gold Coal Block");
		addBlock(BlockRegistration.DIAMONDCOALBLOCK, "Diamond Coal Block");
		addBlock(BlockRegistration.EMERALDCOALBLOCK, "Emerald Coal Block");
	
		addItem(ItemRegistration.IRONCOAL, "Iron Coal");
		addItem(ItemRegistration.GOLDCOAL, "Gold Coal");
		addItem(ItemRegistration.DIAMONDCOAL, "Diamond Coal");
		addItem(ItemRegistration.EMERALDCOAL, "Emerald Coal");
		addItem(ItemRegistration.AEONCOAL, "Aeon Coal");
		
	add("message.ironcoal","Burn Time: %sx coal");
	add("message.ironcoalblock","Burn Time: 15.0x coal");
	add("message.goldcoal","Burn Time: 3.0x coal");
	add("message.goldcoalblock","Burn Time: 30.0x coal");
	add("message.diamondcoal","Burn Time: 6.0x coal");
	add("message.diamondcoalblock","Burn Time: 60.0x coal");
	add("message.emeraldcoal","Burn Time: 12.0x coal");
	add("message.emeraldcoalblock","Burn Time: 120.0x coal");
	add("message.aeoncoal","Burn Time: Literally forever");
	
		   add("itemGroup.ironcoals", "Iron Coals");
		
		
	}
}
