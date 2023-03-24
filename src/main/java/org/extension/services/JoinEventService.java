package org.extension.services;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventService {
    public void setJoinMessage(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage("[ + ] " + playerJoinEvent.getPlayer().getName());
        sendTitle(playerJoinEvent);
    }

    public void sendTitle(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        String title = "[\"\",{\"text\":\"Welcome to \"},{\"text\":\"World\",\"color\":\"#BCFFDE\"}]";
        Bukkit.getWorld(player.getWorld().getName()).setGameRule(GameRule.SEND_COMMAND_FEEDBACK, false);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName() + " title " + title);
        Bukkit.getWorld(player.getWorld().getName()).setGameRule(GameRule.SEND_COMMAND_FEEDBACK, true);
    }
}
