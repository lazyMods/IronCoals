package com.flamebom.ironcoals.factories;

import com.flamebom.ironcoals.particles.TorchParticle;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class TorchParticleFactory implements IParticleFactory<BasicParticleType> {
    private final IAnimatedSprite spriteSet;

    public TorchParticleFactory(IAnimatedSprite p_i50522_1_) {
        this.spriteSet = p_i50522_1_;

    }

    public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        TorchParticle particle = new TorchParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
        particle.selectSpriteRandomly(this.spriteSet);
        particle.setColor(.1F, .5f, .5F);
        return particle;
    }
}
