package net.marcosantos.ironcoals.registries;

import net.marcosantos.ironcoals.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

	public static final DeferredBlock<Block> IRON_COAL = BLOCKS.register("iron_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("iron_coal_block"))));
	public static final DeferredBlock<Block> GOLD_COAL = BLOCKS.register("gold_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("gold_coal_block"))));
	public static final DeferredBlock<Block> EMERALD_COAL = BLOCKS.register("emerald_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("emerald_coal_block"))));
	public static final DeferredBlock<Block> DIAMOND_COAL = BLOCKS.register("diamond_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("diamond_coal_block"))));

	public static void init(IEventBus bus) {
		BLOCKS.register(bus);
	}

	static ResourceKey<Block> genBlockKey(String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
	}
}
