
package mp.slave_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import mp.slave_mod.entity.NegroMinionEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class NegroMinionRenderer extends HumanoidMobRenderer<NegroMinionEntity, HumanoidModel<NegroMinionEntity>> {
	public NegroMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(NegroMinionEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NegroMinionEntity entity) {
		return new ResourceLocation("slave_mod:textures/entities/negrogod.png");
	}

	@Override
	protected boolean isShaking(NegroMinionEntity entity) {
		return true;
	}
}
