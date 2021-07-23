package com.flamebom.ironcoals.block;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class IronCoalBlockItem extends BlockItem {

	public IronCoalBlockItem() {
		super(BlockRegistration.IRONCOALBLOCK.get(), new BlockItem.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public ITextComponent getName(ItemStack stack) {
		return new TranslationTextComponent(this.getDescriptionId(stack)).withStyle(TextFormatting.GRAY);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return (Config.IRON_COAL_BURN.get()*10);
	}
@Override
public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add(new TranslationTextComponent("message.ironcoalblock" , Double.toString(CoalHelper.CoalMultiplier(Config.IRON_COAL_BURN.get()*10))).withStyle(TextFormatting.GRAY));
}

}
