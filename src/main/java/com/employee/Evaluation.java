package com.employee;

public class Evaluation {

    public static String calculateRating(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }

        if (score >= 90) return "Excellent";
        else if (score >= 75) return "Good";
        else if (score >= 50) return "Average";
        else return "Poor";
    }
}