package org.example;

public class Exercise55 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(2001));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));
    }
    public static boolean isLeapYear(int year){
        boolean result = false;
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) { result = true;};
        if ((year % 100 == 0) && (year % 400 == 0)) {result = true;};
        if ((year % 4 == 0) && (year % 100 != 0)) {result = true;};
        if (year < 1 || year > 9999) {result = false;};
        return result;
    }
}
