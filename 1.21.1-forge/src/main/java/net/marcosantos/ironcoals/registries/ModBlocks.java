package net.marcosantos.ironcoals.registries;

import net.marcosantos.ironcoals.Constants;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

	public static final RegistryObject<Block> IRON_COAL = BLOCKS.register("iron_coal_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
	public static final RegistryObject<Block> GOLD_COAL = BLOCKS.register("gold_coal_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
	public static final RegistryObject<Block> EMERALD_COAL = BLOCKS.register("emerald_coal_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
	public static final RegistryObject<Block> DIAMOND_COAL = BLOCKS.register("diamond_coal_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));

	public static void init(IEventBus bus) {
		BLOCKS.register(bus);
	}
}
