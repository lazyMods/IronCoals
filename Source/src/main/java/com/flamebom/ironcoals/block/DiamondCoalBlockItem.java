package com.flamebom.ironcoals.block;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

public class DiamondCoalBlockItem extends net.minecraft.world.item.BlockItem {

	public DiamondCoalBlockItem() {
		super(BlockRegistration.DIAMONDCOALBLOCK.get(), new BlockItem.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public ITextComponent getName(ItemStack stack) {
		return new TranslationTextComponent(this.getDescriptionId(stack)).withStyle(TextFormatting.AQUA);
	}
	public int getBurnTime(ItemStack itemStack) {
		return (10*Config.DIAMOND_COAL_BURN.get());
	}
@Override
public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add(new TranslatableComponent("message.diamondcoalblock" , Double.toString(CoalHelper.CoalMultiplier(Config.DIAMOND_COAL_BURN.get()*10))).withStyle(TextFormatting.AQUA));
}

}
