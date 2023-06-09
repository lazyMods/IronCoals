package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class EmeraldCoalBlock extends Block {

	public EmeraldCoalBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(4.0F).requiresCorrectToolForDrops());
	}

}
