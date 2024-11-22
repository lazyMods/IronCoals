package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
	public ModLanguageProvider(PackOutput output) {
		super(output, Constants.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {

		addBlock(ModBlocks.IRON_COAL, "Iron Coal Block");
		addBlock(ModBlocks.GOLD_COAL, "Gold Coal Block");
		addBlock(ModBlocks.DIAMOND_COAL, "Diamond Coal Block");
		addBlock(ModBlocks.EMERALD_COAL, "Emerald Coal Block");

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
