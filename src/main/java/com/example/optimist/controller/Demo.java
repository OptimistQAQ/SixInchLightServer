package com.example.optimist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 65667
 */
@RestController
public class Demo {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello XinXin";
    }

}
