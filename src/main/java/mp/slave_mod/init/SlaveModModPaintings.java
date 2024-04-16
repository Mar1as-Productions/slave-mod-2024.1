
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import mp.slave_mod.SlaveModMod;

public class SlaveModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, SlaveModMod.MODID);
	public static final RegistryObject<PaintingVariant> POLISH_COW_PAINTING = REGISTRY.register("polish_cow_painting", () -> new PaintingVariant(64, 32));
}
