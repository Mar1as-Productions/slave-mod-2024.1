package mp.slave_mod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModBlocks;

import java.util.Map;

public class KKKactivatingBlockRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y + 3, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y + 3, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z + 2), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z - 1), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z - 2), Blocks.FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
						&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
						&& (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
								&& (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
								&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
								&& (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get())
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = SlaveModModBlocks.NEHORICI_DREVO_OAK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 6, z);
				BlockState _bs = SlaveModModBlocks.KK_KACTIVATING_B_LOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
