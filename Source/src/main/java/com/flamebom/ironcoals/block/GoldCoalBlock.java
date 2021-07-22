package com.flamebom.ironcoals.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import net.minecraft.block.AbstractBlock.Properties;

public class GoldCoalBlock extends Block {

	public GoldCoalBlock() {
		super(Properties.of(Material.STONE).strength(5.0F,
				6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops())
		;
	}

}
