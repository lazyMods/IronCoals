package com.flamebom.ironcoals;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flamebom.ironcoals.setup.BlockRegistration;
import com.flamebom.ironcoals.setup.ItemRegistration;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ironcoals")
public class IronCoals
{
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ironcoals";
	public static IronCoals instance;

    public IronCoals() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    	ItemRegistration.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	BlockRegistration.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
	public static class CreativeItemGroup extends ItemGroup {
		public static final CreativeItemGroup instance = new CreativeItemGroup(ItemGroup.GROUPS.length,"ironcoalstab");
		private CreativeItemGroup(int index, String label) {
			super(index, label);
		}
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemRegistration.IRONCOAL.get());
		}
	}
}
