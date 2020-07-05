package com.boom.boomin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoominController {
    @GetMapping()
    public String homePage(){
        return "Hi guys";
    }
}
