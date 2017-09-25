package com.genius.marvel.antman;

import com.genius.marvel.antman.util.FileUtil;

import java.util.Properties;

/**
 * @author Chuck Liu
 * @date 9/22/17
 * @time 5:03 PM
 */
public class EnvironmentLoader {

    public static Environment load() {
        Properties appenv = FileUtil.loadProperties(Constant.APP_ENV_FILE);

        Environment environment = new Environment();
        environment.setDeployEnv(appenv.getProperty("deployenv", "qa"));
        environment.setZkServer(appenv.getProperty("zkserver", "127.0.0.1:2181"));

        return environment;
    }

}
