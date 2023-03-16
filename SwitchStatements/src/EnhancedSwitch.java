public class EnhancedSwitch {
    public static void main(String[] args) {
        String month = "APRIL";
        String monthTwo = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        System.out.println(monthTwo + " is in the " + getQuarter(monthTwo) + " quarter");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rh";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> { String badResponse = month + " is bad";
                yield badResponse;}
        };
    }
}
