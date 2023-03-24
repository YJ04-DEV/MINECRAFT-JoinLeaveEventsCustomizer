package org.extension;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.extension.events.JoinEvent;
import org.extension.events.QuitEvent;

public class Main extends JavaPlugin {
    public void onEnable(){
        registerEvents();
    }
    public void onDisable(){
    }
    public void registerEvents(){
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new JoinEvent(), this);
        pluginManager.registerEvents(new QuitEvent(), this);
    }
}