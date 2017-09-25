package com.genius.marvel.antman;

/**
 * @author Chuck Liu
 * @date 9/21/17
 * @time 10:06 PM
 */
public class Antman {

    private static ConfigManager configManager = ConfigManagerFactory.getConfigManager();

    public static String get(String key) {
        return configManager.get(key);
    }

    public static String get(String key, String defaultValue) {
        return configManager.get(key, defaultValue);
    }

    public static String getStringValue(String key, String defaultValue) {
        return configManager.getStringValue(key, defaultValue);
    }

    public static boolean getBooleanValue(String key, boolean defaultValue) {
        return configManager.getBooleanValue(key, defaultValue);
    }
}
