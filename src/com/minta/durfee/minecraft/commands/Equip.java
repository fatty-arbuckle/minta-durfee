package com.minta.durfee.minecraft.commands;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Equip {

	public static boolean run(CommandSender sender, String label, String[] args) {

		if (sender instanceof Player) {

			return true;
		} else {
        	System.out.println(sender.getName() + " is not a player and cannot be equipped!");
            return false;
		}
	}
	
	private static void addIfMissing(PlayerInventory inventory, Material item, int count) {
		if (!inventory.contains(item, count)) {
			inventory.addItem(new ItemStack(item, count));
		}
	}
}
