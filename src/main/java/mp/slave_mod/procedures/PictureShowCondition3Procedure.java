package mp.slave_mod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import mp.slave_mod.entity.EncagedOtrokEntity;
import mp.slave_mod.entity.EncagedOtrok2Entity;

public class PictureShowCondition3Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.getEntitiesOfClass(EncagedOtrok2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
				&& !world.getEntitiesOfClass(EncagedOtrokEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == false;
	}
}
