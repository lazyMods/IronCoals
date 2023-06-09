package com.flamebom.ironcoals.datagen;

import java.util.concurrent.CompletableFuture;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.setup.Registration;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Tags extends BlockTagsProvider  {

    public Tags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, IronCoals.MOD_ID, helper);
    }
	    @Override
	    protected void addTags(HolderLookup.Provider pProvider) {
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

