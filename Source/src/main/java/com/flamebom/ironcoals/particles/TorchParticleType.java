package com.flamebom.ironcoals.particles;

import net.minecraft.client.renderer.RunningTrimmedMean;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.particle.PortalParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class TorchParticleType extends SimpleParticleType {
	public TorchParticleType() {
		super(true);
	}
	@OnlyIn(Dist.CLIENT)
    public static class TorchParticleFactory implements ItemInHandRenderer<SimpleParticleType> {
        private final RunningTrimmedMean spriteSet;

        public TorchParticleFactory(RunningTrimmedMean p_i50522_1_) {
            this.spriteSet = p_i50522_1_;
        }

        public GameRenderer createParticle(SimpleParticleType typeIn, PortalParticle worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        	TorchParticle particle = new TorchParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            particle.pickSprite(this.spriteSet);
            particle.setColor(.1F, .5f, .5F);
            return particle;
        }
    }

}