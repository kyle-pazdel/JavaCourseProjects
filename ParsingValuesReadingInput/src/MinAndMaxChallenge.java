import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        minOrMax();
    }

    public static void minOrMax() {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;
        do {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
            System.out.println("Minimum Number: " + min);
            System.out.println("Maximum Number: " + max);

        } while (true);
    }

    public static double checkForInt(String input) {
        double number = Double.parseDouble(input);
        return number;
    }

}
