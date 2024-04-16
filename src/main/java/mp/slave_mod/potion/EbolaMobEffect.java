
package mp.slave_mod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import mp.slave_mod.procedures.EbolaPotionStartedappliedProcedure;

public class EbolaMobEffect extends MobEffect {
	public EbolaMobEffect() {
		super(MobEffectCategory.HARMFUL, -9627367);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EbolaPotionStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EbolaPotionStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
