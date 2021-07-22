package com.flamebom.ironcoals.datagen;

import net.minecraft.data.BuiltinRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        BuiltinRegistries generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new Recipes(generator));
           generator.addProvider(new LootTables(generator));
        }
        if (event.includeClient()) {
        	generator.addProvider(new Language(generator));
          generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new Items(generator, event.getExistingFileHelper()));
        }
    }
}
