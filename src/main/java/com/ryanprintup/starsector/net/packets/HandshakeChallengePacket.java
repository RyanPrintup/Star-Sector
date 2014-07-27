package com.ryanprintup.starsector.net.packets;

import com.ryanprintup.starsector.net.Packet;
import com.ryanprintup.starsector.net.PacketReader;

public class HandshakeChallengePacket extends Packet
{
	private String claimMessage;
	private String salt;
	private int roundCount;


	public HandshakeCallengePacket()
	{}

	public HandshakeCallengePacket(String claimMessage, String salt, int roundCount)
	{
		this.claimMessage = claimMessage;
		this.salt = salt;
		this.roundCount = roundCount;
	}

	@Override
	public byte getId()
	{
		return 3;
	}

	@Override
	public void read(PacketReader stream)
	{
		claimMessage = stream.readString();
		salt = stream.readString();
		roundCount = stream.readString();
	}

	@Override
	public void write()
	{
	}

	public String getClaimMessage()
	{
		return claimMessage;
	}

	public String getSalt()
	{
		return salt;
	}

	public int getRoundCount()
	{
		return roundCount;
	}
}
