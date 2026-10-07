package net.marcosantos.ironcoals;

import java.util.concurrent.CompletableFuture;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

public class ModDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModEnLangProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModTagProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}

	public static class ModEnLangProvider extends FabricLanguageProvider {
		public ModEnLangProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> fut) {
			super(output, "en_us", fut);
		}

		@Override
		public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
			translationBuilder.add(ModItems.IRON_COAL_BLOCK, "Iron Coal Block");
			translationBuilder.add(ModItems.GOLD_COAL_BLOCK, "Gold Coal Block");
			translationBuilder.add(ModItems.DIAMOND_COAL_BLOCK, "Diamond Coal Block");
			translationBuilder.add(ModItems.EMERALD_COAL_BLOCK, "Emerald Coal Block");
			translationBuilder.add(ModItems.CHARCOAL_CHUNK, "Charcoal Chunk");
			translationBuilder.add(ModItems.COAL_CHUNK, "Coal Chunk");
			translationBuilder.add(ModItems.IRON_COAL, "Iron Coal");
			translationBuilder.add(ModItems.IRON_COAL_CHUNK, "Iron Coal Chunk");
			translationBuilder.add(ModItems.GOLD_COAL, "Gold Coal");
			translationBuilder.add(ModItems.GOLD_COAL_CHUNK, "Gold Coal Chunk");
			translationBuilder.add(ModItems.DIAMOND_COAL, "Diamond Coal");
			translationBuilder.add(ModItems.DIAMOND_COAL_CHUNK, "Diamond Coal Chunk");
			translationBuilder.add(ModItems.EMERALD_COAL, "Emerald Coal");
			translationBuilder.add(ModItems.EMERALD_COAL_CHUNK, "Emerald Coal Chunk");
			translationBuilder.add(ModItems.NETHERITE_COAL, "Netherite Coal");
			translationBuilder.add(ModItems.AEON_COAL, "Aeon Coal");
			translationBuilder.add("message.basiccoalchunk", "Burns 1 item");
			translationBuilder.add("message.orecoal", "Burn Time: %sx coal");
			translationBuilder.add("message.aeoncoal", "Burn Time: Literally forever");
			translationBuilder.add("itemGroup.ironcoals", "Iron Coals");
		}
	}

	public static class ModModelProvider extends FabricModelProvider {
		public ModModelProvider(FabricDataOutput output) {
			super(output);
		}

		@Override
		public void generateBlockStateModels(BlockModelGenerators blockModels) {
			blockModels.createTrivialCube(ModBlocks.IRON_COAL);
			blockModels.createTrivialCube(ModBlocks.GOLD_COAL);
			blockModels.createTrivialCube(ModBlocks.EMERALD_COAL);
			blockModels.createTrivialCube(ModBlocks.DIAMOND_COAL);
		}

		@Override
		public void generateItemModels(ItemModelGenerators itemModels) {
			itemModels.generateFlatItem(ModItems.IRON_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.GOLD_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.EMERALD_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.DIAMOND_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.NETHERITE_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.AEON_COAL, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.COAL_CHUNK, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.CHARCOAL_CHUNK, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.IRON_COAL_CHUNK, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.GOLD_COAL_CHUNK, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.EMERALD_COAL_CHUNK, ModelTemplates.FLAT_ITEM);
			itemModels.generateFlatItem(ModItems.DIAMOND_COAL_CHUNK, ModelTemplates.FLAT_ITEM);

			itemModels.itemModelOutput.accept(ModItems.IRON_COAL_BLOCK, ItemModelUtils
					.plainModel(ModelLocationUtils.getModelLocation(ModItems.IRON_COAL_BLOCK.getBlock())));
			itemModels.itemModelOutput.accept(ModItems.EMERALD_COAL_BLOCK, ItemModelUtils
					.plainModel(ModelLocationUtils.getModelLocation(ModItems.EMERALD_COAL_BLOCK.getBlock())));
			itemModels.itemModelOutput.accept(ModItems.GOLD_COAL_BLOCK, ItemModelUtils
					.plainModel(ModelLocationUtils.getModelLocation(ModItems.GOLD_COAL_BLOCK.getBlock())));
			itemModels.itemModelOutput.accept(ModItems.DIAMOND_COAL_BLOCK, ItemModelUtils
					.plainModel(ModelLocationUtils.getModelLocation(ModItems.DIAMOND_COAL_BLOCK.getBlock())));
		}

		@Override
		public String getName() {
			return "IronCoal Model Provider";
		}
	}

	public static class ModRecipeProvider extends FabricRecipeProvider {
		public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> fut) {
			super(output, fut);
		}

		@Override
		protected RecipeProvider createRecipeProvider(Provider registryLookup, RecipeOutput exporter) {
			return new RecipeProvider(registryLookup, exporter) {
				@Override
				public void buildRecipes() {
					coals_to_block(ModItems.IRON_COAL, ModItems.IRON_COAL_BLOCK);
					coals_to_block(ModItems.GOLD_COAL, ModItems.GOLD_COAL_BLOCK);
					coals_to_block(ModItems.EMERALD_COAL, ModItems.EMERALD_COAL_BLOCK);
					coals_to_block(ModItems.DIAMOND_COAL, ModItems.DIAMOND_COAL_BLOCK);

					block_to_coals(ModItems.IRON_COAL_BLOCK, ModItems.IRON_COAL);
					block_to_coals(ModItems.GOLD_COAL_BLOCK, ModItems.GOLD_COAL);
					block_to_coals(ModItems.EMERALD_COAL_BLOCK, ModItems.EMERALD_COAL);
					block_to_coals(ModItems.DIAMOND_COAL_BLOCK, ModItems.DIAMOND_COAL);

					shaped(RecipeCategory.MISC, ModItems.IRON_COAL, 8)
							.pattern("aaa")
							.pattern("a#a")
							.pattern("aaa")
							.define('a', ItemTags.COALS)
							.define('#', Blocks.IRON_BLOCK)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shaped(RecipeCategory.MISC, ModItems.GOLD_COAL, 8)
							.pattern("aaa")
							.pattern("a#a")
							.pattern("aaa")
							.define('a', ModItems.IRON_COAL)
							.define('#', Blocks.GOLD_BLOCK)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shaped(RecipeCategory.MISC, ModItems.DIAMOND_COAL, 8)
							.pattern("aaa")
							.pattern("a#a")
							.pattern("aaa")
							.define('a', ModItems.GOLD_COAL)
							.define('#', Blocks.DIAMOND_BLOCK)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shapeless(RecipeCategory.MISC, ModItems.NETHERITE_COAL)
							.requires(ModItems.EMERALD_COAL_BLOCK)
							.requires(Items.NETHERITE_INGOT)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shaped(RecipeCategory.MISC, ModItems.EMERALD_COAL, 8)
							.pattern("aaa")
							.pattern("a#a")
							.pattern("aaa")
							.define('a', ModItems.DIAMOND_COAL)
							.define('#', Blocks.EMERALD_BLOCK)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shaped(RecipeCategory.MISC, ModItems.AEON_COAL)
							.pattern("aba")
							.pattern("x#x")
							.pattern("aba")
							.define('a', ModItems.EMERALD_COAL)
							.define('#', Items.NETHERITE_BLOCK)
							.define('x', Items.NETHER_STAR)
							.define('b', Items.HEART_OF_THE_SEA)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output);

					shapeless(RecipeCategory.MISC, ModItems.COAL_CHUNK, 8)
							.requires(ItemTags.COALS)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod(
									"compress_".concat(BuiltInRegistries.ITEM.getKey(ModItems.COAL_CHUNK).getPath())));

					shapeless(RecipeCategory.MISC, ModItems.CHARCOAL_CHUNK, 8)
							.requires(Items.CHARCOAL)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod("compress_"
									.concat(BuiltInRegistries.ITEM.getKey(ModItems.CHARCOAL_CHUNK).getPath())));

					chunk_to_coal(ModItems.IRON_COAL_CHUNK, ModItems.IRON_COAL);
					chunk_to_coal(ModItems.GOLD_COAL_CHUNK, ModItems.GOLD_COAL);
					chunk_to_coal(ModItems.EMERALD_COAL_CHUNK, ModItems.EMERALD_COAL);
					chunk_to_coal(ModItems.DIAMOND_COAL_CHUNK, ModItems.DIAMOND_COAL);

					shapeless(RecipeCategory.MISC, Items.COAL.asItem())
							.requires(ModItems.COAL_CHUNK, 8)
							.group("IronCoals")
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod("decompress_coal"));

					shapeless(RecipeCategory.MISC, Items.CHARCOAL)
							.requires(ModItems.CHARCOAL_CHUNK, 8)
							.group("IronCoals")
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod("decompress_charcoal"));

					coal_to_chunk(ModItems.IRON_COAL, ModItems.IRON_COAL_CHUNK);
					coal_to_chunk(ModItems.GOLD_COAL, ModItems.GOLD_COAL_CHUNK);
					coal_to_chunk(ModItems.EMERALD_COAL, ModItems.EMERALD_COAL_CHUNK);
					coal_to_chunk(ModItems.DIAMOND_COAL, ModItems.DIAMOND_COAL_CHUNK);
				}

				private void coals_to_block(Item coal, BlockItem block) {
					shaped(RecipeCategory.MISC, block)
							.pattern("xxx")
							.pattern("xxx")
							.pattern("xxx")
							.define('x', coal)
							.unlockedBy("stone",
									InventoryChangeTrigger.TriggerInstance
											.hasItems(Blocks.STONE))
							.save(output, mod("compress_".concat(BuiltInRegistries.ITEM.getKey(coal).getPath())));
				}

				private void block_to_coals(BlockItem block, Item coal) {
					shapeless(RecipeCategory.MISC, coal, 9)
							.requires(block)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod(
									"decompress_".concat(BuiltInRegistries.BLOCK.getKey(block.getBlock()).getPath())));
				}

				private void chunk_to_coal(Item chunk, Item coal) {
					shapeless(RecipeCategory.MISC, chunk, 8)
							.requires(coal)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod("compress_".concat(BuiltInRegistries.ITEM.getKey(chunk).getPath())));
				}

				private void coal_to_chunk(Item coal, Item chunk) {
					shapeless(RecipeCategory.MISC, coal)
							.requires(chunk, 8)
							.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
							.save(output, mod("decompress_".concat(BuiltInRegistries.ITEM.getKey(coal).getPath())));
				}

				static String mod(String id) {
					return Constants.MOD_ID + ":" + id;
				}
			};
		}

		@Override
		public String getName() {
			return "Iron Coals Recipe Provider";
		}
	}

	public static class ModTagProvider extends FabricTagProvider.BlockTagProvider {
		public ModTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> fut) {
			super(output, fut);
		}

		@Override
		protected void addTags(Provider wrapperLookup) {
			valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
					.add(ModBlocks.IRON_COAL)
					.add(ModBlocks.GOLD_COAL)
					.add(ModBlocks.EMERALD_COAL)
					.add(ModBlocks.DIAMOND_COAL);

			valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
					.add(ModBlocks.IRON_COAL)
					.add(ModBlocks.GOLD_COAL)
					.add(ModBlocks.EMERALD_COAL)
					.add(ModBlocks.DIAMOND_COAL);
		}
	}

	public static class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
		public ModBlockLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> fut) {
			super(output, fut);
		}

		@Override
		public void generate() {
			dropSelf(ModBlocks.IRON_COAL);
			dropSelf(ModBlocks.GOLD_COAL);
			dropSelf(ModBlocks.EMERALD_COAL);
			dropSelf(ModBlocks.DIAMOND_COAL);
		}
	}
}
