package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Constants.MOD_ID)
public class ModDataGenerators {

	@SubscribeEvent
	static void gatherData(GatherDataEvent ev) {
		var gen = ev.getGenerator();
		var pack = gen.getPackOutput();
		var exFile = ev.getExistingFileHelper();
		var looup = ev.getLookupProvider();

		gen.addProvider(ev.includeClient(), new ModLanguageProvider(pack));
		gen.addProvider(ev.includeClient(), new ModBlockStateProvider(pack, exFile));
		gen.addProvider(ev.includeClient(), new ModItemModelProvider(pack, exFile));

		gen.addProvider(ev.includeServer(), new ModTags(pack, looup, exFile));
		gen.addProvider(ev.includeServer(), new ModRecipes(pack, looup));
		gen.addProvider(ev.includeServer(),
				new LootTableProvider(pack, Set.of(),
						List.of(
								new LootTableProvider.SubProviderEntry(
										ModBlockLootTableProvider::new,
										LootContextParamSets.BLOCK
								)
						), looup));
	}
}
