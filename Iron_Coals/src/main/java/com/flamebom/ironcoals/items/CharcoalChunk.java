package com.flamebom.ironcoals.items;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;

public class CharcoalChunk extends Item {
	public CharcoalChunk() {
		super(new Item.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public MutableComponent getName(ItemStack stack) {
		return Component.translatable(this.getDescriptionId(stack));
	}
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return 200;
	}
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
		tooltip.add(Component.translatable("message.charcoalchunk"));
	}

}
