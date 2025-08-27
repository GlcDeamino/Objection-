package net.shenjin.objection.network;

import net.shenjin.objection.procedures.ObjectionTriggerEventProcedure;
import net.shenjin.objection.ObjectionMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ObjectionTriggerMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ObjectionTriggerMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(ObjectionMod.MODID, "key_objection_trigger"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ObjectionTriggerMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ObjectionTriggerMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ObjectionTriggerMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ObjectionTriggerMessage> type() {
		return TYPE;
	}

	public static void handleData(final ObjectionTriggerMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			ObjectionTriggerEventProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ObjectionMod.addNetworkMessage(ObjectionTriggerMessage.TYPE, ObjectionTriggerMessage.STREAM_CODEC, ObjectionTriggerMessage::handleData);
	}
}