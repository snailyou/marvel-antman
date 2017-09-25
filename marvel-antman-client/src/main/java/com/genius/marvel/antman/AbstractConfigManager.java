package com.genius.marvel.antman;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Chuck Liu
 * @date 9/23/17
 * @time 3:26 PM
 */
public abstract class AbstractConfigManager implements ConfigManager {

    @Override
    public String get(String key) {
        key = StringUtils.trimToNull(key);

        if (key == null) {
            throw new NullPointerException();
        }

        return doGet(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        try {
            return get(key);
        } catch (NullPointerException ex) {
            return defaultValue;
        }
    }

    @Override
    public String getStringValue(String key, String defaultValue) {
        return get(key, defaultValue);
    }

    @Override
    public boolean getBooleanValue(String key, boolean defaultValue) {
        try {
            String stringValue = get(key);
            return Boolean.parseBoolean(stringValue);
        } catch (NullPointerException ex) {
            return defaultValue;
        }
    }

    public abstract String doGet(String key);
}
