package net.marcosantos.ironcoals.world.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class AeonCoalItem extends IronCoalItem {

	public AeonCoalItem() {
		super(ChatFormatting.DARK_RED, () -> Integer.MAX_VALUE, false);
	}

	@Override
	@ParametersAreNonnullByDefault
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
		pTooltipComponents.add(Component.translatable("message.aeoncoal").withStyle(ChatFormatting.DARK_RED));
	}
}
