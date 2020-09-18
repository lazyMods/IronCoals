package com.flamebom.ironcoals.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
	public static final String CATEGORY_COALS = "coals";
	public static final String SUBCATEGORY_COALS = "coalburntime";
	
	public static ForgeConfigSpec SERVER_CONFIG;
	public static ForgeConfigSpec CLIENT_CONFIG;

	
	public static ForgeConfigSpec.IntValue IRON_COAL_BURN;
	public static ForgeConfigSpec.IntValue GOLD_COAL_BURN;
	public static ForgeConfigSpec.IntValue DIAMOND_COAL_BURN;
	public static ForgeConfigSpec.IntValue EMERALD_COAL_BURN;

	static {
		ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
        
        CLIENT_BUILDER.comment("Coals").push(CATEGORY_COALS);
        CLIENT_BUILDER.pop();
        
        setupCoals(SERVER_BUILDER,CLIENT_BUILDER);
        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    
     
	}
	private static void setupCoals(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
		SERVER_BUILDER.comment("Coal Burntime Settings").push(SUBCATEGORY_COALS);
	    IRON_COAL_BURN =  SERVER_BUILDER.comment("How long iron coal burns in ticks, default value is 2400")
                .defineInRange("ironBurnTicks", 2400, 1, 4800);
	    GOLD_COAL_BURN =  SERVER_BUILDER.comment("How long gold coal burns in ticks, default value is 4800")
                .defineInRange("goldBurnTicks", 4800, 1, 9600);
	    DIAMOND_COAL_BURN =  SERVER_BUILDER.comment("How long diamond coal burns in ticks, default value is 9600")
                .defineInRange("diamondBurnTicks", 9600, 1, 19200);
	   EMERALD_COAL_BURN =  SERVER_BUILDER.comment("How long emerald coal burns in ticks, default value is 19200")
                .defineInRange("emeraldBurnTicks", 19200, 1, 38400);
	   
        SERVER_BUILDER.pop();
     
	}
	@SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
