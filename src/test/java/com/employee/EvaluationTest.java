package com.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class EvaluationTest {

    @Test
    void testExcellent() {
        assertEquals("Excellent", Evaluation.calculateRating(95));
    }

    @Test
    void testGood() {
        assertEquals("Good", Evaluation.calculateRating(80));
    }

    @Test
    void testAverage() {
        assertEquals("Average", Evaluation.calculateRating(60));
    }

    @Test
    void testPoor() {
        assertEquals("Poor", Evaluation.calculateRating(30));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Evaluation.calculateRating(150);
        });
    }
}