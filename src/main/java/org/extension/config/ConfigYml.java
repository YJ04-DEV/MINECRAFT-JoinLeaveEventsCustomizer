package org.extension.config;

import org.extension.utils.ConfigGenerator;

public class ConfigYml {
    private final ConfigGenerator configGenerator = new ConfigGenerator();
    public void setup() {
        configGenerator.generator();
    }
}
