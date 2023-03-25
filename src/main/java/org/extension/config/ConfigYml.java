package org.extension.config;

import org.extension.Main;
import org.extension.utils.ConfigGenerator;

import java.util.HashMap;
import java.util.Map;

public class ConfigYml {
    private final ConfigGenerator configGenerator = new ConfigGenerator();
    public void setup() {
        configGenerator.generator();
        getConfigValue();
    }

    public void getConfigValue() {
        Map<String, Map<String, String>> events = new HashMap<>();
        events.put("JoinEvent", new HashMap<>());
        events.get("JoinEvent").put("message", Main.getInstance().getConfig().getString("JoinEvent.message"));
        events.get("JoinEvent").put("messageColor", Main.getInstance().getConfig().getString("JoinEvent.messageColor"));
        events.get("JoinEvent").put("playerColor", Main.getInstance().getConfig().getString("JoinEvent.playerColor"));

        events.put("QuitEvent", new HashMap<>());
        events.get("QuitEvent").put("message", Main.getInstance().getConfig().getString("QuitEvent.message"));
        events.get("QuitEvent").put("messageColor", Main.getInstance().getConfig().getString("QuitEvent.messageColor"));
        events.get("QuitEvent").put("playerColor", Main.getInstance().getConfig().getString("QuitEvent.playerColor"));
        System.out.println(events.get("JoinEvent").get("message"));
    }
}
