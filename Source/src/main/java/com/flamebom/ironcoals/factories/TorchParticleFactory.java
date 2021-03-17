package com.flamebom.ironcoals.factories;

import javax.annotation.Nullable;

import com.flamebom.ironcoals.particles.TorchParticle;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.text.Color;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public  class TorchParticleFactory implements IParticleFactory<BasicParticleType> {
	  private final Color color;
	  public TorchParticleFactory(Color color) {
	    this.color = color;
	  }
	@Override
	public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z,
			double xSpeed, double ySpeed, double zSpeed) {
		// TODO Auto-generated method stub
		return null;
	}



	}