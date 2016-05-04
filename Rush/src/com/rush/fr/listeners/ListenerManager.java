package com.rush.fr.listeners;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import com.rush.fr.Rush;


public class ListenerManager {

	Plugin plugin;
	
	public ListenerManager() {
		this.plugin = Rush.getInstance();
	}
	
	public void registerListener() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerJoinListener(), plugin);
		pm.registerEvents(new PlayerQuitListener(), plugin);
		pm.registerEvents(new EntityDamageListener(), plugin);
	}
}
