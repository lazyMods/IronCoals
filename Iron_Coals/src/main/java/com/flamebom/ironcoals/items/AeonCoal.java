package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
public class AeonCoal extends Item {
	public AeonCoal() {
		super(new Item.Properties());
		
	}
	@Override
	public MutableComponent getName(ItemStack stack) {
		return Component.translatable(this.getDescriptionId(stack)).withStyle(ChatFormatting.DARK_RED);
	}
@Override
public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
	return Integer.MAX_VALUE;
}

	public boolean isFoil(ItemStack stack) {
		return true;
	}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
	tooltip.add((Component.translatable("message.aeoncoal")).withStyle(ChatFormatting.DARK_RED));
}
}
	