package mp.slave_mod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import mp.slave_mod.entity.EncagedOtrokEntity;
import mp.slave_mod.entity.EncagedOtrok2Entity;

public class EnslaverOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((!world.getEntitiesOfClass(EncagedOtrokEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(EncagedOtrok2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) == false) {
			entity.getPersistentData().putDouble("casovac", (entity.getPersistentData().getDouble("casovac") + 1));
			if (entity.getPersistentData().getDouble("casovac") == 150) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("I am leaving now." + (x + "" + (y + "" + z)))), false);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			}
		}
	}
}
