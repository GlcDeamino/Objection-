package net.shenjin.objection.procedures;

import net.shenjin.objection.init.ObjectionModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ObjectionOverlayAnim2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ObjectionModMobEffects.OBJECTION_TIMER) ? _livEnt.getEffect(ObjectionModMobEffects.OBJECTION_TIMER).getDuration() : 0) > 16) {
			return (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ObjectionModMobEffects.OBJECTION_TIMER) ? _livEnt.getEffect(ObjectionModMobEffects.OBJECTION_TIMER).getDuration() : 0) <= 18;
		}
		return false;
	}
}