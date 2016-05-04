package com.rush.fr.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.rush.fr.GameState;
import com.rush.fr.utils.GameUtils;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (GameState.isState(GameState.LOBBY)) {
			player.setHealth(20);
			player.setFoodLevel(20);
			player.setLevel(0);
			player.setExp(0);
			
			player.teleport(GameUtils.getInstance().getLobbyLocation());
			
			player.setGameMode(GameMode.ADVENTURE);
			
			event.setJoinMessage(GameUtils.getInstance().getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + " §7a rejoint le serveur §a(" + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers() + ")");
		} else {
			player.kickPlayer("§cLa partie a déjà commencé !");
		}
	}
}