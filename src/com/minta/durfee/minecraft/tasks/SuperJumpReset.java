package com.minta.durfee.minecraft.tasks;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SuperJumpReset extends BukkitRunnable {

	private Player player;

    public SuperJumpReset(Player player) {
    	this.player = player;
    }

    @Override
    public void run() {
		player.setAllowFlight(false);
		player.setFlying(false);
		player.setStatistic(Statistic.JUMP, 0);
    }

}
