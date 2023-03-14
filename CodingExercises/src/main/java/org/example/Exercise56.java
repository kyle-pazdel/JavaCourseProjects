package org.example;

public class Exercise56 {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int finalNumOne = (int) (numOne * 1000);
        int finalNumTwo = (int) (numTwo * 1000);
        if (finalNumOne - finalNumTwo == 0) {
            return true;
        } else {
            return false;
        }
    }
}
