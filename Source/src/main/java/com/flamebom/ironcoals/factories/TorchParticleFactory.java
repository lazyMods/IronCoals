package com.flamebom.ironcoals.factories;

import com.flamebom.ironcoals.particles.TorchParticle;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TorchParticleFactory implements IParticleFactory<BasicParticleType> {

	public TorchParticleFactory() {

	}

	public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z,
			double xSpeed, double ySpeed, double zSpeed) {
		TorchParticle particle = new TorchParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
		particle.setColor(.1F, .5f, .5F);
		return particle;
	}
}
