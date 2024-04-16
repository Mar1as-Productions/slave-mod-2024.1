package mp.slave_mod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModEntities;

public class SpawnNegroMinionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		double new_x = 0;
		double new_y = 0;
		double new_z = 0;
		double sance = 0;
		count = Math.floor(Math.random() * 5 + 1);
		for (int index0 = 0; index0 < (int) count; index0++) {
			new_x = x + Math.floor(Math.random() * 5 + 1) * Math.pow(-1, Math.floor(Math.random() * 2 + 1));
			new_y = y + 1;
			new_z = z + Math.floor(Math.random() * 5 + 1) * Math.pow(-1, Math.floor(Math.random() * 2 + 1));
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SlaveModModEntities.NEGRO_MINION.get().spawn(_level, BlockPos.containing(new_x, new_y, new_z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, new_x, new_y, new_z, 5, 3, 3, 3, 1);
		}
	}
}
