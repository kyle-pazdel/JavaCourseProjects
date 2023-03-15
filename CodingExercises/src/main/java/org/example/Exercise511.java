package org.example;

public class Exercise511 {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(-1, 2, 3);
    }

    public static void printEqual(int numOne, int numTwo, int numThree) {
        boolean allEqual = (numOne == numTwo) && (numOne == numThree);
        boolean allDifferent = (numOne != numTwo) && (numOne != numThree) && (numTwo != numThree);
        boolean isNegative = (numOne < 0) || (numTwo < 0) || (numThree < 0);
        if (isNegative) {
            System.out.println("Invalid Value");
        } else if (allEqual) {
            System.out.println("All numbers are equal");
        } else if (allDifferent) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
