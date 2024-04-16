
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import mp.slave_mod.entity.SpearProjectileEntity;
import mp.slave_mod.entity.SlaveEntity;
import mp.slave_mod.entity.SlaveBossEntity;
import mp.slave_mod.entity.SlaveAnimalEntity;
import mp.slave_mod.entity.RangedSlaveEntity;
import mp.slave_mod.entity.OtrokEntity;
import mp.slave_mod.entity.NigraniumGolemEntity;
import mp.slave_mod.entity.NegromancerEntity;
import mp.slave_mod.entity.NegroMinionEntity;
import mp.slave_mod.entity.JozefEntity;
import mp.slave_mod.entity.EnslaverEntity;
import mp.slave_mod.entity.EncagedOtrokEntity;
import mp.slave_mod.entity.EncagedOtrok2Entity;
import mp.slave_mod.SlaveModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlaveModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlaveModMod.MODID);
	public static final RegistryObject<EntityType<SlaveEntity>> SLAVE = register("slave",
			EntityType.Builder.<SlaveEntity>of(SlaveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlaveEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RangedSlaveEntity>> RANGED_SLAVE = register("ranged_slave",
			EntityType.Builder.<RangedSlaveEntity>of(RangedSlaveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RangedSlaveEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SlaveBossEntity>> SLAVE_BOSS = register("slave_boss", EntityType.Builder.<SlaveBossEntity>of(SlaveBossEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(2)
			.setUpdateInterval(3).setCustomClientFactory(SlaveBossEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SlaveAnimalEntity>> SLAVE_ANIMAL = register("slave_animal",
			EntityType.Builder.<SlaveAnimalEntity>of(SlaveAnimalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlaveAnimalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OtrokEntity>> OTROK = register("otrok",
			EntityType.Builder.<OtrokEntity>of(OtrokEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OtrokEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JozefEntity>> JOZEF = register("jozef",
			EntityType.Builder.<JozefEntity>of(JozefEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JozefEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<NigraniumGolemEntity>> NIGRANIUM_GOLEM = register("nigranium_golem", EntityType.Builder.<NigraniumGolemEntity>of(NigraniumGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NigraniumGolemEntity::new).fireImmune().sized(1.4f, 2.7f));
	public static final RegistryObject<EntityType<EnslaverEntity>> ENSLAVER = register("enslaver",
			EntityType.Builder.<EnslaverEntity>of(EnslaverEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnslaverEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EncagedOtrokEntity>> ENCAGED_OTROK = register("encaged_otrok",
			EntityType.Builder.<EncagedOtrokEntity>of(EncagedOtrokEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EncagedOtrokEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EncagedOtrok2Entity>> ENCAGED_OTROK_2 = register("encaged_otrok_2",
			EntityType.Builder.<EncagedOtrok2Entity>of(EncagedOtrok2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EncagedOtrok2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NegromancerEntity>> NEGROMANCER = register("negromancer",
			EntityType.Builder.<NegromancerEntity>of(NegromancerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NegromancerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NegroMinionEntity>> NEGRO_MINION = register("negro_minion",
			EntityType.Builder.<NegroMinionEntity>of(NegroMinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NegroMinionEntity::new)

					.sized(0.3f, 0.9f));
	public static final RegistryObject<EntityType<SpearProjectileEntity>> SPEAR_PROJECTILE = register("spear_projectile", EntityType.Builder.<SpearProjectileEntity>of(SpearProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SpearProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SlaveEntity.init();
			RangedSlaveEntity.init();
			SlaveBossEntity.init();
			SlaveAnimalEntity.init();
			OtrokEntity.init();
			JozefEntity.init();
			NigraniumGolemEntity.init();
			EnslaverEntity.init();
			EncagedOtrokEntity.init();
			EncagedOtrok2Entity.init();
			NegromancerEntity.init();
			NegroMinionEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLAVE.get(), SlaveEntity.createAttributes().build());
		event.put(RANGED_SLAVE.get(), RangedSlaveEntity.createAttributes().build());
		event.put(SLAVE_BOSS.get(), SlaveBossEntity.createAttributes().build());
		event.put(SLAVE_ANIMAL.get(), SlaveAnimalEntity.createAttributes().build());
		event.put(OTROK.get(), OtrokEntity.createAttributes().build());
		event.put(JOZEF.get(), JozefEntity.createAttributes().build());
		event.put(NIGRANIUM_GOLEM.get(), NigraniumGolemEntity.createAttributes().build());
		event.put(ENSLAVER.get(), EnslaverEntity.createAttributes().build());
		event.put(ENCAGED_OTROK.get(), EncagedOtrokEntity.createAttributes().build());
		event.put(ENCAGED_OTROK_2.get(), EncagedOtrok2Entity.createAttributes().build());
		event.put(NEGROMANCER.get(), NegromancerEntity.createAttributes().build());
		event.put(NEGRO_MINION.get(), NegroMinionEntity.createAttributes().build());
	}
}
