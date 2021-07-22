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

public class GoldCoalBlockItem extends BlockItem {

	public GoldCoalBlockItem() {
		super(BlockRegistration.GOLDCOALBLOCK.get(), new BlockItem.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public ITextComponent getName(ItemStack stack) {
		return new TranslationTextComponent(this.getDescriptionId(stack)).withStyle(TextFormatting.GOLD);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return (Config.GOLD_COAL_BURN.get()*10);
	}
@Override
public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add(new TranslationTextComponent("message.goldcoalblock" , Double.toString(CoalHelper.CoalMultiplier(Config.GOLD_COAL_BURN.get()*10))).withStyle(TextFormatting.GOLD));
}

}
