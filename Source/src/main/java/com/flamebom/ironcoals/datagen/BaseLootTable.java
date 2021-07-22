package com.flamebom.ironcoals.datagen;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.GiftLoot;
import net.minecraft.network.protocol.login.ServerboundKeyPacket;
import net.minecraft.loot.functions.CopyNbt;
import net.minecraft.world.level.storage.loot.functions.SetContainerLootTable;
import net.minecraft.loot.DynamicLootEntry;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.phys.shapes.IndexMerger;
import net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.functions.package-info;
import net.minecraft.loot.functions.CopyName;
import net.minecraft.loot.functions.SetContents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseLootTable extends GiftLoot {
	  private static final Logger LOGGER = LogManager.getLogger();
	    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
	    protected final Map<CraftingTableBlock, SmeltItemFunction.Serializer> lootTables = new HashMap<>();
	    private final BuiltinRegistries generator;
	    public BaseLootTable(BuiltinRegistries dataGeneratorIn) {
	        super(dataGeneratorIn);
	        this.generator = dataGeneratorIn;
	    }
	    protected abstract void addTables();

	    protected SmeltItemFunction.Serializer createStandardTable(String name, CraftingTableBlock block) {
	        SetStewEffectFunction.Builder builder = SetStewEffectFunction.lootPool()
	                .name(name)
	                .setRolls(SetContainerLootTable.exactly(1))
	                .add(InvertedLootItemCondition.lootTableItem(block)
	                );
	        return SmeltItemFunction.lootTable().withPool(builder);
	    }

	    @Override
	    public void run(DataProvider cache) {
	        addTables();

	        Map<ServerboundKeyPacket, SmeltItemFunction> tables = new HashMap<>();
	        for (Map.Entry<CraftingTableBlock, SmeltItemFunction.Serializer> entry : lootTables.entrySet()) {
	            tables.put(entry.getKey().getLootTable(), entry.getValue().setParamSet(IndexMerger.BLOCK).build());
	        }
	        writeTables(cache, tables);
	    }

	    private void writeTables(DataProvider cache, Map<ServerboundKeyPacket, SmeltItemFunction> tables) {
	        Path outputFolder = this.generator.getOutputFolder();
	        tables.forEach((key, lootTable) -> {
	            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
	            try {
	                DataGenerator.save(GSON, cache, package-info.serialize(lootTable), path);
	            } catch (IOException e) {
	                LOGGER.error("Couldn't write loot table {}", path, e);
	            }
	        });
	    }

	    @Override
	    public String getName() {
	        return "IronCoals LootTables";
	    }
}
