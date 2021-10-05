package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
public class IronCoalBlock extends Block {

	public IronCoalBlock() {
		super(Properties.of(Material.STONE).strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
	}

}
