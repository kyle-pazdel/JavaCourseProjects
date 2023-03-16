package org.example;

public class Exercise614 {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2000));
        System.out.println(getDaysInMonth(2, 2000));
        System.out.println(getDaysInMonth(2, 2001));
        System.out.println(getDaysInMonth(3, 2000));
        System.out.println(getDaysInMonth(4, 2000));
        System.out.println(getDaysInMonth(5, 2000));
        System.out.println(getDaysInMonth(6, 2000));
        System.out.println(getDaysInMonth(7, 2000));
        System.out.println(getDaysInMonth(8, 2000));
        System.out.println(getDaysInMonth(9, 2000));
        System.out.println(getDaysInMonth(10, 2000));
        System.out.println(getDaysInMonth(11, 2000));
        System.out.println(getDaysInMonth(12, 2000));
    }

    public static boolean isLeapYear(int year){
        boolean result = false;
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) { result = true;};
        if ((year % 100 == 0) && (year % 400 == 0)) {result = true;};
        if ((year % 4 == 0) && (year % 100 != 0)) {result = true;};
        if (year < 1 || year > 9999) {result = false;};
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        boolean monthRange = month >= 1 && month <= 12;
        boolean yearRange = year >= 1 && year <= 9999;
        if ((!monthRange) || (!yearRange)) { return -1; };

        int numberOfDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            default:
                numberOfDays = -1;
                break;
        }
        if ((month == 2) && (isLeapYear(year))) {
            numberOfDays = 29;
        } else if ((month == 2) && (!isLeapYear(year))) {
            numberOfDays = 28;
        }
        return numberOfDays;
    }
}
