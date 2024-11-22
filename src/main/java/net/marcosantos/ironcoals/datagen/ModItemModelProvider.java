package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, Constants.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.basicItem(ModItems.IRON_COAL.asItem());
		this.basicItem(ModItems.GOLD_COAL.asItem());
		this.basicItem(ModItems.EMERALD_COAL.asItem());
		this.basicItem(ModItems.DIAMOND_COAL.asItem());
		this.basicItem(ModItems.NETHERITE_COAL.asItem());
		this.basicItem(ModItems.AEON_COAL.asItem());

		this.basicItem(ModItems.COAL_CHUNK.asItem());
		this.basicItem(ModItems.CHARCOAL_CHUNK.asItem());
		this.basicItem(ModItems.IRON_COAL_CHUNK.asItem());
		this.basicItem(ModItems.GOLD_COAL_CHUNK.asItem());
		this.basicItem(ModItems.EMERALD_COAL_CHUNK.asItem());
		this.basicItem(ModItems.DIAMOND_COAL_CHUNK.asItem());

		this.simpleBlockItem(ModBlocks.IRON_COAL.get());
		this.simpleBlockItem(ModBlocks.GOLD_COAL.get());
		this.simpleBlockItem(ModBlocks.EMERALD_COAL.get());
		this.simpleBlockItem(ModBlocks.DIAMOND_COAL.get());

	}
}
