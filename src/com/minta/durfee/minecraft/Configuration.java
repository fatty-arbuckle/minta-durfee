package com.minta.durfee.minecraft;

public class Configuration {

	// TODO add configuration here
	
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
