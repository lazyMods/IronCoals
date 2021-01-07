package com.flamebom.ironcoals.block;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.BlockRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WallOrFloorItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class IronCoalTorchBlockItem extends WallOrFloorItem {

	public IronCoalTorchBlockItem() {
		super(BlockRegistration.IRONCOALTORCH.get(), BlockRegistration.IRONCOALWALLTORCH.get(), new WallOrFloorItem.Properties().group(IronCoals.ITEM_GROUP));
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.GRAY);
	}

}
