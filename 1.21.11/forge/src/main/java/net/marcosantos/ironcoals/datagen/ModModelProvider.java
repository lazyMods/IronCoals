package net.marcosantos.ironcoals.datagen;

import java.util.stream.Stream;

import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraftforge.registries.RegistryObject;

public class ModModelProvider extends ModelProvider {
	public ModModelProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected Stream<Block> getKnownBlocks() {
		return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get);
	}

	@Override
	protected Stream<Item> getKnownItems() {
		return ModItems.ITEMS.getEntries().stream().map(RegistryObject::get);
	}

	@Override
	protected BlockModelGenerators getBlockModelGenerators(BlockStateGeneratorCollector blocks, ItemInfoCollector items,
			SimpleModelCollector models) {
		return new BlockModelGenerators(blocks, items, models) {
			@Override
			public void run() {
				createTrivialCube(ModBlocks.IRON_COAL.get());
				createTrivialCube(ModBlocks.GOLD_COAL.get());
				createTrivialCube(ModBlocks.EMERALD_COAL.get());
				createTrivialCube(ModBlocks.DIAMOND_COAL.get());
			}
		};
	}

	@Override
	protected ItemModelGenerators getItemModelGenerators(ItemInfoCollector items, SimpleModelCollector models) {
		return new ItemModelGenerators(items, models) {
			@Override
			public void run() {
				generateFlatItem(ModItems.IRON_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.GOLD_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.EMERALD_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.DIAMOND_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.NETHERITE_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.AEON_COAL.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.CHARCOAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.IRON_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.GOLD_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.EMERALD_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				generateFlatItem(ModItems.DIAMOND_COAL_CHUNK.get(), ModelTemplates.FLAT_ITEM);
				if (itemModelOutput instanceof ModelProvider.ItemInfoCollector collector) {
					getKnownItems().forEach(p_447944_ -> {
						if (p_447944_ instanceof BlockItem blockitem) {
							Identifier identifier = ModelLocationUtils.getModelLocation(blockitem.getBlock());
							collector.accept(blockitem, ItemModelUtils.plainModel(identifier));
						}
					});
				}
			}
		};
	}
}
