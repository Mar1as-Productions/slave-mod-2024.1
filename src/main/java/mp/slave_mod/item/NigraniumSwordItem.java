
package mp.slave_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import mp.slave_mod.init.SlaveModModItems;

public class NigraniumSwordItem extends SwordItem {
	public NigraniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlaveModModItems.NIGRANIUMINGOT.get()), new ItemStack(SlaveModModItems.NIGRANIUM_SWORD.get()));
			}
		}, 3, -2f, new Item.Properties());
	}
}
