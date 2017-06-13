package com.minta.durfee.minecraft.events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.util.Vector;

public class PlayerToggleSneakEvent implements Listener {
		
	@EventHandler
	public void onEvent(org.bukkit.event.player.PlayerToggleSneakEvent e) {
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE) { return; }
				
		if (player.isOnGround() == false) {
			player.setVelocity(new Vector(0, -5, 0));
		}
	}
	
}
