package com.minta.durfee.minecraft;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.minta.durfee.minecraft.events.ProjectileHitEvent;
import com.minta.durfee.minecraft.events.ProjectileLaunchEvent;
import com.minta.durfee.minecraft.events.PlayerDeathEvent;
import com.minta.durfee.minecraft.events.PlayerToggleFlightEvent;
import com.minta.durfee.minecraft.events.PlayerMoveEvent;
import com.minta.durfee.minecraft.events.PlayerToggleSneakEvent;
import com.minta.durfee.minecraft.events.EntityDamageEvent;

public class EventRegistration {

	public EventRegistration(PluginManager pm, JavaPlugin plugin) {
		pm.registerEvents(new ProjectileHitEvent(), plugin);
		pm.registerEvents(new ProjectileLaunchEvent(), plugin);
		pm.registerEvents(new PlayerDeathEvent(), plugin);
		pm.registerEvents(new PlayerToggleFlightEvent(plugin), plugin);
		pm.registerEvents(new PlayerMoveEvent(), plugin);
		pm.registerEvents(new PlayerToggleSneakEvent(), plugin);
		pm.registerEvents(new EntityDamageEvent(), plugin);
	}

}
