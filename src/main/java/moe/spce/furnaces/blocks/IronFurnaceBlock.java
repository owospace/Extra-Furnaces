package moe.spce.extrafurnaces.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IronFurnaceBlock extends BlockBase 
{

	public IronFurnaceBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}
