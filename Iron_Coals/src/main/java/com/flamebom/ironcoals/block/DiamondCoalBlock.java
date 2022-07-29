package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DiamondCoalBlock extends Block {

	public DiamondCoalBlock() {
		super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(4.0F).requiresCorrectToolForDrops());
	}

}
