package com.flamebom.ironcoals.block;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Registration;
import com.flamebom.ironcoals.setup.Config;


import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;


public class GoldCoalBlockItem extends BlockItem {

	public GoldCoalBlockItem() {
		super(Registration.GOLDCOALBLOCK.get(), new BlockItem.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public MutableComponent getName(ItemStack stack) {
		return new TranslatableComponent(this.getDescriptionId(stack)).withStyle(ChatFormatting.GOLD);
	}
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return (Config.GOLD_COAL_BURN.get()*10);
	}
@Override
public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag  flagIn) {
	tooltip.add(new TranslatableComponent("message.goldcoalblock" , Double.toString(CoalHelper.CoalMultiplier(Config.GOLD_COAL_BURN.get()*10))).withStyle(ChatFormatting.GOLD));
}

}
