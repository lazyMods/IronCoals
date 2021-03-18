package com.flamebom.ironcoals.block;

import java.util.Random;

import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class IronCoalWallTorchBlock extends WallTorchBlock {
	public IronCoalWallTorchBlock() {
		super(Block.Properties.from(Blocks.WALL_TORCH).lootFrom(BlockRegistration.IRONCOALTORCH.get()), null);
	}

	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return 15;
	}

	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		double d0 = (double) pos.getX() + 0.5D;
		double d1 = (double) pos.getY() + 0.7D;
		double d2 = (double) pos.getZ() + 0.5D;
		worldIn.addParticle(ParticleRegistration.TORCHPARTICLE.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
	}
}