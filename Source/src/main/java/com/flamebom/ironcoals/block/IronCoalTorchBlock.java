package com.flamebom.ironcoals.block;

import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class IronCoalTorchBlock extends TorchBlock {

	public IronCoalTorchBlock() {
		super(Properties.from(Blocks.TORCH),ParticleRegistration.TORCHPARTICLE.get());
	}

	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return 15;
	}
}
