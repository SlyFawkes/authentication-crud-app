package com.slyfawkes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newController {

    @GetMapping("/")
    @ResponseBody
    public String thing() {
        return "HI";
    }
}
