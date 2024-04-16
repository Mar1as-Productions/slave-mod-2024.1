
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import mp.slave_mod.potion.EbolaMobEffect;
import mp.slave_mod.SlaveModMod;

public class SlaveModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SlaveModMod.MODID);
	public static final RegistryObject<MobEffect> EBOLA = REGISTRY.register("ebola", () -> new EbolaMobEffect());
}
