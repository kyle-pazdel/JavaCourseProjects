import java.util.Scanner;

public class Exercise628 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        int number = 0;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                count++;
            } catch (NumberFormatException badData) {
                break;
            }
            sum += number;
        }
        if (count != 0) {
            avg = Math.round((double) sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
