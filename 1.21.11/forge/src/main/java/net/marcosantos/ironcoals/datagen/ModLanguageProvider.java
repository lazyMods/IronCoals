package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
	public ModLanguageProvider(PackOutput output) {
		super(output, Constants.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		addItem(ModItems.IRON_COAL_BLOCK, "Iron Coal Block");
		addItem(ModItems.GOLD_COAL_BLOCK, "Gold Coal Block");
		addItem(ModItems.DIAMOND_COAL_BLOCK, "Diamond Coal Block");
		addItem(ModItems.EMERALD_COAL_BLOCK, "Emerald Coal Block");

		addItem(ModItems.CHARCOAL_CHUNK, "Charcoal Chunk");
		addItem(ModItems.COAL_CHUNK, "Coal Chunk");
		addItem(ModItems.IRON_COAL, "Iron Coal");
		addItem(ModItems.IRON_COAL_CHUNK, "Iron Coal Chunk");
		addItem(ModItems.GOLD_COAL, "Gold Coal");
		addItem(ModItems.GOLD_COAL_CHUNK, "Gold Coal Chunk");
		addItem(ModItems.DIAMOND_COAL, "Diamond Coal");
		addItem(ModItems.DIAMOND_COAL_CHUNK, "Diamond Coal Chunk");
		addItem(ModItems.EMERALD_COAL, "Emerald Coal");
		addItem(ModItems.EMERALD_COAL_CHUNK, "Emerald Coal Chunk");
		addItem(ModItems.NETHERITE_COAL, "Netherite Coal");
		addItem(ModItems.AEON_COAL, "Aeon Coal");

		add("message.basiccoalchunk", "Burns 1 item");
		add("message.orecoal", "Burn Time: %sx coal");
		add("message.aeoncoal", "Burn Time: Literally forever");
		add("itemGroup.ironcoals", "Iron Coals");
	}
}
