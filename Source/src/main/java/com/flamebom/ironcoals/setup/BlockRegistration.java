package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.block.DiamondCoalBlock;
import com.flamebom.ironcoals.block.EmeraldCoalBlock;
import com.flamebom.ironcoals.block.GoldCoalBlock;
import com.flamebom.ironcoals.block.IronCoalBlock;


import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistration {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			IronCoals.MOD_ID);
	public static final RegistryObject<Block> IRONCOALBLOCK = BLOCKS.register("iron_coal_block", IronCoalBlock::new);
	public static final RegistryObject<Block> GOLDCOALBLOCK = BLOCKS.register("gold_coal_block", GoldCoalBlock::new);
	public static final RegistryObject<Block> DIAMONDCOALBLOCK = BLOCKS.register("diamond_coal_block", DiamondCoalBlock::new);
	public static final RegistryObject<Block> EMERALDCOALBLOCK = BLOCKS.register("emerald_coal_block", EmeraldCoalBlock::new);
/* Temporary (or maybe forever?) removal of iron torch cause it doesn't fit with the theme very well
	public static final RegistryObject<Block> IRONCOALTORCH = BLOCKS.register("iron_coal_torch", IronCoalTorchBlock::new);
	public static final RegistryObject<Block> IRONCOALWALLTORCH = BLOCKS.register("iron_coal_wall_torch", IronCoalWallTorchBlock::new);
			*/
}
