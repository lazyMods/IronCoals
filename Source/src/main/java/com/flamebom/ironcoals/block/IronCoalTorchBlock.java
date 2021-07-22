package com.flamebom.ironcoals.block;

import java.util.Random;

import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.synchronization.package-info;
import net.minecraft.world.item.crafting.TippedArrowRecipe;
import net.minecraft.world.item.enchantment.LootBonusEnchantment;

import net.minecraft.block.AbstractBlock.Properties;

public class IronCoalTorchBlock extends BarrelBlockEntity {

	public IronCoalTorchBlock() {
		super(Properties.copy(CropBlock.TORCH), null);
	}

	@Override
	public int getLightValue(Property state, TippedArrowRecipe world, package-info pos) {
		return 15;
	}

	@Override
	public void animateTick(Property stateIn, LootBonusEnchantment worldIn, package-info pos, Random rand) {
		double d0 = (double) pos.getX() + 0.5D;
		double d1 = (double) pos.getY() + 0.7D;
		double d2 = (double) pos.getZ() + 0.5D;
		worldIn.addParticle(ParticleRegistration.TORCHPARTICLE.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
		worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
	}
}
