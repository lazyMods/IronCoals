package net.marcosantos.ironcoals;

import net.neoforged.bus.api.SubscribeEvent;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.data.loot.LootTableProvider;
import net.marcosantos.ironcoals.datagen.ModTags;
import net.marcosantos.ironcoals.datagen.ModLanguageProvider;
import net.marcosantos.ironcoals.datagen.ModModelProvider;
import net.marcosantos.ironcoals.datagen.ModRecipes;
import net.marcosantos.ironcoals.datagen.ModBlockLootTableProvider;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.marcosantos.ironcoals.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.List;
import java.util.Set;

@Mod(Constants.MOD_ID)
@EventBusSubscriber(modid = Constants.MOD_ID)
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

	@SubscribeEvent
	static void serverGatherData(GatherDataEvent.Server ev) {
		ev.createProvider(ModTags::new);
		ev.createProvider(ModRecipes.Runner::new);
		ev.createProvider((pack, lookup) -> new LootTableProvider(pack, Set.of(),
				List.of(
						new LootTableProvider.SubProviderEntry(
								ModBlockLootTableProvider::new,
								LootContextParamSets.BLOCK)),
				lookup));
	}

	@SubscribeEvent
	static void serverGatherData(GatherDataEvent.Client ev) {
		ev.createProvider(ModLanguageProvider::new);
		ev.createProvider(ModModelProvider::new);
	}
}
