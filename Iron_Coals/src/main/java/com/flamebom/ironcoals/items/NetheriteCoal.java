package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
public class NetheriteCoal extends Item {
	public NetheriteCoal() {
		super(new Item.Properties());
	}

	@Override
	public MutableComponent getName(ItemStack stack) {
		return  Component.translatable(this.getDescriptionId(stack)).withStyle(ChatFormatting.DARK_GRAY);
	}
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return Config.NETHERITE_COAL_BURN.get();
	}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
	tooltip.add( Component.translatable("message.emeraldcoal" ,  Double.toString(CoalHelper.CoalMultiplier(Config.NETHERITE_COAL_BURN.get()))).withStyle(ChatFormatting.DARK_GRAY));;
}
}