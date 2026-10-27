package com.zetaga.osuPPtrackerbackend.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author frankhat
 * @version 1.0
 * October 2026
 */

//Tells Spring(the framework) that this class is going to handle web requests
    //and send back data

@RestController
public class ScoreController {

    @GetMapping("/hello")
    public String testMethod(){

        return "Hello there!";

    }

}
