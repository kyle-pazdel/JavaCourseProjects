package org.example;

public class Exercise619 {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)) {
            return false;
        }
        int firstDigitOne = numberOne % 10;
        int firstDigitTwo = numberTwo % 10;
        int secondDigitOne = numberOne / 10;
        int secondDigitTwo = numberTwo / 10;
        if (((firstDigitOne == secondDigitOne) || (firstDigitOne == secondDigitTwo)) || ((secondDigitOne == secondDigitTwo) || (secondDigitOne == firstDigitTwo))) {
            return true;
        }
        return false;
    }
}
