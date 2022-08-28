package com.example.mcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/tarar")
    public String d(){
        return "hello to tarar";
    }
}

