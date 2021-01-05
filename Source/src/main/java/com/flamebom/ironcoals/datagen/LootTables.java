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
lootTables.put(BlockRegistration.GOLDCOALBLOCK.get(), createStandardTable("gold_coal_block", BlockRegistration.GOLDCOALBLOCK.get()));
lootTables.put(BlockRegistration.IRONCOALTORCH.get(), createStandardTable("iron_coal_torch", BlockRegistration.IRONCOALTORCH.get()));
lootTables.put(BlockRegistration.DIAMONDCOALBLOCK.get(), createStandardTable("diamond_coal_block", BlockRegistration.DIAMONDCOALBLOCK.get()));
lootTables.put(BlockRegistration.EMERALDCOALBLOCK.get(), createStandardTable("emerald_coal_block", BlockRegistration.EMERALDCOALBLOCK.get()));


	}
}