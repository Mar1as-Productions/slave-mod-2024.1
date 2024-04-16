
package mp.slave_mod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import mp.slave_mod.procedures.RangedSlaveEntityDiesProcedure;
import mp.slave_mod.init.SlaveModModItems;
import mp.slave_mod.init.SlaveModModEntities;

public class RangedSlaveEntity extends PathfinderMob implements RangedAttackMob {
	public RangedSlaveEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SlaveModModEntities.RANGED_SLAVE.get(), world);
	}

	public RangedSlaveEntity(EntityType<RangedSlaveEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 2;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(SlaveModModItems.SPEAR.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1.5, 40));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Villager.class, false, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, AbstractGolem.class, false, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Animal.class, false, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Creeper.class, false, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, EnderMan.class, false, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Zombie.class, false, true));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Pillager.class, false, true));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Illusioner.class, false, true));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, WitherSkeleton.class, false, true));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, EncagedOtrokEntity.class, false, true));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Skeleton.class, false, true));
		this.goalSelector.addGoal(17, new LeapAtTargetGoal(this, (float) 0.75));
		this.goalSelector.addGoal(18, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(19, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(20, new RemoveBlockGoal(Blocks.BELL, this, 1, (int) 1));
		this.goalSelector.addGoal(21, new FollowMobGoal(this, 1, (float) 10, (float) 5));
		this.goalSelector.addGoal(22, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(23, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavezvuk"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavehurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("slave_mod:slavedead"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		RangedSlaveEntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		SpearProjectileEntity.shoot(this, target);
	}

	public static void init() {
		SpawnPlacements.register(SlaveModModEntities.RANGED_SLAVE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 27);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.65);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.65);
		return builder;
	}
}
