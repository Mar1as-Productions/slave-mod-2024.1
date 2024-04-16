
package mp.slave_mod.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.Level;

import mp.slave_mod.world.features.configurations.StructureFeatureConfiguration;
import mp.slave_mod.procedures.KKKtotemAdditionalGenerationConditionProcedure;

public class KKKtotemFeatureFeature extends StructureFeature {
	public KKKtotemFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		Level world = context.level().getLevel();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!KKKtotemAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
