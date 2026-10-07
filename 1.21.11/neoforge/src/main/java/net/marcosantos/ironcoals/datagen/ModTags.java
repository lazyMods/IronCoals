package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

public class ModTags extends BlockTagsProvider {

	public ModTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider, Constants.MOD_ID);
	}

	@Override
	@ParametersAreNonnullByDefault
	protected void addTags(HolderLookup.Provider provider) {
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ModBlocks.IRON_COAL.get())
				.add(ModBlocks.GOLD_COAL.get())
				.add(ModBlocks.EMERALD_COAL.get())
				.add(ModBlocks.DIAMOND_COAL.get());

		this.tag(BlockTags.NEEDS_STONE_TOOL)
				.add(ModBlocks.IRON_COAL.get())
				.add(ModBlocks.GOLD_COAL.get())
				.add(ModBlocks.EMERALD_COAL.get())
				.add(ModBlocks.DIAMOND_COAL.get());
	}
}
