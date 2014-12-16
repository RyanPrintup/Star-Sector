package com.ryanprintup.starsector.net.packets;

import com.ryanprintup.starsector.net.Packet;
import com.ryanprintup.starsector.net.PacketReader;

public class StopCraftingInContainerPacket extends Packet
{
	private long entityId; // sVLQ

	public StopCraftingInContainerPacket()
	{}

	public StopCraftingInContainerPacket(long entityId)
	{
		this.entityId = entityId;
	}

	@Override
	public byte getId()
	{
		return 38;
	}

	@Override
	public void read(PacketReader stream)
	{
		entityId = stream.readSVLQ();
	}

	@Override
	public void write()
	{
	}


	public long getEntityId()
	{
		return entityId;
	}
}