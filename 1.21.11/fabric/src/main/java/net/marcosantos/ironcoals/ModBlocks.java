package net.marcosantos.ironcoals;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

	static ResourceKey<Block> create(String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
	}

	public static Block IRON_COAL;
	public static Block GOLD_COAL;
	public static Block EMERALD_COAL;
	public static Block DIAMOND_COAL;

	public static void doRegister() {
		IRON_COAL = Registry.register(BuiltInRegistries.BLOCK, create("iron_coal_block"),
				new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(create("iron_coal_block"))));
		GOLD_COAL = Registry.register(BuiltInRegistries.BLOCK, create("gold_coal_block"),
				new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(create("gold_coal_block"))));
		EMERALD_COAL = Registry.register(BuiltInRegistries.BLOCK, create("emerald_coal_block"),
				new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(create("emerald_coal_block"))));
		DIAMOND_COAL = Registry.register(BuiltInRegistries.BLOCK, create("diamond_coal_block"),
				new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(create("diamond_coal_block"))));

	}
}
