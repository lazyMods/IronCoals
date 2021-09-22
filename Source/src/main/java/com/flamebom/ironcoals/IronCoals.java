package com.flamebom.ironcoals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flamebom.ironcoals.setup.Config;
import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ItemRegistration;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ironcoals")
public class IronCoals {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ironcoals";
	public static IronCoals instance;

	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MOD_ID) {
		
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemRegistration.IRONCOAL.get());
		}
	};

	public IronCoals() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
	//	ParticleRegistration.PARTICLES.register(FMLJavaModLoadingContext.get().getModEventBus());
		ItemRegistration.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BlockRegistration.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {
	//	RenderType(BlockRegistration.IRONCOALTORCH.get(), RenderType.cutout());
		//RenderTypeLookup.setRenderLayer(BlockRegistration.IRONCOALWALLTORCH.get(), RenderType.cutout());
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(net.minecraftforge.fmlserverevents.FMLServerStartingEvent event) {
		// do something when the server starts
		LOGGER.info("HELLO from server starting");

	}

}
