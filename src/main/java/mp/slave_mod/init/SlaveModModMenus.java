
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import mp.slave_mod.world.inventory.OtrokarGUIMenu;
import mp.slave_mod.world.inventory.OtrokINVMenu;
import mp.slave_mod.SlaveModMod;

public class SlaveModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SlaveModMod.MODID);
	public static final RegistryObject<MenuType<OtrokINVMenu>> OTROK_INV = REGISTRY.register("otrok_inv", () -> IForgeMenuType.create(OtrokINVMenu::new));
	public static final RegistryObject<MenuType<OtrokarGUIMenu>> OTROKAR_GUI = REGISTRY.register("otrokar_gui", () -> IForgeMenuType.create(OtrokarGUIMenu::new));
}
