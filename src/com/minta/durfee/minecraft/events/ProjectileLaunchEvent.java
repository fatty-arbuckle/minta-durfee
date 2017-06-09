package com.minta.durfee.minecraft.events;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.projectiles.ProjectileSource;

import com.minta.durfee.minecraft.Configuration;
import com.minta.durfee.minecraft.Configuration.ArrowType;

public class ProjectileLaunchEvent implements Listener {

	private Configuration cfg = Configuration.getInstance();

	@EventHandler
    public void onEvent(org.bukkit.event.entity.ProjectileLaunchEvent event)
    {
		Projectile arrow = event.getEntity();
		if (arrow instanceof Arrow) {
			ProjectileSource source = arrow.getShooter();
			if (source instanceof Player) {
				Player player = (Player)source;
				ArrowType arrowType = cfg.getArrowType(player.getName());
				
				switch(arrowType) {
				case NORMAL:
					break;				
				}
			}
		}
    }
}