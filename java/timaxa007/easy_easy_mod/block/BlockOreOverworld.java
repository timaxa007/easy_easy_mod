package timaxa007.easy_easy_mod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import timaxa007.easy_easy_mod.EasyEasyMod;

public class BlockOreOverworld extends Block {

	public BlockOreOverworld() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setBlockName(EasyEasyMod.MODID + ".ore_overworld");
		setBlockTextureName(EasyEasyMod.MODID + ":ore_overworld");
		setCreativeTab(EasyEasyMod.tabEasyEasyMod);
	}

	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return EasyEasyMod.item_chunk_ore_overworld;
	}

}
