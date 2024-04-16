
package mp.slave_mod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import mp.slave_mod.procedures.NigraniumShearsBlockDestroyedWithToolProcedure;

public class NigraniumShearsItem extends ShearsItem {
	public NigraniumShearsItem() {
		super(new Item.Properties().durability(1000));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 1.5f;
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		NigraniumShearsBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
