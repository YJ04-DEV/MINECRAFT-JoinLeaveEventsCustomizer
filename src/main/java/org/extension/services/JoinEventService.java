package org.extension.services;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.extension.utils.TextGenerator;

public class JoinEventService {
    private final TextGenerator textGenerator = new TextGenerator();
    public void setJoinMessage(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage("[ + ] " + playerJoinEvent.getPlayer().getName());
    }

    public void sendTitle(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        TextComponent textComponent = textGenerator.generator("Text", "#BCC2FF");
        player.sendTitle(textComponent.toLegacyText(), "sub", 50, 50, 50);
    }
}
