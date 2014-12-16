package com.ryanprintup.starsector.net.packets;

import com.ryanprintup.starsector.net.Packet;
import com.ryanprintup.starsector.net.PacketReader;

public class EntityUpdatePacket extends Packet
{
	private long entityId; //sVLQ
	private short[] delta;
	
	public EntityUpdatePacket()
	{
	}
	
	public EntityUpdatePacket(long entityId, short[] delta)
	{
		this.entityId = entityId;
		this.delta = delta;
	}
	
	@Override
	public byte getId()
	{
		return 43;
	}
	
	@Override
	public void read(PacketReader stream)
	{
		entityId = stream.readSVLQ();
		delta = stream.readUInt8Array();
	}

	@Override
	public void write()
	{
	}

	public long getEntityId()
	{
		return entityId;
	}
	
	public short[] getDelta()
	{
		return delta;
	}
}