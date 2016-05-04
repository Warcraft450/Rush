package com.rush.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import com.rush.fr.GameState;

public class EntityDamageListener implements Listener {

	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (GameState.isState(GameState.LOBBY)) {
			if (event.getEntity() instanceof Player) {
				event.setCancelled(true);
			}
		} else {
			event.setCancelled(false);
		}
	}
}
