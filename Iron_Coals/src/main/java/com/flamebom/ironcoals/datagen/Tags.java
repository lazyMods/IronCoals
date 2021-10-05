package com.flamebom.ironcoals.datagen;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Tags extends BlockTagsProvider {

	    public Tags(DataGenerator generator, ExistingFileHelper helper) {
	        super(generator, IronCoals.MOD_ID, helper);
	    }

	    @Override
	    protected void addTags() {
	        tag(BlockTags.MINEABLE_WITH_PICKAXE)
	        .add(Registration.IRONCOALBLOCK.get())
            .add(Registration.GOLDCOALBLOCK.get())
            .add(Registration.DIAMONDCOALBLOCK.get())
            .add(Registration.EMERALDCOALBLOCK.get());
	        tag(BlockTags.NEEDS_STONE_TOOL)
	              .add(Registration.IRONCOALBLOCK.get())
	              .add(Registration.GOLDCOALBLOCK.get())
	              .add(Registration.DIAMONDCOALBLOCK.get())
	              .add(Registration.EMERALDCOALBLOCK.get());
	    }

	    @Override
	    public String getName() {
	        return "IronCoals Tags";
	    }
	}

