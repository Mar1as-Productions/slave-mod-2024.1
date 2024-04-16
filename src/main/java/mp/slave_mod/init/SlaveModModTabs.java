
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import mp.slave_mod.SlaveModMod;

public class SlaveModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlaveModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SLAVE_MOD = REGISTRY.register("slave_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.slave_mod.slave_mod")).icon(() -> new ItemStack(Blocks.DIRT_PATH)).displayItems((parameters, tabData) -> {
				tabData.accept(SlaveModModItems.SLAVE_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.KRAJINA.get());
				tabData.accept(SlaveModModItems.RANGED_SLAVE_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.SLAVE_BOSS_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.SLAVE_ANIMAL_SPAWN_EGG.get());
				tabData.accept(SlaveModModBlocks.NEHORICI_DREVO_OAK.get().asItem());
				tabData.accept(SlaveModModBlocks.KK_KACTIVATING_B_LOCK.get().asItem());
				tabData.accept(SlaveModModItems.COTTONSEEDS.get());
				tabData.accept(SlaveModModItems.KK_KARMOR_HELMET.get());
				tabData.accept(SlaveModModItems.KK_KARMOR_CHESTPLATE.get());
				tabData.accept(SlaveModModItems.KK_KARMOR_LEGGINGS.get());
				tabData.accept(SlaveModModItems.KK_KARMOR_BOOTS.get());
				tabData.accept(SlaveModModItems.BAVLNA.get());
				tabData.accept(SlaveModModItems.HARVESTED_COTTON.get());
				tabData.accept(SlaveModModBlocks.WODENCROSSBASEBLOCK.get().asItem());
				tabData.accept(SlaveModModItems.OTROK_SPAWN_EGG.get());
				tabData.accept(SlaveModModBlocks.NIGRANIUM.get().asItem());
				tabData.accept(SlaveModModItems.NIGRANIUMINGOT.get());
				tabData.accept(SlaveModModItems.NIGRANIUMNUGGET.get());
				tabData.accept(SlaveModModItems.CHAINPIECE.get());
				tabData.accept(SlaveModModItems.CHAIN.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_PICKAXE.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_SHOVEL.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_SWORD.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_AXE.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_HOE.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_SHEARS.get());
				tabData.accept(SlaveModModItems.JOZEF_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_ARMOR_HELMET.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_ARMOR_LEGGINGS.get());
				tabData.accept(SlaveModModItems.NIGRANIUM_ARMOR_BOOTS.get());
				tabData.accept(SlaveModModItems.WHIP_TOOL.get());
				tabData.accept(SlaveModModBlocks.ENSLAVED_GLOWSTONE.get().asItem());
				tabData.accept(SlaveModModItems.WHIP_ENDING_ITEM.get());
				tabData.accept(SlaveModModItems.AMULET.get());
				tabData.accept(SlaveModModItems.EMPTY_AMULET.get());
				tabData.accept(SlaveModModItems.ENSLAVER_SPAWN_EGG.get());
				tabData.accept(SlaveModModBlocks.NIGRANIUM_BLOCK.get().asItem());
				tabData.accept(SlaveModModItems.NIGRANIUM_GOLEM_SPAWN_EGG.get());
				tabData.accept(SlaveModModBlocks.IRONBARFOR_NOPLESES.get().asItem());
				tabData.accept(SlaveModModBlocks.UNDESTRUCTABLESPRUCEPLANK.get().asItem());
				tabData.accept(SlaveModModBlocks.UNDESTRUCTABLESLAB.get().asItem());
				tabData.accept(SlaveModModBlocks.WHEEL.get().asItem());
				tabData.accept(SlaveModModItems.ENCAGED_OTROK_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.ENCAGED_OTROK_2_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.NEGROMANCER_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.NEGRO_MINION_SPAWN_EGG.get());
				tabData.accept(SlaveModModItems.SPEAR.get());
				tabData.accept(SlaveModModItems.NIGRANIUMCARROT.get());
			})

					.build());
}
