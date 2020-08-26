package com.flamebom.ironcoals.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
	public static final String CATEGORY_COALS = "coals";

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
        
        IRON_COAL_BURN =  SERVER_BUILDER.comment("How long iron coal burns in ticks, default value is 2400")
                .defineInRange("ticks", 2400, 0, Integer.MAX_VALUE);
       GOLD_COAL_BURN =  SERVER_BUILDER.comment("How long gold coal burns in ticks, default value is 4800")
                .defineInRange("ticks", 4800, 0, Integer.MAX_VALUE);
        DIAMOND_COAL_BURN =  SERVER_BUILDER.comment("How long diamond coal burns in ticks, default value is 9600")
                .defineInRange("ticks", 9600, 0, Integer.MAX_VALUE);
        EMERALD_COAL_BURN =  SERVER_BUILDER.comment("How long emerald coal burns in ticks, default value is 19200")
                .defineInRange("ticks", 19200, 0, Integer.MAX_VALUE);
        SERVER_BUILDER.pop();
	}
	@SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
