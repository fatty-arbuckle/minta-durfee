package com.minta.durfee.minecraft;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.minta.durfee.minecraft.events.ProjectileHitEvent;
import com.minta.durfee.minecraft.events.ProjectileLaunchEvent;
import com.minta.durfee.minecraft.events.PlayerDeathEvent;

public class EventRegistration {

	public EventRegistration(PluginManager pm, JavaPlugin plugin) {
		pm.registerEvents(new ProjectileHitEvent(), plugin);
		pm.registerEvents(new ProjectileLaunchEvent(), plugin);
		pm.registerEvents(new PlayerDeathEvent(), plugin);
	}

}
