package com.genius.marvel.antman.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.genius.marvel.antman.api.DemoService;

/**
 * @author Chuck Liu
 * @date 9/10/17
 * @time 9:08 PM
 */
@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}
