package org.example;

public class Exercise54 {
    public static void main(String[] arggs) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22){
            return true;
        } else {
            return false;
        }
    }
}
