package com.minta.durfee.minecraft.events;

import org.bukkit.GameMode;
import org.bukkit.Particle;
import org.bukkit.Statistic;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class PlayerMoveEvent implements Listener {
		
	@EventHandler
	public void onEvent(org.bukkit.event.player.PlayerMoveEvent e) {
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE) { return; }

		ItemStack theBoots = player.getInventory().getBoots();
		if (theBoots != null && theBoots.containsEnchantment(Enchantment.DURABILITY)) {
			player.setAllowFlight(true);
		}
		
		if (player.getStatistic(Statistic.JUMP) >= 1000) {
			player.spawnParticle(Particle.SMOKE_NORMAL, player.getLocation(), 150);
		}
		
		if(e.getFrom().getBlockY() - e.getTo().getBlockY() - 2 >= 0) {
			player.setAllowFlight(false);
			player.setFlying(false);
		}

	}

}
