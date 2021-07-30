package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ToolType;
import net.minecraft.world.level.block.SoundType;
public class DiamondCoalBlock extends Block {

	public DiamondCoalBlock() {
		super(Properties.of(net.minecraft.world.level.material.Material.STONE).strength(5.0F, 6.0F)
				.sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)
				.requiresCorrectToolForDrops());
	}

}
