/*package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.particles.TorchParticleType;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IronCoals.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleFactoryRegistration {
	@SubscribeEvent
	public static void registerFactories(ParticleFactoryRegisterEvent evt) {

	Minecraft.getInstance().particleEngine.register(ParticleRegistration.TORCHPARTICLE.get(), TorchParticleType.TorchParticleFactory::new);
	}
}*/