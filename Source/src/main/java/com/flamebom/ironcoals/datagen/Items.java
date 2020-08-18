package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class Items extends ItemModelProvider {

	public Items(DataGenerator generator, ExistingFileHelper existingfilehelper) {
		super(generator, IronCoals.MOD_ID, existingfilehelper);

	}

	@Override
	protected void registerModels() {
		 withExistingParent("item/"+ ItemRegistration.IRONCOALBLOCKITEM.get().getRegistryName().getPath(),
	                new ResourceLocation(IronCoals.MOD_ID, "block/iron_coal_block"));
	}

}
