
package mp.slave_mod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.BlockState;

import mp.slave_mod.itemgroup.SlaveModItemGroup;
import mp.slave_mod.SlaveModModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@SlaveModModElements.ModElement.Tag
public class EncagedOtrok2Entity extends SlaveModModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("encaged_otrok_2").setRegistryName("encaged_otrok_2");
	public EncagedOtrok2Entity(SlaveModModElements instance) {
		super(instance, 134);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -6750055, new Item.Properties().group(SlaveModItemGroup.tab))
				.setRegistryName("encaged_otrok_2_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelsteve(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("slave_mod:textures/otrok.png");
				}
			};
		});
	}
	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 1;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.ILLAGER;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavezvuk"));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f,
					1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavehurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavedead"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
			if (this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
			this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.05D);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK);
			this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK).setBaseValue(0.85D);
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelsteve extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelsteve() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 6.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-3.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-4.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(1.0F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(0.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-3.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 6.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 6.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 6.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(2.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(3.0F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(2.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-0.1F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-0.1F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-0.1F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-0.1F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(0.9F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-1.1F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-3.1F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(1.9F, 9.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(0.9F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 0).addBox(-1.1F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(0.1F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(0.1F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(0.1F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(0.1F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(1.1F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-0.9F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-2.9F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(2.1F, 9.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(1.1F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 0).addBox(-0.9F, 9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
