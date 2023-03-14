package org.example;

public class Exercise58 {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 24));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        boolean isInRangeOne = ageOne >= 13 && ageOne <= 19;
        boolean isInRangeTwo = ageTwo >= 13 && ageTwo <= 19;
        boolean isInRangeThree = ageThree >= 13 && ageThree <= 19;
        return isInRangeOne || isInRangeTwo || isInRangeThree;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
