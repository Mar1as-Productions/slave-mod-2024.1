package mp.slave_mod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import mp.slave_mod.network.SlaveModModVariables;

public class NegromancerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DAMAGE_INDICATOR, x, y, z, 5, 6, 3, 6, 1);
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
			SlaveModModVariables.MapVariables.get(world).NegromancerAttackDelay = SlaveModModVariables.MapVariables.get(world).NegromancerAttackDelay + 1;
			SlaveModModVariables.MapVariables.get(world).syncData(world);
			if (SlaveModModVariables.MapVariables.get(world).NegromancerAttackDelay == 40) {
				SlaveModModVariables.MapVariables.get(world).NegromancerAttackDelay = 0;
				SlaveModModVariables.MapVariables.get(world).syncData(world);
				NegromancerRangedAttack1Procedure.execute(world, x, y, z, entity);
			}
		}
	}
}
