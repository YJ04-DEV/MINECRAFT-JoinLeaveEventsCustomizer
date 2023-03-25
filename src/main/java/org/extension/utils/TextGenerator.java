package org.extension.utils;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class TextGenerator {
    public TextComponent create(String ...parameter) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText(parameter[0]);
        if (parameter.length == 2) textComponent.setColor(ChatColor.of(parameter[1]));
        return textComponent;
    }
}
