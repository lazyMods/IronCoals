package net.marcosantos.ironcoals.world.item;

import net.marcosantos.ironcoals.CoalHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.FuelValues;

import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class IronCoalBlockItem extends BlockItem {

	private final ChatFormatting tooltipColor;
	private final Supplier<Integer> burnTimeSup;

	public IronCoalBlockItem(Supplier<Block> blockSup, ChatFormatting tooltipColor, Supplier<Integer> burnTimeSup,
			ResourceKey<Item> id) {
		super(blockSup.get(), new Properties().setId(id));
		this.tooltipColor = tooltipColor;
		this.burnTimeSup = burnTimeSup;
	}

	@Override
	@ParametersAreNonnullByDefault
	@Nonnull
	public Component getName(ItemStack pStack) {
		return Component.translatable(getDescriptionId()).withStyle(tooltipColor);
	}

	@Override
	@ParametersAreNonnullByDefault
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType, FuelValues values) {
		return burnTimeSup.get() * 10;
	}

	@Override
	@ParametersAreNonnullByDefault
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay pDisplay,
			Consumer<Component> pTooltipComponents,
			TooltipFlag pTooltipFlag) {
		pTooltipComponents.accept(Component
				.translatable("message.orecoal", Double.toString(CoalHelper.coalMultiplier(burnTimeSup.get() * 10)))
				.withStyle(tooltipColor));
	}
}
