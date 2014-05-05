package com.ryanprintup.starsector.command;

import com.ryanprintup.starsector.Player;
import com.ryanprintup.starsector.Server;
import com.ryanprintup.starsector.StarSector;
import com.ryanprintup.starsector.util.Console;

public abstract class Command
{
	protected static Server server = StarSector.getServer();
	protected static Console console = server.getConsole();
	protected static CommandList commandList = new CommandList();
	
	protected String name;
	protected String shortcut;
	protected boolean allowConsole;
	protected boolean allowPlayer;
	protected String help;

	public final void use(Player player, String command) {
		if (player == null) {
			if (!allowConsole) {
				console.write("This command can't be used in the console!");
				return;
			}
		} else {
			if (!allowPlayer) {
				player.sendMessage("This command can't be used by a player!");
				return;
			}
		}
		
		
		// Remove command name and pass in an empty string if no parameters are set
		String args = command.substring(command.indexOf(" ") + 1, command.length());
		args = (args != null) ? args : "";
		
		onUse(player, args);
	}
	
	public abstract void onUse(Player player, String args);
	
	public final void help(Player player) {
		if (player == null) {
			console.write(help);
		} else {
			player.sendMessage("/" + help);
		}
	}
	
	public final String getName() {
		return name;
	}

	public final String getShortcut()
	{
		return shortcut;
	}

	public final boolean allowConsole()
	{
		return allowConsole;
	}

	public final boolean allowPlayer()
	{
		return allowPlayer;
	}

	public final String getHelp()
	{
		return help;
	}
}
