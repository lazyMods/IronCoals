package com.flamebom.ironcoals.datagen;

import java.util.function.Consumer;

import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.advancements.critereon.FluidPredicate;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.package-info;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.server.players.UserBanListEntry;
import net.minecraftforge.common.Tags;
import net.minecraft.world.item.BookItem;

public class Recipes extends FinishedRecipe {
	public Recipes(BuiltinRegistries generatorIn) {
		super(generatorIn);
	}

	@Override
	    protected void buildShapelessRecipes(Consumer<package-info> consumer) {
	   // Recipes from that create the same item don't work so you have to comment them out  
		 RecipeProvider.shaped(ItemRegistration.IRONCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', UserBanListEntry.COALS)
	         .define('#', Tags.Items.STORAGE_BLOCKS_IRON)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	         RecipeProvider.shaped(ItemRegistration.IRONCOALTORCH.get(),4)
	         .pattern("a")
	         .pattern("x")
	         .define('a', ItemRegistration.IRONCOALCHUNK.get())
	         .define('x',BookItem.STICK)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	        RecipeProvider.shaped(ItemRegistration.GOLDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.IRONCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_GOLD)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	 
	        RecipeProvider.shaped(ItemRegistration.DIAMONDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.GOLDCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_DIAMOND)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	        RecipeProvider.shaped(ItemRegistration.EMERALDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.DIAMONDCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_EMERALD)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	        
	        RecipeProvider.shaped(ItemRegistration.AEONCOAL.get())
	         .pattern("aba")
	         .pattern("x#x")
	         .pattern("aba")
	         .define('a', ItemRegistration.EMERALDCOAL.get())
	         .define('#', BookItem.NETHERITE_BLOCK)
	         .define('x', BookItem.NETHER_STAR)
	         .define('b', BookItem.HEART_OF_THE_SEA)
	         .group("IronCoals")
	         .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	         .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.IRONCOALBLOCKITEM.get())
	        .requires(ItemRegistration.IRONCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.GOLDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.GOLDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.DIAMONDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.DIAMONDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.EMERALDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.EMERALDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.BASECOALCHUNK.get(),8)
	        .requires(UserBanListEntry.COALS)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(BookItem.COAL.getItem())
	        .requires(ItemRegistration.BASECOALCHUNK.get(),8)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .requires(BookItem.CHARCOAL)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        ShapedRecipeBuilder.shapeless(BookItem.CHARCOAL.getItem())
	        .requires(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .group("IronCoals")
	        .unlockedBy("stone", FluidPredicate.Builder.hasItems(CropBlock.STONE))
	        .save(consumer);
	        
	        
	       /* 
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOAL.get())
	        .addIngredient(ItemRegistration.DIAMONDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.DIAMONDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOAL.get())
	        .addIngredient(ItemRegistration.EMERALDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.EMERALDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	       
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOAL.get())
	        .addIngredient(ItemRegistration.GOLDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.GOLDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOAL.get())
	        .addIngredient(ItemRegistration.IRONCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.IRONCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOAL.get(),9)
	        .addIngredient(ItemRegistration.IRONCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOAL.get(),9)
	        .addIngredient(ItemRegistration.GOLDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOAL.get(),9)
	        .addIngredient(ItemRegistration.DIAMONDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOAL.get(),9)
	        .addIngredient(ItemRegistration.EMERALDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);*/
	        
}
}
