package com.flamebom.ironcoals.block;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.BlockRegistration;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.ExperienceBottleItem;
import net.minecraft.nbt.ShortTag;
import net.minecraft.BlockUtil;
import net.minecraft.network.ConnectionProtocol;

public class IronCoalTorchBlockItem extends ExperienceBottleItem {

	public IronCoalTorchBlockItem() {
		super(BlockRegistration.IRONCOALTORCH.get(), BlockRegistration.IRONCOALWALLTORCH.get(), new ExperienceBottleItem.Properties().tab(IronCoals.ITEM_GROUP));
	}

	@Override
	public ShortTag getName(BoatItem stack) {
		return new ConnectionProtocol(this.getDescriptionId(stack)).withStyle(BlockUtil.GRAY);
	}

}
