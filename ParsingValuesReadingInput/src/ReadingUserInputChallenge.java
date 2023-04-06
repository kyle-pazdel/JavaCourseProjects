import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        enterFiveNumbers();
    }

    public static void enterFiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        double sum = 0;
        do {
            System.out.println("Enter number #:" + number);
            try {
                sum += checkData(scanner.nextLine());
                number++;
            } catch (NumberFormatException badUserData) {
                System.out.println("You must enter a valid number!!!");
            }
        } while (number <= 5);

        System.out.println("The sum of these numbers is: " + sum);
    }

    public static double checkData(String input) {
//        int number = Integer.parseInt(input);
        double number = Double.parseDouble(input);
        return number;
    }
}
