package net.marcosantos.ironcoals;

import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class IronCoals {

	public IronCoals(FMLJavaModLoadingContext context) {
		context.registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		context.registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

		var eventBus = context.getModEventBus();

		ModBlocks.init(eventBus);
		ModItems.init(eventBus);

		var tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
		tabs.register("ironcoals", () -> CreativeModeTab.builder()
				.title(Component.translatable("itemGroup.ironcoals"))
				.icon(() -> new ItemStack(ModItems.IRON_COAL.get()))
				.displayItems((params, output) -> {
					output.accept(ModItems.IRON_COAL.get());
					output.accept(ModItems.GOLD_COAL.get());
					output.accept(ModItems.DIAMOND_COAL.get());
					output.accept(ModItems.EMERALD_COAL.get());
					output.accept(ModItems.NETHERITE_COAL.get());
					output.accept(ModItems.AEON_COAL.get());

					output.accept(ModItems.COAL_CHUNK.get());
					output.accept(ModItems.CHARCOAL_CHUNK.get());
					output.accept(ModItems.IRON_COAL_CHUNK.get());
					output.accept(ModItems.GOLD_COAL_CHUNK.get());
					output.accept(ModItems.DIAMOND_COAL_CHUNK.get());
					output.accept(ModItems.EMERALD_COAL_CHUNK.get());

					output.accept(ModBlocks.IRON_COAL.get());
					output.accept(ModBlocks.GOLD_COAL.get());
					output.accept(ModBlocks.DIAMOND_COAL.get());
					output.accept(ModBlocks.EMERALD_COAL.get());
				})
				.build());

		tabs.register(eventBus);

	}
}
