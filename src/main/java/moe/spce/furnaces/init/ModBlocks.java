package moe.spce.extrafurnaces.init;

import java.util.ArrayList;
import java.util.List;

import moe.spce.extrafurnaces.blocks.BlockBase;
import moe.spce.extrafurnaces.blocks.IronFurnaceBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block IRON_FURNACE_BLOCK = new IronFurnaceBlock("iron_furnace_block", Material.IRON);
	

}
