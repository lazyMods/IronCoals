
package com.flamebom.ironcoals.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
        	 generator.addProvider(event.includeServer(),new Tags(generator, event.getExistingFileHelper()));
        	   generator.addProvider(event.includeServer(),new LootTables(generator));
        }
        if (event.includeClient()) {
  
        }
    }
}
