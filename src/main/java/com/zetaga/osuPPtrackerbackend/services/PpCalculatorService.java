package com.zetaga.osuPPtrackerbackend.services;

import com.zetaga.osuPPtrackerbackend.ScoreStatistics;
import com.zetaga.osuPPtrackerbackend.controllers.ScoreController;
import org.springframework.stereotype.Service;

/**
 * @author frankhat
 * @version 1.0
 *
 */

@Service
public class PpCalculatorService {

    public double calculatePotentialAccuracy(ScoreStatistics stats) {

        int totalHits = stats.getCount300() + stats.getCount100() + stats.getCount50() + stats.getCountMiss();

        if (totalHits == 0) return 0.0;
        int potential300s = stats.getCount300() + stats.getCountMiss();

        //Formula to calculate accuracy

        double numerator = (300.0 * potential300s) + (100.0 * stats.getCount100()) + (50.0 * stats.getCount50());
        double denominator = 300.0 * totalHits;


        return (numerator/denominator) * 100.0;
    }

}
