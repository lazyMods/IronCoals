package com.flamebom.ironcoals.setup;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.block.IronCoalBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistration {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			IronCoals.MOD_ID);
	public static final RegistryObject<Block> IRONCOALBLOCK = BLOCKS.register("iron_coal_block", IronCoalBlock::new);
			
}
