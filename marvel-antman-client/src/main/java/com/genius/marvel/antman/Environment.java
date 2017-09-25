package com.genius.marvel.antman;

import lombok.Data;

/**
 * @author Chuck Liu
 * @date 9/23/17
 * @time 3:02 PM
 */
@Data
public class Environment {

    /* prod, beta .. */
    private String deployEnv;

    private String zkServer;

    private String appName;

}
