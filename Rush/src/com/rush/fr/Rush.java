package com.rush.fr;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.rush.fr.listeners.ListenerManager;

public class Rush extends JavaPlugin implements Listener {
	
	private static Rush instance;
	
	@Override
	public void onEnable() {
		instance = this;
		GameState.setState(GameState.LOBBY);
		new ListenerManager().registerListener();
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		
		super.onDisable();
	}
	
	public static Rush getInstance() {
		return instance;
	}
}