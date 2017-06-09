package com.minta.durfee.minecraft.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.minta.durfee.minecraft.Configuration;

public class PlayerDeathEvent implements Listener {
    
	private Configuration cfg = Configuration.getInstance();

    @EventHandler
    public void onEvent(org.bukkit.event.entity.PlayerDeathEvent event)
    {
		Player player = event.getEntity();
		cfg.stopFightClub(player.getDisplayName());
    }

}
