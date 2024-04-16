package mp.slave_mod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class KKKtotemAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK
				&& ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x - 2, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK
						&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 2, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x, y - 1, z - 2))).getBlock() == Blocks.GRASS_BLOCK
								&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x, y - 1, z + 2))).getBlock() == Blocks.GRASS_BLOCK)) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slave_mod", "kkkkriz1.1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		return true;
	}
}
