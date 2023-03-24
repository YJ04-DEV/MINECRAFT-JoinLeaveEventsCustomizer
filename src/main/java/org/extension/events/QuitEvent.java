package org.extension.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.extension.services.QuitEventService;

public class QuitEvent implements Listener {
    private final QuitEventService quitEventService = new QuitEventService();

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        quitEventService.setQuitMessage(playerQuitEvent);
    }
}