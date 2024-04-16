
package mp.slave_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import mp.slave_mod.entity.EnslaverEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class EnslaverRenderer extends MobRenderer<EnslaverEntity, VillagerModel<EnslaverEntity>> {
	public EnslaverRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(EnslaverEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnslaverEntity entity) {
		return new ResourceLocation("slave_mod:textures/entities/pan_candie_skin.png");
	}
}
