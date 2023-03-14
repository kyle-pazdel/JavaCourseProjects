package org.example;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(75));
        System.out.println(convertToCentimeters(6, 3));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        return (double) inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int remainingInches) {
        int feetToInches = (feet * 12);
       int totalInches = feetToInches + remainingInches;
        return convertToCentimeters(totalInches);
    }
}
