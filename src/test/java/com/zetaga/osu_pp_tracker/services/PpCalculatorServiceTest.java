package com.zetaga.osu_pp_tracker.services;

import com.zetaga.osu_pp_tracker.ScoreStatistics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PpCalculatorServiceTest {

    private final PpCalculatorService calculator = new PpCalculatorService();

    @Test
    void testPerfectPotentialAccuracy() {
        //Create a score with no misses
        ScoreStatistics stats = new ScoreStatistics();
        stats.setCount300(100);
        stats.setCount100(0);
        stats.setCount50(0);
        stats.setCountMiss(0);

        //Calculate the potential accuracy
        double accuracy = calculator.calculatePotentialAccuracy(stats);

        //It should be 100%
        assertEquals(100.0, accuracy, 0.001);
    }

}
