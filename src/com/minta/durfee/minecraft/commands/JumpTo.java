package com.minta.durfee.minecraft.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JumpTo {
	public static boolean run(CommandSender sender, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player)sender;

			if (args.length == 0) {
				System.out.println("Must specify a player");
				return false;

			} else if (args.length == 1) {
				for (Player to : player.getWorld().getPlayers()) {
					if (to.getName().equalsIgnoreCase(args[0])) {
						player.teleport(to.getLocation());
					}
				}
			}
	
			return true;
		}
		
		return false;
	}
}
