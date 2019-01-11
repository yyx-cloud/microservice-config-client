package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yunxiang.yang
 * @Date: 2019/1/11 18:10
 */

@RestController
public class ProfileController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String profile() {
        return profile;
    }
}
