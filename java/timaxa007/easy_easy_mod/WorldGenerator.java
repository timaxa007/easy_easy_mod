package timaxa007.easy_easy_mod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0:generateOverworld(random, chunkX * 16, chunkZ * 16, world);break;
		case -1:generateNether(random, chunkX * 16, chunkZ * 16, world);break;
		case 1:generateEnd(random, chunkX * 16, chunkZ * 16, world);break;
		}
	}

	private void generateOverworld(Random random, int x, int z, World world) {

		if (random.nextInt(5) == 0) {
			new WorldGenMinable(EasyEasyMod.block_ore_overworld, 0, 5, Blocks.stone)
			.generate(world, random, x + 3 + random.nextInt(10), random.nextInt(world.provider.getHeight() / 16), z + 3 + random.nextInt(10));
		}

	}

	private void generateNether(Random random, int x, int z, World world) {

	}

	private void generateEnd(Random random, int x, int z, World world) {

	}

}
