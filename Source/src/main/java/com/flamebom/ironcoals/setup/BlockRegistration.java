package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.block.DiamondCoalBlock;
import com.flamebom.ironcoals.block.EmeraldCoalBlock;
import com.flamebom.ironcoals.block.GoldCoalBlock;
import com.flamebom.ironcoals.block.IronCoalBlock;
import com.flamebom.ironcoals.block.IronCoalTorchBlock;
import com.flamebom.ironcoals.block.IronCoalWallTorchBlock;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistration {
	public static final DeferredRegister<CraftingTableBlock> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			IronCoals.MOD_ID);
	public static final RegistryObject<CraftingTableBlock> IRONCOALBLOCK = BLOCKS.register("iron_coal_block", IronCoalBlock::new);
	public static final RegistryObject<CraftingTableBlock> GOLDCOALBLOCK = BLOCKS.register("gold_coal_block", GoldCoalBlock::new);
	public static final RegistryObject<CraftingTableBlock> DIAMONDCOALBLOCK = BLOCKS.register("diamond_coal_block", DiamondCoalBlock::new);
	public static final RegistryObject<CraftingTableBlock> EMERALDCOALBLOCK = BLOCKS.register("emerald_coal_block", EmeraldCoalBlock::new);
	public static final RegistryObject<CraftingTableBlock> IRONCOALTORCH = BLOCKS.register("iron_coal_torch", IronCoalTorchBlock::new);
	public static final RegistryObject<CraftingTableBlock> IRONCOALWALLTORCH = BLOCKS.register("iron_coal_wall_torch", IronCoalWallTorchBlock::new);
			
}
