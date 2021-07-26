package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ToolType;

public class GoldCoalBlock extends Block {

	public GoldCoalBlock() {
		super(Properties.of(net.minecraft.world.level.material.Material.STONE).strength(5.0F, 6.0F)
				.sound(net.minecraft.world.level.block.SoundType.STONE).harvestTool(ToolType.PICKAXE)
				.requiresCorrectToolForDrops());
	}

}
