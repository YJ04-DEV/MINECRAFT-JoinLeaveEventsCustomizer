package org.extension.services;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventService {
    public void setJoinMessage(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage("[ + ] " + playerJoinEvent.getPlayer().getName());
        sendTitle(playerJoinEvent);
    }

    public void sendTitle(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        player.sendTitle("title", "subtitle", 60, 60, 20);
    }
}
