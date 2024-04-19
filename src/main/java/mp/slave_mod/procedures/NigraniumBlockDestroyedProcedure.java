package mp.slave_mod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModEntities;

public class NigraniumBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		chance = Math.random();
		if (chance <= 0.1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SlaveModModEntities.JOZEF.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:jozefh")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:jozefh")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (chance > 0.1 && chance <= 0.25) {
			for (int index0 = 0; index0 < 2; index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SlaveModModEntities.JOZEF.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:jozefh")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:jozefh")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
