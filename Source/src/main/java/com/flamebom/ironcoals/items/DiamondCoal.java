package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class DiamondCoal extends Item {
	public DiamondCoal() {
		super(new Item.Properties().tab(IronCoals.ITEM_GROUP));
	}

	@Override
	public ITextComponent getName(ItemStack stack) {
		return new TranslationTextComponent(this.getDescriptionId(stack)).withStyle(TextFormatting.AQUA);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return Config.DIAMOND_COAL_BURN.get();
	}
@Override
public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add(new TranslationTextComponent("message.diamondcoal" , Double.toString(CoalHelper.CoalMultiplier(Config.DIAMOND_COAL_BURN.get()))).withStyle(TextFormatting.AQUA));
}
}
	