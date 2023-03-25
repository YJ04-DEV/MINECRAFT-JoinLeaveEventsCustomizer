package org.extension.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.extension.services.JoinEventService;

public class JoinEvent implements Listener {
    private final JoinEventService joinEventService = new JoinEventService();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        joinEventService.setJoinMessage(playerJoinEvent);
        joinEventService.sendTitle(playerJoinEvent);
    }
}
