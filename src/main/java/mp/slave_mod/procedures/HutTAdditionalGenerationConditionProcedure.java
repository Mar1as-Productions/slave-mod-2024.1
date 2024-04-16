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

public class HutTAdditionalGenerationConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 5, y, z))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 10, y, z))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x, y, z + 5))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x, y, z + 10))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 5, y, z + 5))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 10, y, z + 5))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 5, y, z + 10))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 10, y, z + 10))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 3, y, z + 3))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 3, y, z + 8))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x + 8, y, z + 3))).getBlock() == Blocks.GRASS_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 8, y, z + 8))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 13, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 5, y + 1, z + 5))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 5, y + 7, z + 5))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 5, y + 13, z + 5))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 5, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 5, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 5, y + 13, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 10, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 10, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 10, y + 13, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z + 5))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z + 5))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 13, z + 5))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 10))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z + 10))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 13, z + 10))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 5, y + 1, z + 10))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 5, y + 7, z + 10))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 5, y + 13, z + 10))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 10, y + 1, z + 10))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 10, y + 7, z + 10))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 10, y + 13, z + 10))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 10, y + 1, z + 5))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x + 10, y + 7, z + 5))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 10, y + 13, z + 5))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slave_mod", "hutloot1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}
