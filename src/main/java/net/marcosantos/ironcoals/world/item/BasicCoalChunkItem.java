package net.marcosantos.ironcoals.world.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class BasicCoalChunkItem extends Item {

	public BasicCoalChunkItem() {
		super(new Properties());
	}

	@Override
	@ParametersAreNonnullByDefault
	@Nonnull
	public Component getName(ItemStack pStack) {
		return Component.translatable(getDescriptionId(pStack));
	}

	@Override
	@ParametersAreNonnullByDefault
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 200;
	}

	@Override
	@ParametersAreNonnullByDefault
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
		pTooltipComponents.add(Component.translatable("message.basiccoalchunk"));
	}
}
