package com.flamebom.ironcoals.items;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CharcoalChunk extends Item {
	public CharcoalChunk() {
		super(new Item.Properties().tab(IronCoals.ITEM_GROUP));
	}
	@Override
	public ITextComponent getName(ItemStack stack) {
		return new TranslationTextComponent(this.getDescriptionId(stack));
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 200;
	}
	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("message.charcoalchunk"));
	}

}
