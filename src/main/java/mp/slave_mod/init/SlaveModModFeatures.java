
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import mp.slave_mod.world.features.KKKtotemFeatureFeature;
import mp.slave_mod.SlaveModMod;

@Mod.EventBusSubscriber
public class SlaveModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SlaveModMod.MODID);
	public static final RegistryObject<Feature<?>> KK_KTOTEM_FEATURE = REGISTRY.register("kk_ktotem_feature", KKKtotemFeatureFeature::new);
}
