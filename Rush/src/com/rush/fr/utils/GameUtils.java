package com.rush.fr.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class GameUtils {

	static GameUtils instance = new GameUtils();
	private GameUtils() {}
	public static GameUtils getInstance() {return instance;}
	
	public String getPrefix() {
		return "§7[§9Rush§7] §r";
	}
	
	public World getWorld() {
		return Bukkit.getWorlds().get(0);
	}
	
	public Location getLobbyLocation() {
		return new Location(getWorld(), -210.5, 52, -8.5);
	}
	
	
}
