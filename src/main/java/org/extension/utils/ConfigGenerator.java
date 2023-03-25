package org.extension.utils;

import org.extension.Main;

import java.io.File;

public class ConfigGenerator {
    public void generator() {
        File configFile = new File(Main.getInstance().getDataFolder(), "config.yml");
        if (configFile.exists()) {

        } else {
            Main.getInstance().getConfig().set("test", "test");
            Main.getInstance().saveConfig();
        }
    }
}
