package flapflops.toomuchores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAmethyst extends Block {

	protected BlockAmethyst(Material material) {
		super(material);
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeMetal);
	}

}