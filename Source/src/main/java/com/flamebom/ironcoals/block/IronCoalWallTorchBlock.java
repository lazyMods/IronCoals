package com.flamebom.ironcoals.block;

import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class IronCoalWallTorchBlock extends WallTorchBlock {
	public IronCoalWallTorchBlock() {
		super(Block.Properties.from(Blocks.WALL_TORCH).lootFrom(BlockRegistration.IRONCOALTORCH.get()), ParticleRegistration.TORCHPARTICLE.get());
	}

	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return 15;
	}
}