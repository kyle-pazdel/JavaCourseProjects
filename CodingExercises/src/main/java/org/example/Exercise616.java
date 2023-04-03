package org.example;

public class Exercise616 {

    public static void main(String[] args) {
            isPalindrome(12521);
//        System.out.println(-1221);
//        System.out.println(707);
//        System.out.println(11212);
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }

        return number == reverse;
    }

}