package com.genius.marvel.antman.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.genius.marvel.antman.api.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chuck Liu
 * @date 9/14/17
 * @time 7:45 PM
 */
@Controller
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "demo";
    }
}
