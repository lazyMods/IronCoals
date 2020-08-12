package com.flamebom.ironcoals.datagen;

import java.util.function.Consumer;

import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}
	 @Override
	    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.IRONCOAL.get())
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_COAL)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.GOLDCOAL.get())
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_COAL)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.DIAMONDCOAL.get())
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_COAL)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.EMERALDCOAL.get())
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_COAL)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.AEONCOAL.get())
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_COAL)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
}
	 }
