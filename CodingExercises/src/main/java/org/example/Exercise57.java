package org.example;

public class Exercise57 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        if (numOne + numTwo == numThree) {
            return true;
        } else {
            return false;
        }
    }
}
