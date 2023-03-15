package org.example;

public class Exercise59 {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(0));
        System.out.println(area(3, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {return -1;} else {return radius * radius * Math.PI;}
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {return -1;} else {return x * y;}
    }
}
