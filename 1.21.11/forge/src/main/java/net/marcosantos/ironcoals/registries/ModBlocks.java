package net.marcosantos.ironcoals.registries;

import net.marcosantos.ironcoals.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Constants.MOD_ID);

	public static final RegistryObject<Block> IRON_COAL = BLOCKS.register("iron_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("iron_coal_block"))));
	public static final RegistryObject<Block> GOLD_COAL = BLOCKS.register("gold_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("gold_coal_block"))));
	public static final RegistryObject<Block> EMERALD_COAL = BLOCKS.register("emerald_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("emerald_coal_block"))));
	public static final RegistryObject<Block> DIAMOND_COAL = BLOCKS.register("diamond_coal_block",
			() -> new Block(
					BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(genBlockKey("diamond_coal_block"))));

	public static void init(BusGroup bus) {
		BLOCKS.register(bus);
	}

	static ResourceKey<Block> genBlockKey(String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
	}
}
