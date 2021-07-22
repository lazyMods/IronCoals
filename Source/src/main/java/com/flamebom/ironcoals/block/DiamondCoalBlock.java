package com.flamebom.ironcoals.block;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.TwistingVinesPlant;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraftforge.common.ToolType;

import net.minecraft.block.AbstractBlock.Properties;

public class DiamondCoalBlock extends CraftingTableBlock {

	public DiamondCoalBlock() {
		super(Properties.of(Path.STONE).strength(5.0F,
				6.0F).sound(TwistingVinesPlant.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops())
		;
	}

}
