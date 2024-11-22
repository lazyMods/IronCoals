package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.registries.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nonnull;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
	protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
		super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
	}

	@Override
	@Nonnull
	protected Iterable<Block> getKnownBlocks() {
		return ModBlocks.BLOCKS.getEntries().stream()
				.map(e -> (Block) e.value())
				.toList();
	}

	@Override
	protected void generate() {
		dropSelf(ModBlocks.IRON_COAL.get());
		dropSelf(ModBlocks.GOLD_COAL.get());
		dropSelf(ModBlocks.EMERALD_COAL.get());
		dropSelf(ModBlocks.DIAMOND_COAL.get());
	}
}
