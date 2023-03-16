package org.example;

public class Exercise13 {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(9);
        printNumberInWord(120);
        printNumberInWord(-34);
    }

    public static void printNumberInWord(int number) {
        String text = "";
        switch (number) {
            case 0:
                text = "ZERO";
                break;
            case 1:
                text = "ONE";
                break;
            case 2:
                text = "TWO";
                break;
            case 3:
                text = "THREE";
                break;
            case 4:
                text = "FOUR";
                break;
            case 5:
                text = "FIVE";
                break;
            case 6:
                text = "SIX";
                break;
            case 7:
                text = "SEVEN";
                break;
            case 8:
                text = "EIGHT";
                break;
            case 9:
                text = "NINE";
                break;
            default:
                text = "OTHER";
                break;
        }
        System.out.println(text);
    }
}
