
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import mp.slave_mod.SlaveModMod;

public class SlaveModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SlaveModMod.MODID);
	public static final RegistryObject<SoundEvent> KRAJINA = REGISTRY.register("krajina", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "krajina")));
	public static final RegistryObject<SoundEvent> JOZEFHURT = REGISTRY.register("jozefhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "jozefhurt")));
	public static final RegistryObject<SoundEvent> JOZEFDEAD = REGISTRY.register("jozefdead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "jozefdead")));
	public static final RegistryObject<SoundEvent> JOZEFH = REGISTRY.register("jozefh", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "jozefh")));
	public static final RegistryObject<SoundEvent> JOZEFLIVING = REGISTRY.register("jozefliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "jozefliving")));
	public static final RegistryObject<SoundEvent> WHIP = REGISTRY.register("whip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "whip")));
	public static final RegistryObject<SoundEvent> SLAVEHURT = REGISTRY.register("slavehurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "slavehurt")));
	public static final RegistryObject<SoundEvent> SLAVEZVUK = REGISTRY.register("slavezvuk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "slavezvuk")));
	public static final RegistryObject<SoundEvent> SLAVEDEAD = REGISTRY.register("slavedead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "slavedead")));
	public static final RegistryObject<SoundEvent> NAZDARFRUMRDE = REGISTRY.register("nazdarfrumrde", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "nazdarfrumrde")));
	public static final RegistryObject<SoundEvent> RETEZ = REGISTRY.register("retez", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("slave_mod", "retez")));
}
