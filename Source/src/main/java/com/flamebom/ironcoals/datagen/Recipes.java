package com.flamebom.ironcoals.datagen;

import java.util.function.Consumer;

import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraft.item.Items;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
	   // Recipes from that create the same item don't work so you have to comment them out  
		 ShapedRecipeBuilder.shaped(ItemRegistration.IRONCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemTags.COALS)
	         .define('#', Tags.Items.STORAGE_BLOCKS_IRON)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	         ShapedRecipeBuilder.shaped(ItemRegistration.IRONCOALTORCH.get(),4)
	         .pattern("a")
	         .pattern("x")
	         .define('a', ItemRegistration.IRONCOALCHUNK.get())
	         .define('x',Items.STICK)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	        ShapedRecipeBuilder.shaped(ItemRegistration.GOLDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.IRONCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_GOLD)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	 
	        ShapedRecipeBuilder.shaped(ItemRegistration.DIAMONDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.GOLDCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_DIAMOND)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	        ShapedRecipeBuilder.shaped(ItemRegistration.EMERALDCOAL.get(),8)
	         .pattern("aaa")
	         .pattern("a#a")
	         .pattern("aaa")
	         .define('a', ItemRegistration.DIAMONDCOAL.get())
	         .define('#', Tags.Items.STORAGE_BLOCKS_EMERALD)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	        
	        ShapedRecipeBuilder.shaped(ItemRegistration.AEONCOAL.get())
	         .pattern("aba")
	         .pattern("x#x")
	         .pattern("aba")
	         .define('a', ItemRegistration.EMERALDCOAL.get())
	         .define('#', Items.NETHERITE_BLOCK)
	         .define('x', Items.NETHER_STAR)
	         .define('b', Items.HEART_OF_THE_SEA)
	         .group("IronCoals")
	         .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	         .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.IRONCOALBLOCKITEM.get())
	        .requires(ItemRegistration.IRONCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.GOLDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.GOLDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.DIAMONDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.DIAMONDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.EMERALDCOALBLOCKITEM.get())
	        .requires(ItemRegistration.EMERALDCOAL.get(),9)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.BASECOALCHUNK.get(),8)
	        .requires(ItemTags.COALS)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(Items.COAL.getItem())
	        .requires(ItemRegistration.BASECOALCHUNK.get(),8)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .requires(Items.CHARCOAL)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
	        .save(consumer);
	        ShapelessRecipeBuilder.shapeless(Items.CHARCOAL.getItem())
	        .requires(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .group("IronCoals")
	        .unlockedBy("stone", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
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
