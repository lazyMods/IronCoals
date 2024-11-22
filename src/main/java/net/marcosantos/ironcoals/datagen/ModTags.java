package net.marcosantos.ironcoals.datagen;

import net.marcosantos.ironcoals.Constants;
import net.marcosantos.ironcoals.registries.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

public class ModTags extends TagsProvider<Block> {

	protected ModTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, Registries.BLOCK, lookupProvider, Constants.MOD_ID, existingFileHelper);
	}

	@Override
	@ParametersAreNonnullByDefault
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ModBlocks.IRON_COAL.getKey())
				.add(ModBlocks.GOLD_COAL.getKey())
				.add(ModBlocks.EMERALD_COAL.getKey())
				.add(ModBlocks.DIAMOND_COAL.getKey());

		this.tag(BlockTags.NEEDS_STONE_TOOL)
				.add(ModBlocks.IRON_COAL.getKey())
				.add(ModBlocks.GOLD_COAL.getKey())
				.add(ModBlocks.EMERALD_COAL.getKey())
				.add(ModBlocks.DIAMOND_COAL.getKey());
	}
}
