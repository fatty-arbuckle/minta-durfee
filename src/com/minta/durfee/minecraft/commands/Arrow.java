package com.minta.durfee.minecraft.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.minta.durfee.minecraft.Configuration;
import com.minta.durfee.minecraft.Configuration.ArrowType;

public class Arrow {

	public static boolean run(CommandSender sender, String label, String[] args) {

		if (sender instanceof Player) {
			
			if (args.length == 0) {
				setArrowType(sender, Configuration.ArrowType.NORMAL);

			} else if (args.length == 1) {
				String arrowTypeString = args[0].toUpperCase();

				try {
					Configuration.ArrowType arrowType = Configuration.ArrowType.valueOf(arrowTypeString);
					setArrowType(sender, arrowType);
				} catch (Exception e) {
					String arrowTypeList = "";
					for (ArrowType t : Configuration.ArrowType.values()) {
						arrowTypeList += t.toString() + " ";
					}
					sender.sendMessage("Arrow type must be one of: " + arrowTypeList);
				}
			}
			return true;

		} else {
			System.out.println(sender.getName() + " is not a player and cannot use arrows!");
			return false;
		}
	}
	
	private static void setArrowType(CommandSender sender, Configuration.ArrowType type) {
		Configuration.getInstance().setArrowType(sender.getName(), type);
        sender.sendMessage("Arrows set to '" + type.toString() + "'");
	}

}
