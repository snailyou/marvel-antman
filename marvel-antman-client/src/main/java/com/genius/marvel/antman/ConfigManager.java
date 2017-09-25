package com.genius.marvel.antman;

/**
 * @author Chuck Liu
 * @date 9/23/17
 * @time 3:15 PM
 */
public interface ConfigManager {

    String get(String key);

    String get(String key, String defaultValue);

    String getStringValue(String key, String defaultValue);

    boolean getBooleanValue(String key, boolean defaultValue);

}
