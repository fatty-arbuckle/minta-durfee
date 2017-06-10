package com.minta.durfee.minecraft.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

import com.minta.durfee.minecraft.Configuration;
import com.minta.durfee.minecraft.tasks.FightClubSpawner;

public class FightClub {

	public static boolean run(CommandSender sender, String label, String[] args, Plugin plugin) {

		if (sender instanceof Player) {
			Player player = (Player)sender;
			
			boolean fightClub = Configuration.getInstance().toggleFightClub(player.getDisplayName());
	        sender.sendMessage("Fight club for " + player.getDisplayName() + " is " + String.valueOf(fightClub));

	        if (fightClub) {
	        	// Create the task and schedule to run it once, after 20 ticks
	            BukkitTask task = new FightClubSpawner(player).runTaskTimer(plugin,  20,  2 * 60);
	            Configuration.getInstance().setFightClubSpawner(player.getDisplayName(), task);
	        }
											
			return true;
		} else {
        	System.out.println(sender.getName() + " is not a player and cannot be equipped!");
            return false;
		}
	}

}
