/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.shenjin.objection.init;

import net.shenjin.objection.item.IndictmentItem;
import net.shenjin.objection.item.AttorneysBadgeItem;
import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class ObjectionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ObjectionMod.MODID);
	public static final DeferredItem<Item> ATTORNEYS_BADGE = REGISTRY.register("attorneys_badge", AttorneysBadgeItem::new);
	public static final DeferredItem<Item> INDICTMENT = REGISTRY.register("indictment", IndictmentItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}