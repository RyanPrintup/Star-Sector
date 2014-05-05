package com.ryanprintup.starsector.net.packets;

public class Packets
{	
	/**
	 * Packet information from http://starbound-dev.org/ 
	 */
	
	public static final byte
		protocolVersion 		     = 0x00,
		connectionResponse 		     = 0x01,
		disconnectResponse 		     = 0x02,
		handshakeChallenge 		     = 0x03,
		chatRecieved 			     = 0x04,
		universeTimeUpdate 		     = 0x05,
		celestialResponse 		     = 0x06,
		clientConnect 			     = 0x07,
		clientDisconnect 		     = 0x08,
		handshakeResponse 		     = 0x09,
		warpCommand 			     = 0x10,
		chatSent 				     = 0x11,
		celestialRequest 		     = 0x12,
		clientContextUpdate 	     = 0x13,
		worldStart 				     = 0x14,
		worldStop 				     = 0x15,
		tileArrayUpdate 		     = 0x16,
		tileUpdate 				     = 0x17,
		tileLiquidUpdate 		     = 0x18,
		tileDamageUpdate 		     = 0x19,
		tileModificationFailure      = 0x20,
		giveItem 				     = 0x21,
		swapInContainerResult 	     = 0x22,
		enviormentUpdate 		     = 0x23,
		entityInteractResult 	     = 0x24,
		modifyTileList 			     = 0x25,
		damageTile 				     = 0x26,
		damageTileGroup 		     = 0x27,
		requestDrop 			     = 0x28,
		spawnEntity 			     = 0x29,
		entityInteract 			     = 0x30,
		connectWire 			     = 0x31,
		disconnectAllWires 		     = 0x32,
		openContainer 			     = 0x33,
		closeContainer 			     = 0x34,
		swapInContainer 		     = 0x35,
		itemApplyInContainer 		 = 0x36,
		startCraftingInContainer 	 = 0x37,
		stopCraftingInContainer 	 = 0x38,
		burnContainer 			     = 0x39,
		clearContainer 			     = 0x40,
		worldClientStateUpdate 	     = 0x41,
		entityCreate 			     = 0x42,
		entityUpdate 			     = 0x43,
		entityDestroy 			     = 0x44,
		damageNotification 		     = 0x45,
		statusEffectRequesT 	     = 0x46,
		updateWorldProperties 	     = 0x47,
		heartbeat 				     = 0x48;
}
