package com.flamebom.ironcoals.items;



import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class AeonCoal extends Item {
	public AeonCoal() {
		super(new Item.Properties().group(IronCoals.ITEM_GROUP));
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.DARK_RED);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 2147483647;
	}
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
@Override
public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add((new TranslationTextComponent("message.aeoncoal")).mergeStyle(TextFormatting.DARK_RED));
}
}
	