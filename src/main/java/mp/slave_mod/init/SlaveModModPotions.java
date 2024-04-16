
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import mp.slave_mod.SlaveModMod;

public class SlaveModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SlaveModMod.MODID);
	public static final RegistryObject<Potion> EBOLA = REGISTRY.register("ebola", () -> new Potion(new MobEffectInstance(SlaveModModMobEffects.EBOLA.get(), 3600, 0, false, true)));
}
