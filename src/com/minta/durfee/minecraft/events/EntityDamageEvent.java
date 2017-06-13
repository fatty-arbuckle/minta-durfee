package com.minta.durfee.minecraft.events;

import java.util.ArrayList;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;


public class EntityDamageEvent implements Listener {	

	@EventHandler
	public void onEvent(org.bukkit.event.entity.EntityDamageEvent e) {
		if (e.getCause() == DamageCause.FALL) {
			if (e.getEntity().getType() == EntityType.PLAYER) {
				Player player = (Player) e.getEntity();
				if (player.getGameMode() == GameMode.CREATIVE) { return; }
				World world = player.getWorld();
				Location location = player.getLocation();
				ArrayList<Block> blocks = new ArrayList<Block>();
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(1, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, 1)));
				blocks.add(world.getBlockAt(location.clone().subtract(-1, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, -1)));
				blocks.add(world.getBlockAt(location.clone().subtract(1, 1, 1)));
				blocks.add(world.getBlockAt(location.clone().subtract(-1, 1, -1)));
				
				blocks.add(world.getBlockAt(location.clone().subtract(2, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(-2, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, 2)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, -2)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, 2)));
				blocks.add(world.getBlockAt(location.clone().subtract(0, 1, -2)));
				blocks.add(world.getBlockAt(location.clone().subtract(2, 1, 0)));
				blocks.add(world.getBlockAt(location.clone().subtract(-2, 1, 0)));
					
				for (Block b : blocks) {
					b.breakNaturally();
				}
					
				player.setSneaking(false);
			}
		}
	}

}
