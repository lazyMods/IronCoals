package com.flamebom.ironcoals.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GoldCoalBlock extends Block {

	public GoldCoalBlock() {
		super(Properties.create(Material.ROCK).hardnessAndResistance(5.0F,
				6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).setRequiresTool())
		;
	}

}
