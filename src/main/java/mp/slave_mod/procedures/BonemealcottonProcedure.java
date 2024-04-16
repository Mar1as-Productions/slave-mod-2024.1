package mp.slave_mod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import mp.slave_mod.init.SlaveModModBlocks;

import java.util.Map;

public class BonemealcottonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) == false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, Math.random(), Math.random(), Math.random(), 1);
			if (Math.random() >= 0.5) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_0.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_1.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_1.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_2.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_2.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_3.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_3.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_7.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_6.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_5.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlaveModModBlocks.COTTONSTAGE_5.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = SlaveModModBlocks.COTTONSTAGE_7.get().defaultBlockState();
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
	}
}
