package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.setup.Registration;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import java.util.function.BiConsumer;

public class LootTables implements LootTableSubProvider {

    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        builder.accept(Registration.IRONCOALBLOCK.getId(), LootTableTools.createSimpleTable("iron_coal_block", Registration.IRONCOALBLOCK.get()));
        builder.accept(Registration.GOLDCOALBLOCK.getId(), LootTableTools.createSimpleTable("gold_coal_block", Registration.GOLDCOALBLOCK.get()));
        builder.accept(Registration.DIAMONDCOALBLOCK.getId(), LootTableTools.createSimpleTable("diamond_coal_block", Registration.DIAMONDCOALBLOCK.get()));
        builder.accept(Registration.EMERALDCOALBLOCK.getId(), LootTableTools.createSimpleTable("emerald_coal_block", Registration.EMERALDCOALBLOCK.get()));
    }
}
