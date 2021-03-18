package com.flamebom.ironcoals.block;

import java.util.Random;

import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class IronCoalTorchBlock extends TorchBlock {

	public IronCoalTorchBlock() {
		super(Properties.from(Blocks.TORCH), null);
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
