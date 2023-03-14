package org.example;

public class Exercise53 {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(500);
        printMegaBytesAndKiloBytes(14);
        printMegaBytesAndKiloBytes(12345024);
        printMegaBytesAndKiloBytes(-1);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if ( kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
