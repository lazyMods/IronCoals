package com.flamebom.ironcoals.particles;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class TorchParticleType extends BasicParticleType {
	public TorchParticleType() {
		super(true);
	}
	@OnlyIn(Dist.CLIENT)
    public static class TorchParticleFactory implements IParticleFactory<BasicParticleType> {
        private final IAnimatedSprite spriteSet;

        public TorchParticleFactory(IAnimatedSprite p_i50522_1_) {
            this.spriteSet = p_i50522_1_;
        }

        public Particle createParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        	TorchParticle particle = new TorchParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            particle.pickSprite(this.spriteSet);
            particle.setColor(.1F, .5f, .5F);
            return particle;
        }
    }

}