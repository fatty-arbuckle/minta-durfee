package com.minta.durfee.minecraft.events;

import java.util.Random;

import org.bukkit.TreeType;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.projectiles.ProjectileSource;

import com.minta.durfee.minecraft.Configuration;

public class ProjectileHitEvent implements Listener {
    
	private Configuration cfg = Configuration.getInstance();

    @EventHandler
    public void onEvent(org.bukkit.event.entity.ProjectileHitEvent event)
    {
		Projectile arrow = event.getEntity();
		if (arrow instanceof Arrow) {
            ProjectileSource projectileSource = arrow.getShooter();
            if (projectileSource instanceof Player) {
                Player shooter = (Player)projectileSource;
                Configuration.ArrowType arrowType = cfg.getArrowType(shooter.getName());

                switch (arrowType) {
                    case NORMAL:
                        break;

                    case LIGHTNING:
                    	arrow.setGlowing(false);
                        arrow.getWorld().setThundering(false);
                        arrow.getWorld().strikeLightning(arrow.getLocation());
                        break;
                    
                    case FLAME:
                    	arrow.getWorld().createExplosion(arrow.getLocation(), (float)0.25, true);
                        break;
                    
                    case TELEPORT:
                    	shooter.teleport(arrow.getLocation());
                        break;
                    
                    case TREE:
                    	TreeType[] treeTypes = TreeType.values();
						int tree = (new Random()).nextInt(treeTypes.length);
						arrow.getWorld().generateTree(arrow.getLocation(), treeTypes[tree]);
						break;
                }
            }
		}
    }
}