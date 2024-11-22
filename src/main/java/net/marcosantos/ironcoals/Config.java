package net.marcosantos.ironcoals;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
	public static final String CATEGORY_COALS = "coals";
	public static final String SUBCATEGORY_COALS = "coalburntime";

	public static ModConfigSpec SERVER_CONFIG;
	public static ModConfigSpec CLIENT_CONFIG;

	public static ModConfigSpec.IntValue IRON_COAL_BURN;
	public static ModConfigSpec.IntValue GOLD_COAL_BURN;
	public static ModConfigSpec.IntValue DIAMOND_COAL_BURN;
	public static ModConfigSpec.IntValue EMERALD_COAL_BURN;
	public static ModConfigSpec.IntValue NETHERITE_COAL_BURN;
	static {
		ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
		ModConfigSpec.Builder CLIENT_BUILDER = new ModConfigSpec.Builder();

		CLIENT_BUILDER.comment("Coals").push(CATEGORY_COALS);
		CLIENT_BUILDER.pop();

		setupCoals(SERVER_BUILDER, CLIENT_BUILDER);
		SERVER_CONFIG = SERVER_BUILDER.build();
		CLIENT_CONFIG = CLIENT_BUILDER.build();

	}

	private static void setupCoals(ModConfigSpec.Builder SERVER_BUILDER, ModConfigSpec.Builder CLIENT_BUILDER) {
		SERVER_BUILDER.comment("Coal Burntime Settings").push(SUBCATEGORY_COALS);
		IRON_COAL_BURN = SERVER_BUILDER.comment("How long iron coal burns in ticks, default value is 2400")
				.defineInRange("ironBurnTicks", 2400, 1, 4800);
		GOLD_COAL_BURN = SERVER_BUILDER.comment("How long gold coal burns in ticks, default value is 4800")
				.defineInRange("goldBurnTicks", 4800, 1, 9600);
		DIAMOND_COAL_BURN = SERVER_BUILDER.comment("How long diamond coal burns in ticks, default value is 9600")
				.defineInRange("diamondBurnTicks", 9600, 1, 19200);
		EMERALD_COAL_BURN = SERVER_BUILDER.comment("How long emerald coal burns in ticks, default value is 19200")
				.defineInRange("emeraldBurnTicks", 19200, 1, 38400);
		NETHERITE_COAL_BURN = SERVER_BUILDER.comment("How long netherite coal burns in ticks, default value is 768000")
				.defineInRange("netheriteBurnTicks", 768000, 1, Integer.MAX_VALUE);
		SERVER_BUILDER.pop();

	}
}
