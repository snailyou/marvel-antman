package com.genius.marvel.antman;

import com.genius.marvel.antman.zookeeper.ZookeeperOperation;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Chuck Liu
 * @date 9/24/17
 * @time 3:53 PM
 */
public class ConfigManagerImpl extends AbstractConfigManager {

    private ConcurrentMap<String, String> cache = new ConcurrentHashMap<>();

    private ZookeeperOperation zookeeperOperation;

    public void init() {
        zookeeperOperation = new ZookeeperOperation();
    }

    @Override
    public String doGet(String key) {
        String value = cache.get(key);

        if (value != null) {
            return value;
        }

        value = zookeeperOperation.get(key);

        if (value != null) {
            cache.put(key, value);
        }

        return value;
    }

    public void updateCache(String key, String value) {
        key = StringUtils.trimToNull(key);

        if (key == null) {
            throw new NullPointerException();
        }

        cache.put(key, value);
    }
}
