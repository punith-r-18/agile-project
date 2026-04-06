package com.discount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    DiscountCalculator calculator = new DiscountCalculator();

    @Test
    void testPremiumFestivalDiscount() {
        double result = calculator.calculateDiscount(1000, "PREMIUM", "FESTIVAL", 150);
        assertEquals(700.0, result);
    }

    @Test
    void testRegularNormalDiscount() {
        double result = calculator.calculateDiscount(1000, "REGULAR", "NORMAL", 50);
        assertEquals(950.0, result);
    }

    @Test
    void testInvalidPrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateDiscount(0, "REGULAR", "NORMAL", 50);
        });
    }
}