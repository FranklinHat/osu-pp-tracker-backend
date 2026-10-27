package com.zetaga.osuPPtrackerbackend.controllers;


import com.zetaga.osuPPtrackerbackend.ScoreStatistics;
import com.zetaga.osuPPtrackerbackend.services.PpCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public double potentialAccuracy(@RequestParam int count50,@RequestParam int count100,
                                    @RequestParam int count300,@RequestParam int countMiss){

        ScoreStatistics stats = new ScoreStatistics();
        stats.setCount50(count50);
        stats.setCount100(count100);
        stats.setCount300(count300);
        stats.setCountMiss(countMiss);

        return calculatorService.calculatePotentialAccuracy(stats);
    }
}
