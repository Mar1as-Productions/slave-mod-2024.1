package mp.slave_mod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModBlocks;
import mp.slave_mod.entity.SlaveEntity;
import mp.slave_mod.entity.SlaveAnimalEntity;
import mp.slave_mod.entity.RangedSlaveEntity;

import java.util.List;
import java.util.Comparator;

public class KKKactivatingBLockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == SlaveModModBlocks.WODENCROSSBASEBLOCK.get()) {
			if (((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x + 2, y + 1, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x - 2, y + 1, z))).getBlock() == Blocks.FIRE) == false) {
				world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
			}
			if (((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x + 2, y + 1, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x - 2, y + 1, z))).getBlock() == Blocks.FIRE) == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(69 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!world.getEntitiesOfClass(SlaveEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()
								|| !world.getEntitiesOfClass(RangedSlaveEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()
								|| !world.getEntitiesOfClass(SlaveAnimalEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()) {
							if (entityiterator instanceof SlaveEntity || entityiterator instanceof RangedSlaveEntity || entityiterator instanceof SlaveAnimalEntity) {
								entityiterator.setSecondsOnFire(60);
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), 10);
							}
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get() && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == SlaveModModBlocks.NEHORICI_DREVO_OAK.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == SlaveModModBlocks.WODENCROSSBASEBLOCK.get()) {
			if (((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 2))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z - 2))).getBlock() == Blocks.FIRE) == false) {
				world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z + 2), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z - 1), Blocks.FIRE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z - 2), Blocks.FIRE.defaultBlockState(), 3);
			}
			if (((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 2))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.FIRE
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z - 2))).getBlock() == Blocks.FIRE) == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(69 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!world.getEntitiesOfClass(SlaveEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()
								|| !world.getEntitiesOfClass(RangedSlaveEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()
								|| !world.getEntitiesOfClass(SlaveAnimalEntity.class, AABB.ofSize(new Vec3(x, y, z), 69, 69, 69), e -> true).isEmpty()) {
							if (entityiterator instanceof SlaveEntity || entityiterator instanceof RangedSlaveEntity || entityiterator instanceof SlaveAnimalEntity) {
								entityiterator.setSecondsOnFire(60);
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), 10);
							}
						}
					}
				}
			}
		}
	}
}
