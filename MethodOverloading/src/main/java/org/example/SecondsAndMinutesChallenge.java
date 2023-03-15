package org.example;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {return "Invalid time entry.";};
        int wholeHours = seconds / 3600;
        int remainingMinutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return wholeHours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {return "Invalid time entry.";};
        if (seconds < 0) {
            return "Invalid time entry.";
        } else if (seconds > 59){
            return "Enter a seconds value less than 60.";
        };
        return getDurationString((minutes * 60) + seconds);
    }
}
