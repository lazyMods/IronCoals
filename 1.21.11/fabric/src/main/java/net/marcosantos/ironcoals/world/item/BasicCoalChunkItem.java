package net.marcosantos.ironcoals.world.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class BasicCoalChunkItem extends Item {

	public BasicCoalChunkItem(ResourceKey<Item> id) {
		super(new Properties().setId(id));
	}

	@Override
	public Component getName(ItemStack pStack) {
		return Component.translatable(getDescriptionId());
	}

	@Override
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay display,
			Consumer<Component> pTooltipComponents,
			TooltipFlag pTooltipFlag) {
		pTooltipComponents.accept(Component.translatable("message.basiccoalchunk"));
	}
}
