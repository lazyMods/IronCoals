package net.marcosantos.ironcoals;

import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class IronCoals {

	public IronCoals(IEventBus eventBus, ModContainer container) {
		container.registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		container.registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

		ModBlocks.init(eventBus);
		ModItems.init(eventBus);

		var tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
		tabs.register("ironcoals", () -> CreativeModeTab.builder()
				.title(Component.translatable("itemGroup.ironcoals"))
				.icon(() -> ModItems.IRON_COAL.toStack())
				.displayItems((params, output) -> {
					output.accept(ModItems.IRON_COAL);
					output.accept(ModItems.GOLD_COAL);
					output.accept(ModItems.DIAMOND_COAL);
					output.accept(ModItems.EMERALD_COAL);
					output.accept(ModItems.NETHERITE_COAL);
					output.accept(ModItems.AEON_COAL);

					output.accept(ModItems.COAL_CHUNK);
					output.accept(ModItems.CHARCOAL_CHUNK);
					output.accept(ModItems.IRON_COAL_CHUNK);
					output.accept(ModItems.GOLD_COAL_CHUNK);
					output.accept(ModItems.DIAMOND_COAL_CHUNK);
					output.accept(ModItems.EMERALD_COAL_CHUNK);

					output.accept(ModBlocks.IRON_COAL);
					output.accept(ModBlocks.GOLD_COAL);
					output.accept(ModBlocks.DIAMOND_COAL);
					output.accept(ModBlocks.EMERALD_COAL);
				})
				.build());

		tabs.register(eventBus);

	}
}
