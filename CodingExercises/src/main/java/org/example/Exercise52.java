package org.example;

public class Exercise52 {
    public static void main(String[] args) {
        printConversion(1.0);
        printConversion(80);
        printConversion(-1);
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long result = 0;
        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609344;
            result = Math.round(milesPerHour);
        };
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
