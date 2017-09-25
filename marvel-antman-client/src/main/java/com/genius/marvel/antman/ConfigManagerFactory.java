package com.genius.marvel.antman;

/**
 * @author Chuck Liu
 * @date 9/24/17
 * @time 6:04 PM
 */
public class ConfigManagerFactory {

    public static ConfigManager getConfigManager() {
        ConfigManagerImpl configManager = new ConfigManagerImpl();
        configManager.init();
        return configManager;
    }
}
