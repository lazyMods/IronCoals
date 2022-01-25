package com.flamebom.ironcoals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.event.server.ServerStartingEvent;
import com.flamebom.ironcoals.setup.Config;
import com.flamebom.ironcoals.setup.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ironcoals")
public class IronCoals {
	public  static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ironcoals";
	public static IronCoals instance;

	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MOD_ID) {
		
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Registration.IRONCOAL.get());
		}
	};

	public IronCoals() {
		Registration.init();
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
	//	ParticleRegistration.PARTICLES.register(FMLJavaModLoadingContext.get().getModEventBus());
	       
	}
	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {
		// do something when the server starts
		LOGGER.info("HELLO from server starting");

	}

}
