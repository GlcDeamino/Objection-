/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.shenjin.objection.init;

import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ObjectionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ObjectionMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> OBJECTION = REGISTRY.register("objection", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("objection", "objection")));
}