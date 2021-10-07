package com.flamebom.ironcoals.items;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;

public class BaseCoalChunk extends Item {
	public BaseCoalChunk() {
		super(new Item.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public MutableComponent getName(ItemStack stack) {
		return new TranslatableComponent(this.getDescriptionId(stack));
	}
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return 200;
	}
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
		tooltip.add(new TranslatableComponent("message.basecoalchunk"));
	}

}