/*
package com.flamebom.ironcoals.particles;

import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;

public class TorchParticle extends SpriteTexturedParticle {
    public TorchParticle(ClientWorld worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double speedIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, speedIn);
        this.rCol = 0.67F;
        this.gCol = 0.67F;
        this.bCol = 0.67F;
        this.setSize(0.02F, 0.02F);
        this.quadSize *= this.random.nextFloat() * 0.6F + 0.5F;
        this.xd *= (double) 0.02F;
        this.yd *= (double) 0.02F;
        this.zd *= (double) 0.02F;
        this.lifetime = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
        this.alpha = .8f;
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public void move(double x, double y, double z) {
        this.setBoundingBox(this.getBoundingBox().move(x, y, z));
        this.setLocationFromBoundingbox();
    }

    public void tick() {
        this.rCol = 0.67F;
        this.gCol = 0.67F;
        this.bCol = 0.67F;
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        } else {
            this.move(this.xd, this.yd, this.zd);
            this.xd *= 0.99D;
            this.yd *=1.05D;
            this.zd *= 0.99D;
        }
        
    }
}*/