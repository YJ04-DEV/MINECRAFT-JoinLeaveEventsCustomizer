package org.extension;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.extension.config.ConfigYml;
import org.extension.events.JoinEvent;
import org.extension.events.QuitEvent;

public class Main extends JavaPlugin {
    private static Main instance;
    private final ConfigYml configYml = new ConfigYml();
    public void onEnable(){
        instance = this;
        configYml.setup();
        registerEvents();
    }
    public void onDisable(){
    }
    public void registerEvents(){
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new JoinEvent(), this);
        pluginManager.registerEvents(new QuitEvent(), this);
    }

    public static Main getInstance() {
        return instance;
    }
}