package com.ryanprintup.starsector.packets;

import com.ryanprintup.starsector.BasePacket;
import com.ryanprintup.starsector.net.BufferStream;

/**
 * Not fully understood yet.
 */
public class SpawnEntityPacket implements BasePacket
{
    public SpawnEntityPacket()
    {
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
		return 29;
	}
}