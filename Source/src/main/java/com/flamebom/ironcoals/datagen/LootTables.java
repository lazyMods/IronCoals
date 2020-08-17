package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.setup.BlockRegistration;

import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTable {

	public LootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}

	@Override
	protected void addTables() {
lootTables.put(BlockRegistration.IRONCOALBLOCK.get(), createStandardTable("iron_coal_block", BlockRegistration.IRONCOALBLOCK.get()));

	}
}