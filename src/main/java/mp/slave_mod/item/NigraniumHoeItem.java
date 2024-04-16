
package mp.slave_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import mp.slave_mod.init.SlaveModModItems;

public class NigraniumHoeItem extends HoeItem {
	public NigraniumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlaveModModItems.NIGRANIUMINGOT.get()), new ItemStack(SlaveModModItems.NIGRANIUM_HOE.get()));
			}
		}, 0, -2f, new Item.Properties());
	}
}
