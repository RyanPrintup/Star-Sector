package com.ryanprintup.starsector.packets;

import com.ryanprintup.starsector.BasePacket;
import com.ryanprintup.starsector.net.BufferStream;

public class BurnContainerPacket implements BasePacket
{
	private long entityId; // sVLQ

	public BurnContainerPacket(long entityId)
	{
		this.entityId = entityId;
	}

    @Override
    public void read(BufferStream stream)
    {

    }

    @Override
    public void write(BufferStream stream)
    {

    }

	@Override
	public byte getId()
	{
		return 39;
	}
	
	public long getEntityId()
	{
		return entityId;
	}
}