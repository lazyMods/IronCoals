package net.marcosantos.ironcoals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IronCoals implements ModInitializer {

    @Override
    public void onInitialize() {

	ModBlocks.doRegister();
	ModItems.doRegister();

	CreativeModeTab CREATIVE_TAB = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.IRON_COAL))
		.title(Component.translatable("itemGroup.ironcoals"))
		.displayItems((params, output) -> {
			output.accept(ModItems.IRON_COAL);
			output.accept(ModItems.GOLD_COAL);
			output.accept(ModItems.EMERALD_COAL);
			output.accept(ModItems.DIAMOND_COAL);
			output.accept(ModItems.NETHERITE_COAL);
			output.accept(ModItems.AEON_COAL);

			output.accept(ModItems.COAL_CHUNK);
			output.accept(ModItems.CHARCOAL_CHUNK);
			output.accept(ModItems.IRON_COAL_CHUNK);
			output.accept(ModItems.GOLD_COAL_CHUNK);
			output.accept(ModItems.EMERALD_COAL_CHUNK);
			output.accept(ModItems.DIAMOND_COAL_CHUNK);

			output.accept(ModItems.IRON_COAL_BLOCK);
			output.accept(ModItems.GOLD_COAL_BLOCK);
			output.accept(ModItems.EMERALD_COAL_BLOCK);
			output.accept(ModItems.DIAMOND_COAL_BLOCK);

		}).build();

	Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Constants.MOD_ID, "creative_tab")), CREATIVE_TAB);

        FuelRegistryEvents.BUILD.register((builder, context)->{
	    builder.add(ModItems.IRON_COAL, Config.IRON_COAL_BURN);
	    builder.add(ModItems.GOLD_COAL, Config.GOLD_COAL_BURN);
	    builder.add(ModItems.EMERALD_COAL, Config.EMERALD_COAL_BURN);
	    builder.add(ModItems.DIAMOND_COAL, Config.DIAMOND_COAL_BURN);
	    builder.add(ModItems.NETHERITE_COAL, Config.NETHERITE_COAL_BURN);
	    builder.add(ModItems.AEON_COAL, Integer.MAX_VALUE);

	    builder.add(ModItems.COAL_CHUNK, 200);
	    builder.add(ModItems.CHARCOAL_CHUNK, 200);
	    builder.add(ModItems.IRON_COAL_CHUNK, Config.IRON_COAL_BURN / 8);
	    builder.add(ModItems.GOLD_COAL_CHUNK, Config.GOLD_COAL_BURN / 8);
	    builder.add(ModItems.EMERALD_COAL_CHUNK, Config.EMERALD_COAL_BURN / 8);
	    builder.add(ModItems.DIAMOND_COAL_CHUNK, Config.DIAMOND_COAL_BURN / 8);
	    
	    builder.add(ModItems.IRON_COAL_BLOCK, Config.IRON_COAL_BURN * 10);
	    builder.add(ModItems.GOLD_COAL_BLOCK, Config.GOLD_COAL_BURN * 10);
	    builder.add(ModItems.EMERALD_COAL_BLOCK, Config.EMERALD_COAL_BURN * 10);
	    builder.add(ModItems.DIAMOND_COAL_BLOCK, Config.DIAMOND_COAL_BURN * 10);
	});
    }
}
