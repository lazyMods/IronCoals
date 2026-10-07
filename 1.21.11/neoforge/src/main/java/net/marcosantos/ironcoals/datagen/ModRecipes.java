package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class ModRecipes extends RecipeProvider {
	public ModRecipes(HolderLookup.Provider registries, RecipeOutput output) {
		super(registries, output);
	}

	@Override
	protected void buildRecipes() {
		coals_to_block(ModItems.IRON_COAL, ModItems.IRON_COAL_BLOCK);
		coals_to_block(ModItems.GOLD_COAL, ModItems.GOLD_COAL_BLOCK);
		coals_to_block(ModItems.EMERALD_COAL, ModItems.EMERALD_COAL_BLOCK);
		coals_to_block(ModItems.DIAMOND_COAL, ModItems.DIAMOND_COAL_BLOCK);

		block_to_coals(ModItems.IRON_COAL_BLOCK, ModItems.IRON_COAL);
		block_to_coals(ModItems.GOLD_COAL_BLOCK, ModItems.GOLD_COAL);
		block_to_coals(ModItems.EMERALD_COAL_BLOCK, ModItems.EMERALD_COAL);
		block_to_coals(ModItems.DIAMOND_COAL_BLOCK, ModItems.DIAMOND_COAL);

		shaped(RecipeCategory.MISC, ModItems.IRON_COAL.get(), 8)
				.pattern("aaa")
				.pattern("a#a")
				.pattern("aaa")
				.define('a', ItemTags.COALS)
				.define('#', Tags.Items.STORAGE_BLOCKS_IRON)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shaped(RecipeCategory.MISC, ModItems.GOLD_COAL.get(), 8)
				.pattern("aaa")
				.pattern("a#a")
				.pattern("aaa")
				.define('a', ModItems.IRON_COAL.get())
				.define('#', Tags.Items.STORAGE_BLOCKS_GOLD)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shaped(RecipeCategory.MISC, ModItems.DIAMOND_COAL.get(), 8)
				.pattern("aaa")
				.pattern("a#a")
				.pattern("aaa")
				.define('a', ModItems.GOLD_COAL.get())
				.define('#', Tags.Items.STORAGE_BLOCKS_DIAMOND)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shapeless(RecipeCategory.MISC, ModItems.NETHERITE_COAL.get())
				.requires(ModItems.EMERALD_COAL_BLOCK.get())
				.requires(Items.NETHERITE_INGOT)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shaped(RecipeCategory.MISC, ModItems.EMERALD_COAL.get(), 8)
				.pattern("aaa")
				.pattern("a#a")
				.pattern("aaa")
				.define('a', ModItems.DIAMOND_COAL.get())
				.define('#', Tags.Items.STORAGE_BLOCKS_EMERALD)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shaped(RecipeCategory.MISC, ModItems.AEON_COAL.get())
				.pattern("aba")
				.pattern("x#x")
				.pattern("aba")
				.define('a', ModItems.EMERALD_COAL.get())
				.define('#', Items.NETHERITE_BLOCK)
				.define('x', Items.NETHER_STAR)
				.define('b', Items.HEART_OF_THE_SEA)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output);

		shapeless(RecipeCategory.MISC, ModItems.COAL_CHUNK.get(), 8)
				.requires(ItemTags.COALS)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("compress_".concat(ModItems.COAL_CHUNK.getId().getPath())));

		shapeless(RecipeCategory.MISC, ModItems.CHARCOAL_CHUNK.get(), 8)
				.requires(Items.CHARCOAL)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("compress_".concat(ModItems.CHARCOAL_CHUNK.getId().getPath())));

		chunk_to_coal(ModItems.IRON_COAL_CHUNK, ModItems.IRON_COAL);
		chunk_to_coal(ModItems.GOLD_COAL_CHUNK, ModItems.GOLD_COAL);
		chunk_to_coal(ModItems.EMERALD_COAL_CHUNK, ModItems.EMERALD_COAL);
		chunk_to_coal(ModItems.DIAMOND_COAL_CHUNK, ModItems.DIAMOND_COAL);

		shapeless(RecipeCategory.MISC, Items.COAL.asItem())
				.requires(ModItems.COAL_CHUNK.get(), 8)
				.group("IronCoals")
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("decompress_coal"));

		shapeless(RecipeCategory.MISC, Items.CHARCOAL)
				.requires(ModItems.CHARCOAL_CHUNK.get(), 8)
				.group("IronCoals")
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("decompress_charcoal"));

		coal_to_chunk(ModItems.IRON_COAL, ModItems.IRON_COAL_CHUNK);
		coal_to_chunk(ModItems.GOLD_COAL, ModItems.GOLD_COAL_CHUNK);
		coal_to_chunk(ModItems.EMERALD_COAL, ModItems.EMERALD_COAL_CHUNK);
		coal_to_chunk(ModItems.DIAMOND_COAL, ModItems.DIAMOND_COAL_CHUNK);
	}

	private void coals_to_block(DeferredItem<Item> coal, DeferredItem<BlockItem> block) {
		shaped(RecipeCategory.MISC, block.get())
				.pattern("xxx")
				.pattern("xxx")
				.pattern("xxx")
				.define('x', coal.get())
				.unlockedBy("stone",
						InventoryChangeTrigger.TriggerInstance
								.hasItems(Blocks.STONE))
				.save(output, mod("compress_".concat(coal.getId().getPath())));
	}

	private void block_to_coals(DeferredItem<BlockItem> block, DeferredItem<Item> coal) {
		shapeless(RecipeCategory.MISC, coal.get(), 9)
				.requires(block.get())
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("decompress_".concat(block.getId().getPath())));
	}

	private void chunk_to_coal(DeferredItem<Item> chunk, DeferredItem<Item> coal) {
		shapeless(RecipeCategory.MISC, chunk.get(), 8)
				.requires(coal.get())
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("compress_".concat(chunk.getId().getPath())));
	}

	private void coal_to_chunk(DeferredItem<Item> coal, DeferredItem<Item> chunk) {
		shapeless(RecipeCategory.MISC, coal.get())
				.requires(chunk.get(), 8)
				.unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.STONE))
				.save(output, mod("decompress_".concat(coal.getId().getPath())));
	}

	static String mod(String id) {
		return Constants.MOD_ID + ":" + id;
	}

	public static class Runner extends RecipeProvider.Runner {
		public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
			super(output, registries);
		}

		@Override
		protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
			return new ModRecipes(registries, output);
		}

		@Override
		public String getName() {
			return "IronCoals Recipes";
		}
	}
}
