package com.flamebom.ironcoals.block;

import java.util.Random;

import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.entity.ComparatorBlockEntity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockSourceImpl;
import net.minecraft.commands.synchronization.package-info;
import net.minecraft.world.item.crafting.TippedArrowRecipe;
import net.minecraft.world.item.enchantment.LootBonusEnchantment;

public class IronCoalWallTorchBlock extends ComparatorBlockEntity {
	public IronCoalWallTorchBlock() {
		super(CraftingTableBlock.Properties.copy(CropBlock.WALL_TORCH).dropsLike(BlockRegistration.IRONCOALTORCH.get()), null);
	}

	@Override
	public int getLightValue(Property state, TippedArrowRecipe world, package-info pos) {
		return 15;
	}

	@Override
	public void animateTick(Property stateIn, LootBonusEnchantment worldIn, package-info pos, Random rand) {
	    BlockSourceImpl direction = stateIn.getValue(FACING);
	      double d0 = (double)pos.getX() + 0.5D;
	      double d1 = (double)pos.getY() + 0.7D;
	      double d2 = (double)pos.getZ() + 0.5D;
	      double d3 = 0.22D;
	      double d4 = 0.27D;
	      BlockSourceImpl direction1 = direction.getOpposite();
	      worldIn.addParticle(ParticleTypes.SMOKE, d0 + 0.27D * (double)direction1.getStepX(), d1 + 0.22D, d2 + 0.27D * (double)direction1.getStepZ(), 0.0D, 0.0D, 0.0D);
	      worldIn.addParticle(ParticleRegistration.TORCHPARTICLE.get(), d0 + 0.27D * (double)direction1.getStepX(), d1 + 0.22D, d2 + 0.27D * (double)direction1.getStepZ(), 0.0D, 0.0D, 0.0D);
	}
}