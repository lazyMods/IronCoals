package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.IronCoals;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class Items extends ItemModelProvider {

	public Items(DataGenerator generator, ExistingFileHelper existingfilehelper) {
		super(generator, IronCoals.MOD_ID, existingfilehelper);

	}

	@Override
	protected void registerModels() {
	}
    private void registerBlockModel(Block block) {
        String path = block.getRegistryName().getPath();
        getBuilder(path).parent(new ModelFile.UncheckedModelFile(modLoc("block/" + path)));
    }

    @Override
    public String getName() {
        return "Item Models";
    }

}
