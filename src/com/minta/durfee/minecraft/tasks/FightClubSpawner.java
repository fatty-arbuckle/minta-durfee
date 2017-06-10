package com.minta.durfee.minecraft.tasks;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class FightClubSpawner extends BukkitRunnable {

	private Player victim;

    public FightClubSpawner(Player victim) {
    	this.victim = victim;
    }

    @Override
    public void run() {
		Location spawnPoint = nearbyLocation(victim.getLocation(), 5);
		victim.sendMessage("fight!");
		Entity spawnee = victim.getWorld().spawnEntity(spawnPoint,  EntityType.SKELETON);        
        if (spawnee instanceof Skeleton) {
        	Skeleton sparky = (Skeleton)spawnee;
        	sparky.setTarget(victim);
        	sparky.setCustomName("Sparky");
        	sparky.setCustomNameVisible(true);
        }

    }
    
    private static Location nearbyLocation(Location center, int radius) {
		Random picker = new Random();
		int x = center.getBlockX() + picker.nextInt(radius*2) - radius;
		int z = center.getBlockZ() + picker.nextInt(radius*2) - radius;
		
		if (x == 0 && z == 0) {
			x = 1;
			z = 1;
		}
				
		Location nearby = center.clone().add(x, 0, z);

		// move up until we are in the air
		Vector oneUp = new Vector(0, 1, 0);
		while (nearby.getBlock().getType() != Material.AIR) {
			nearby.add(oneUp);
		}
		
		// move down until there is not air under us
		Vector oneDown = new Vector(0, -1, 0);
		while (nearby.clone().add(oneDown).getBlock().getType() == Material.AIR) {
			nearby.add(oneDown);
		}

		return nearby;
	}

}