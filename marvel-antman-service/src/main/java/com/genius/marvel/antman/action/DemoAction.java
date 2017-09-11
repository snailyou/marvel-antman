package com.genius.marvel.antman.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.genius.marvel.antman.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author Chuck Liu
 * @date 9/10/17
 * @time 9:20 PM
 */
@Component
public class DemoAction {

    @Reference(version = "1.0.0")
    private DemoService demoService;
}
