package com.zetaga.osuPPtrackerbackend.controllers;


import com.zetaga.osuPPtrackerbackend.ScoreStatistics;
import com.zetaga.osuPPtrackerbackend.services.PpCalculatorService;
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

    private final PpCalculatorService calculatorService;

    public ScoreController(PpCalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String testMethod(){

        return "Hello there!";

    }

    @GetMapping("/potential-accuracy")
    public double potentialAccuracy(){
        ScoreStatistics score = new ScoreStatistics();
        score.setCount50(8);
        score.setCount100(23);
        score.setCount300(100);
        score.setCountMiss(9);

        return calculatorService.calculatePotentialAccuracy(score);
    }
}
