package com.job.interview.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MinimumDifferenceController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}


