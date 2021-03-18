package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.factories.TorchParticleFactory;
import com.flamebom.ironcoals.particles.TorchParticleType;

import net.minecraft.client.Minecraft;
import net.minecraft.particles.ParticleType;
import net.minecraft.world.BossInfo.Color;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistration {
	public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister
			.create(ForgeRegistries.PARTICLE_TYPES, IronCoals.MOD_ID);
	public static final RegistryObject<TorchParticleType> TORCHPARTICLE = PARTICLES.register("torch_particle",
			TorchParticleType::new);

	@SubscribeEvent	
	public static void registerFactories(ParticleFactoryRegisterEvent evt) {
		Minecraft.getInstance().particles.registerFactory(ParticleRegistration.TORCHPARTICLE.get(),
				TorchParticleType.TorchParticleFactory::new);
	}
}