package com.minta.durfee.minecraft;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

	public enum ArrowType {
		NORMAL
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
