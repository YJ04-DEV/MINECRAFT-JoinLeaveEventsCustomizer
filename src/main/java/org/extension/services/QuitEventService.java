package org.extension.services;

import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEventService {
    public void setQuitMessage(PlayerQuitEvent playerQuitEvent) {
        playerQuitEvent.setQuitMessage("[ - ] " + playerQuitEvent.getPlayer().getName());
    }
}
