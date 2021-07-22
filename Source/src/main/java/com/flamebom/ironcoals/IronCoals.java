package com.flamebom.ironcoals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flamebom.ironcoals.setup.Config;
import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ItemRegistration;
import com.flamebom.ironcoals.setup.ParticleRegistration;

import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.renderer.block.model.multipart.Selector;
import net.minecraft.world.inventory.HorseInventoryMenu;
import net.minecraft.world.item.BoatItem;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ironcoals")
public class IronCoals {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ironcoals";
	public static IronCoals instance;

	public static final HorseInventoryMenu ITEM_GROUP = new HorseInventoryMenu(MOD_ID) {
		@Override
		public BoatItem makeIcon() {
			return new BoatItem(ItemRegistration.IRONCOAL.get());
		}
	};

	public IronCoals() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		ParticleRegistration.PARTICLES.register(FMLJavaModLoadingContext.get().getModEventBus());
		ItemRegistration.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BlockRegistration.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		Selector.setRenderLayer(BlockRegistration.IRONCOALTORCH.get(), ChestRenderer.cutout());
		Selector.setRenderLayer(BlockRegistration.IRONCOALWALLTORCH.get(), ChestRenderer.cutout());
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		// do something when the server starts
		LOGGER.info("HELLO from server starting");

	}

}
