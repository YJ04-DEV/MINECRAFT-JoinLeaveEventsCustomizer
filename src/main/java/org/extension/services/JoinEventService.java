package org.extension.services;

import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventService {
    public void setJoinMessage(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage("[ + ] " + playerJoinEvent.getPlayer().getName());
    }
}
