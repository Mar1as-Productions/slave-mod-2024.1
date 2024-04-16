
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import mp.slave_mod.client.gui.OtrokarGUIScreen;
import mp.slave_mod.client.gui.OtrokINVScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlaveModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SlaveModModMenus.OTROK_INV.get(), OtrokINVScreen::new);
			MenuScreens.register(SlaveModModMenus.OTROKAR_GUI.get(), OtrokarGUIScreen::new);
		});
	}
}
