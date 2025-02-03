package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, Constants.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.basicItem(ModItems.IRON_COAL.get());
		this.basicItem(ModItems.GOLD_COAL.get());
		this.basicItem(ModItems.EMERALD_COAL.get());
		this.basicItem(ModItems.DIAMOND_COAL.get());
		this.basicItem(ModItems.NETHERITE_COAL.get());
		this.basicItem(ModItems.AEON_COAL.get());

		this.basicItem(ModItems.COAL_CHUNK.get());
		this.basicItem(ModItems.CHARCOAL_CHUNK.get());
		this.basicItem(ModItems.IRON_COAL_CHUNK.get());
		this.basicItem(ModItems.GOLD_COAL_CHUNK.get());
		this.basicItem(ModItems.EMERALD_COAL_CHUNK.get());
		this.basicItem(ModItems.DIAMOND_COAL_CHUNK.get());

		this.simpleBlockItem(ModBlocks.IRON_COAL.get());
		this.simpleBlockItem(ModBlocks.GOLD_COAL.get());
		this.simpleBlockItem(ModBlocks.EMERALD_COAL.get());
		this.simpleBlockItem(ModBlocks.DIAMOND_COAL.get());
	}

	public void simpleBlockItem(Block block) {
		this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block).toString(), ResourceLocation.fromNamespaceAndPath(this.modid, "block/" + BuiltInRegistries.BLOCK.getKey(block).getPath()));
	}
}
