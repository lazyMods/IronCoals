package net.marcosantos.ironcoals.world.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class AeonCoalItem extends IronCoalItem {

	public AeonCoalItem(ResourceKey<Item> id) {
		super(ChatFormatting.DARK_RED, () -> Integer.MAX_VALUE, false, id);
	}

	@Override
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay display,
			Consumer<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
		pTooltipComponents.accept(Component.translatable("message.aeoncoal").withStyle(ChatFormatting.DARK_RED));
	}
}
