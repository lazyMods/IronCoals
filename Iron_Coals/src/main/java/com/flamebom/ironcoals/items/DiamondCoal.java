package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.world.item.ItemStack;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;

public class DiamondCoal extends Item {
	public DiamondCoal() {
		super(new Item.Properties().tab(IronCoals.ITEM_GROUP));
	}

	@Override
	public MutableComponent getName(ItemStack stack) {
		return new TranslatableComponent(this.getDescriptionId(stack)).withStyle(ChatFormatting.AQUA);
	}
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return Config.DIAMOND_COAL_BURN.get();
	}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
	tooltip.add(new TranslatableComponent("message.diamondcoal" , Double.toString(CoalHelper.CoalMultiplier(Config.DIAMOND_COAL_BURN.get()))).withStyle(ChatFormatting.AQUA));
}
}
	