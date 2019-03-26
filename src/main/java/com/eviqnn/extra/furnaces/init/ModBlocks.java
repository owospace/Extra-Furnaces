package com.eviqnn.extra.furnaces.init;

import java.util.ArrayList;
import java.util.List;

import com.eviqnn.extra.furnaces.blocks.BlockBase;
import com.eviqnn.extra.furnaces.blocks.IronFurnaceBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block IRON_FURNACE_BLOCK = new IronFurnaceBlock("iron_furnace_block", Material.IRON);
	

}
