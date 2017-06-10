package com.minta.durfee.minecraft.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
       	String name = names.get((new Random()).nextInt(names.size()));
        victim.sendMessage(name + " joined the fight!");
		Entity spawnee = victim.getWorld().spawnEntity(spawnPoint,  EntityType.SKELETON);        
        if (spawnee instanceof Skeleton) {
        	Skeleton sparky = (Skeleton)spawnee;
        	sparky.setTarget(victim);
        	sparky.setCustomName(name);
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
    
    private List<String> names = new ArrayList<>(Arrays.asList(
		"Atticus",
		"Barney",
		"Bella",
		"Bellatrix",
		"Birdie",
		"Biscuit",
		"Boba",
		"Bono",
		"Booboo",
		"Bubbles",
		"Buffy",
		"Callie",
		"Candy",
		"Chandler",
		"Chaucer",
		"Cleopatra",
		"Clooney",
		"Cosmo",
		"Cottontail",
		"Crookshanks",
		"Cuddles",
		"Cupcake",
		"Daisy",
		"Daphne",
		"Delilah",
		"Domino",
		"Elwood",
		"Ernie",
		"Faith",
		"Fang",
		"Faye",
		"Felix",
		"Fido",
		"Foxy",
		"Fritz",
		"Fuse",
		"Gibson",
		"Gills",
		"Hedwig",
		"Hershey",
		"Hutch",
		"Iris",
		"Ivory",
		"Jasper",
		"Jazz",
		"Joy",
		"Kalua",
		"Kassie",
		"Kingston",
		"Koby",
		"Laguna",
		"Landon",
		"Larissa",
		"Lassie",
		"Lefty",
		"Linus",
		"Logan",
		"Lola",
		"Lupin",
		"Mabel",
		"Madonna",
		"Malibu",
		"Margot",
		"Marshmallow",
		"Marti",
		"Max",
		"Maya",
		"Meadow",
		"Mercedes",
		"Merlin",
		"Merry",
		"Mia",
		"Midnight",
		"Midori",
		"Mika",
		"Milan",
		"Mira",
		"Mischa",
		"Mitzi",
		"Moby",
		"Mochi",
		"Monet",
		"Monkey",
		"Mooshie",
		"Mozart",
		"Muggle",
		"Mulder",
		"Murphy",
		"Mylo",
		"Nanda",
		"Nate",
		"Nell",
		"Nico",
		"Noodle",
		"Nugget",
		"Onyx",
		"Ozzie",
		"Paddington",
		"Padfoot",
		"Paisley",
		"Pazzo",
		"Peanut",
		"Pearl",
		"Pepper",
		"Persia",
		"Phoenix",
		"Picasso",
		"Pipsie",
		"Pixie",
		"Portia",
		"Quattro",
		"Raddish",
		"Rocky",
		"Rufus",
		"Scabbers",
		"Scout",
		"Sheba",
		"Silas",
		"Snoopy",
		"Sparky",
		"Spice",
		"Spike",
		"Sprite",
		"Stitch",
		"Sugar",
		"Summer",
		"Sunny",
		"Sushi",
		"Sweetpea",
		"Taco",
		"Tank",
		"Tanner",
		"Tatertot",
		"Theo",
		"Tibbs",
		"Tink",
		"Toast",
		"Toffee",
		"Tonks",
		"Tortoise",
		"Trix",
		"Vegas",
		"Wednesday",
		"Whiskers",
		"Wilbur",
		"Willow",
		"Wolfie",
		"Zeke",
		"Zelda",
		"Zeppelin"
    ));
}
