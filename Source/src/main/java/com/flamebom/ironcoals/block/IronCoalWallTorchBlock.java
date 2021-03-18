package com.flamebom.ironcoals.block;

import java.util.Random;

import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
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
	    Direction direction = stateIn.get(HORIZONTAL_FACING);
	      double d0 = (double)pos.getX() + 0.5D;
	      double d1 = (double)pos.getY() + 0.7D;
	      double d2 = (double)pos.getZ() + 0.5D;
	      double d3 = 0.22D;
	      double d4 = 0.27D;
	      Direction direction1 = direction.getOpposite();
	      worldIn.addParticle(ParticleTypes.SMOKE, d0 + 0.27D * (double)direction1.getXOffset(), d1 + 0.22D, d2 + 0.27D * (double)direction1.getZOffset(), 0.0D, 0.0D, 0.0D);
	      worldIn.addParticle(ParticleRegistration.TORCHPARTICLE.get(), d0 + 0.27D * (double)direction1.getXOffset(), d1 + 0.22D, d2 + 0.27D * (double)direction1.getZOffset(), 0.0D, 0.0D, 0.0D);
	}
}