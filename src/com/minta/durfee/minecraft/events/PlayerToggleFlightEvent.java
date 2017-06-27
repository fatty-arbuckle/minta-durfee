package com.minta.durfee.minecraft.events;

import org.bukkit.GameMode;
import org.bukkit.Particle;
import org.bukkit.Statistic;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.minta.durfee.minecraft.tasks.SuperJumpReset;

public class PlayerToggleFlightEvent implements Listener {
	
	private Plugin plugin;
	
	public PlayerToggleFlightEvent(Plugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onEvent(org.bukkit.event.player.PlayerToggleFlightEvent e) {
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE) { return; }
		
		ItemStack theBoots = player.getInventory().getBoots();
		if (theBoots != null && theBoots.containsEnchantment(Enchantment.DURABILITY)) {
			player.setVelocity(player.getLocation().getDirection().multiply(1.6D).setY(1.0D));
			player.spawnParticle(Particle.FLAME, player.getLocation(), 50);
			player.setStatistic(Statistic.JUMP, 1000);
			new SuperJumpReset(player).runTaskLater(plugin, 10);
		} else {
			player.setAllowFlight(false);
			player.setFlying(false);
			player.setStatistic(Statistic.JUMP, 0);
		}
	}
	
}