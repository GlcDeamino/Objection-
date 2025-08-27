/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.shenjin.objection.init;

import net.shenjin.objection.potion.ObjectionTimerMobEffect;
import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class ObjectionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ObjectionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> OBJECTION_TIMER = REGISTRY.register("objection_timer", () -> new ObjectionTimerMobEffect());
}