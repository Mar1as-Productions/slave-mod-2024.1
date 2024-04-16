package mp.slave_mod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModEntities;
import mp.slave_mod.entity.EncagedOtrokEntity;
import mp.slave_mod.entity.EncagedOtrok2Entity;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class KupovaninoplsuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 16 && (!world.getEntitiesOfClass(EncagedOtrokEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(EncagedOtrok2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty())) {
			if (entity.getPersistentData().getBoolean("purchase") == false) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!world.getEntitiesOfClass(EncagedOtrokEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
							if (entityiterator instanceof EncagedOtrokEntity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
								if (new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0) > 16) {
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
										_setstack.setCount((int) (new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
													if (stack != null)
														return stack.getCount();
												}
												return 0;
											}
										}.getAmount(0) - 16));
										((Slot) _slots.get(0)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
								} else if (new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0) == 16) {
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										((Slot) _slots.get(0)).remove(16);
										_player.containerMenu.broadcastChanges();
									}
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.LEAD).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = SlaveModModEntities.OTROK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								entity.getPersistentData().putBoolean("purchase", true);
							}
						}
					}
				}
			} else if (entity.getPersistentData().getBoolean("purchase") == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!world.getEntitiesOfClass(EncagedOtrok2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
							if (entityiterator instanceof EncagedOtrok2Entity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
								if (new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0) > 16) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
										_setstack.setCount((int) (new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
													if (stack != null)
														return stack.getCount();
												}
												return 0;
											}
										}.getAmount(0) - 16));
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										((Slot) _slots.get(0)).remove(64);
										_player.containerMenu.broadcastChanges();
									}
								} else if (new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0) == 16) {
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										((Slot) _slots.get(0)).remove(16);
										_player.containerMenu.broadcastChanges();
									}
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.LEAD).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = SlaveModModEntities.OTROK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								entity.getPersistentData().putBoolean("purchase", false);
							}
						}
					}
				}
			}
		}
	}
}
