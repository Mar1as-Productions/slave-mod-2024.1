package mp.slave_mod.procedures;

import net.minecraft.world.entity.Entity;

public class InvcloseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("otroksber", 0);
	}
}
