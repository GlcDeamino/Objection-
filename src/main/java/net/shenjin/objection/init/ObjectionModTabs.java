/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.shenjin.objection.init;

import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ObjectionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ObjectionMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> OBJECTION_TAB = REGISTRY.register("objection_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.objection.objection_tab")).icon(() -> new ItemStack(ObjectionModItems.ATTORNEYS_BADGE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ObjectionModItems.ATTORNEYS_BADGE.get());
				tabData.accept(ObjectionModItems.INDICTMENT.get());
			}).build());
}