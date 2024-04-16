package mp.slave_mod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import mp.slave_mod.init.SlaveModModItems;

public class NigraniumGolemDropProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.7) {
			for (int index0 = 0; index0 < 2; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SlaveModModItems.NIGRANIUMINGOT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.4) {
			for (int index1 = 0; index1 < 1; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SlaveModModItems.NIGRANIUMINGOT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		for (int index2 = 0; index2 < 3; index2++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SlaveModModItems.NIGRANIUMINGOT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		for (int index3 = 0; index3 < 2; index3++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SlaveModModItems.NIGRANIUMNUGGET.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
