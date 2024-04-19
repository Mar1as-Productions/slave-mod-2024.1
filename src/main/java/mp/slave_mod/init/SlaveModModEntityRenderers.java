
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import mp.slave_mod.client.renderer.SlaveRenderer;
import mp.slave_mod.client.renderer.SlaveBossRenderer;
import mp.slave_mod.client.renderer.SlaveAnimalRenderer;
import mp.slave_mod.client.renderer.RangedSlaveRenderer;
import mp.slave_mod.client.renderer.OtrokRenderer;
import mp.slave_mod.client.renderer.NigraniumGolemRenderer;
import mp.slave_mod.client.renderer.NegromancerRenderer;
import mp.slave_mod.client.renderer.NegroMinionRenderer;
import mp.slave_mod.client.renderer.JozefRenderer;
import mp.slave_mod.client.renderer.EnslaverRenderer;
import mp.slave_mod.client.renderer.EncagedOtrokRenderer;
import mp.slave_mod.client.renderer.EncagedOtrok2Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlaveModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlaveModModEntities.SLAVE.get(), SlaveRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.RANGED_SLAVE.get(), RangedSlaveRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.SLAVE_BOSS.get(), SlaveBossRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.SLAVE_ANIMAL.get(), SlaveAnimalRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.OTROK.get(), OtrokRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.JOZEF.get(), JozefRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.NIGRANIUM_GOLEM.get(), NigraniumGolemRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.ENSLAVER.get(), EnslaverRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.ENCAGED_OTROK.get(), EncagedOtrokRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.ENCAGED_OTROK_2.get(), EncagedOtrok2Renderer::new);
		event.registerEntityRenderer(SlaveModModEntities.NEGROMANCER.get(), NegromancerRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.NEGRO_MINION.get(), NegroMinionRenderer::new);
		event.registerEntityRenderer(SlaveModModEntities.SPEAR_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
