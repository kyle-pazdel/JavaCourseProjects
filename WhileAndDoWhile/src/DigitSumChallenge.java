public class DigitSumChallenge {

    public static void main(String[] args) {
        sumDigits(1234);
        sumDigits(125);
        sumDigits(1000);
        sumDigits(1);
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number != 0) {
            System.out.println("Number: " + number);
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Sum: " + sum);
        System.out.println("_____");
        return sum;
    }
}
