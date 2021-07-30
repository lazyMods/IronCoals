package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import net.minecraft.world.item.ItemStack;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class AeonCoal extends net.minecraft.world.item.Item {
	

	public AeonCoal(Properties properties) {
		super(properties.tab(IronCoals.ITEM_GROUP));
		
	}
	@Override
	public MutableComponent getName(ItemStack stack) {
		return new TranslatableComponent(this.getDescriptionId(stack)).withStyle(ChatFormatting.DARK_RED);
	}

	public int getBurnTime(ItemStack itemStack) {
		return 2147483647;
	}

	public boolean isFoil(ItemStack stack) {
		return true;
	}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
	tooltip.add((new TranslatableComponent("message.aeoncoal")).withStyle(ChatFormatting.DARK_RED));
}
}
	