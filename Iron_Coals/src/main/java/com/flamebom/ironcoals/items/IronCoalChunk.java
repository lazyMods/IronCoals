package com.flamebom.ironcoals.items;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.world.item.ItemStack;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;

public class IronCoalChunk extends Item {
	public IronCoalChunk() {
		super(new Item.Properties());
	}

	@Override
	public MutableComponent getName(ItemStack stack) {
		return Component.translatable(this.getDescriptionId(stack)).withStyle(ChatFormatting.GRAY);
	}
@Override
public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
	return (Config.IRON_COAL_BURN.get()/8);
}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flagIn) {
	tooltip.add(Component.translatable("message.ironcoalchunk" , Double.toString(CoalHelper.CoalMultiplier(Config.IRON_COAL_BURN.get()/8))).withStyle(ChatFormatting.GRAY));
}
}
