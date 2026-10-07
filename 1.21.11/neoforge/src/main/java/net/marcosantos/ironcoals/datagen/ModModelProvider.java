package net.marcosantos.ironcoals.datagen;

import java.util.stream.Stream;

import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.server.ReloadableServerRegistries.Holder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.marcosantos.ironcoals.Constants;

public class ModModelProvider extends ModelProvider {
	public ModModelProvider(PackOutput output) {
		super(output, Constants.MOD_ID);
	}

	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		blockModels.createTrivialCube(ModBlocks.IRON_COAL.get());
		blockModels.createTrivialCube(ModBlocks.GOLD_COAL.get());
		blockModels.createTrivialCube(ModBlocks.EMERALD_COAL.get());
		blockModels.createTrivialCube(ModBlocks.DIAMOND_COAL.get());

		itemModels.generateFlatItem(ModItems.IRON_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.GOLD_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.EMERALD_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.DIAMOND_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.NETHERITE_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.AEON_COAL.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.CHARCOAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.IRON_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.GOLD_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.EMERALD_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(ModItems.DIAMOND_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);

		getKnownItems().forEach((it) -> {
			if (it.value() instanceof BlockItem bitem) {
				Identifier identifier = ModelLocationUtils.getModelLocation(bitem.getBlock());
				itemModels.itemModelOutput.accept(bitem, ItemModelUtils.plainModel(identifier));
			}
		});
	}
}
