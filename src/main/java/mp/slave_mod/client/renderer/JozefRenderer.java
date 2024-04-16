
package mp.slave_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import mp.slave_mod.entity.JozefEntity;

public class JozefRenderer extends MobRenderer<JozefEntity, SilverfishModel<JozefEntity>> {
	public JozefRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JozefEntity entity) {
		return new ResourceLocation("slave_mod:textures/entities/jozeff.png");
	}
}
