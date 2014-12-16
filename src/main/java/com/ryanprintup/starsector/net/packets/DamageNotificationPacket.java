package com.ryanprintup.starsector.net.packets;

import com.ryanprintup.starsector.net.Packet;
import com.ryanprintup.starsector.net.PacketReader;

public class DamageNotificationPacket extends Packet
{
	private long causingEntityId; // sVLQ
	private long targetEntityId; // sVLQ
	private long positionX; // sVLQ
	private long positionY; // sVLQ
	private long damage; // sVLQ
	private int damageKind;
	private String damageSourceKind;
	private String targetMaterialKind;
	private short hitResultKind;
	
	public DamageNotificationPacket()
	{
	}
	
	public DamageNotificationPacket(long casuingEntityId, long targetEntityId, long positionX, long positionY, int damageKind, String damageSourceKind, String targetMaterialKind, short hitResultKind)
	{
		this.causingEntityId = casuingEntityId;
		this.targetEntityId = targetEntityId;
		this.positionX = positionX;
		this.positionY = positionY;
		this.damage = damage;
		this.damageKind = damageKind;
		this.damageSourceKind = damageSourceKind;
		this.targetMaterialKind = targetMaterialKind;
		this.hitResultKind = hitResultKind;
	}

	@Override
	public byte getId()
	{
		return 45;
	}
	
	@Override
	public void read(PacketReader stream)
	{
		causingEntityId = stream.readSVLQ();
		targetEntityId = stream.readSVLQ();
		positionX = stream.readSVLQ();
		positionY = stream.readSVLQ();
		damage = stream.readSVLQ();
		damageKind = stream.readUInt8();
		damageSourceKind = stream.readString();
		targetMaterialKind = stream.readString();
		hitResultKind = stream.readUInt8();
	}

	@Override
	public void write()
	{
	}

	public long getCausingEntityId()
	{
		return causingEntityId;
	}

	public long getTargetEntityId()
	{
		return targetEntityId;
	}

	public long getPositionX()
	{
		return positionX;
	}

	public long getPositionY()
	{
		return positionY;
	}

	public long getDamage()
	{
		return damage;
	}

	public int getDamageKind()
	{
		return damageKind;
	}

	public String getDamageSourceKind()
	{
		return damageSourceKind;
	}
}