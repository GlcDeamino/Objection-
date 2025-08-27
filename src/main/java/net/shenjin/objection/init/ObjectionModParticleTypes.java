/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.shenjin.objection.init;

import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class ObjectionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, ObjectionMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> OBJECTION = REGISTRY.register("objection", () -> new SimpleParticleType(true));
}