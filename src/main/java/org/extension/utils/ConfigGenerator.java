package org.extension.utils;

import org.extension.Main;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ConfigGenerator {
    public void generator() {
        File configFile = new File(Main.getInstance().getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            Main.getInstance().getConfig().options().copyDefaults(true);
            String[] events = {"JoinEvent", "QuitEvent"};
            List<String> keys = Arrays.asList("message", "messageColor", "playerColor");
            for (String event : events) {
                for (String key : keys) {
                    if (key.equals("message")) {
                        Main.getInstance().getConfig().addDefault(event + "." + key, switch (event) {
                            case "JoinEvent" -> "#PLAYER# 님이 접속하셨습니다.";
                            case "QuitEvent" -> "#PLAYER# 님이 퇴장하셨습니다.";
                            default -> "#FFFFFF";
                        });
                    } else Main.getInstance().getConfig().addDefault(event + "." + key, "#FFFFFF");
                }
            }
            Main.getInstance().saveConfig();
        }
    }
}
