package com.minta.durfee.minecraft;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.scheduler.BukkitTask;

public class Configuration {

	public Map<String, Boolean> flying = new HashMap<String, Boolean>();
	
	public enum ArrowType {
		NORMAL, LIGHTNING, FLAME, TELEPORT, TREE
	}
		
	public ArrowType getArrowType(String playerName) {
		if (playerArrowType.containsKey(playerName)) {
			return playerArrowType.get(playerName);
		}
		return ArrowType.NORMAL;
	}

	synchronized
	public void setArrowType(String playerName, ArrowType arrowType) {
		playerArrowType.put(playerName, arrowType);
	}
	
	private Map<String, ArrowType> playerArrowType = new HashMap<String, ArrowType>();

	synchronized
	public boolean toggleFightClub(String playerName) {
		boolean fightClub = true;
		if (playerFightClub.containsKey(playerName)) {
			fightClub = !(playerFightClub.get(playerName));
		}
		
		playerFightClub.put(playerName, fightClub);
		return fightClub;
	}

	synchronized
	public void setFightClubSpawner(String playerName, BukkitTask task) {
		playerFightClubSpawners.put(playerName, task);
	}

	synchronized
	public void stopFightClub(String playerName) {
		playerFightClub.put(playerName, false);
		BukkitTask task = playerFightClubSpawners.get(playerName);
		task.cancel();
		playerFightClubSpawners.remove(playerName);
	}

	private Map<String, Boolean> playerFightClub = new HashMap<String, Boolean>();
	private Map<String, BukkitTask> playerFightClubSpawners = new HashMap<String, BukkitTask>();
	
	
	
	private static Configuration instance = null;

	protected Configuration() {
	}

	public static Configuration getInstance() {
		if (instance == null) {
			synchronized (Configuration.class) {
				if (instance == null) {
					instance = new Configuration();
				}
			}
		}
		return instance;
	}

}
