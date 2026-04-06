package com.discount;

public class DiscountCalculator {

    public double calculateDiscount(double price, String userType, String season, int stock) {

        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }

        double discount = 0;

        // User-based discount
        if (userType.equalsIgnoreCase("PREMIUM")) {
            discount += 10;
        } else if (userType.equalsIgnoreCase("REGULAR")) {
            discount += 5;
        }

        // Seasonal discount
        if (season.equalsIgnoreCase("FESTIVAL")) {
            discount += 15;
        }

        // Stock-based discount
        if (stock > 100) {
            discount += 5;
        }

        return price - (price * discount / 100);
    }
}