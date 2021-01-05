package com.flamebom.ironcoals.block;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.BlockRegistration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class IronCoalTorchBlockItem extends BlockItem {

	public IronCoalTorchBlockItem() {
		super(BlockRegistration.IRONCOALTORCH.get(), new BlockItem.Properties().group(IronCoals.ITEM_GROUP));
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.GRAY);
	}

}
