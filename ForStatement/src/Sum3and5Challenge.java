public class Sum3and5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; count <5 && i <= 1000; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;
            if (divisibleByThree && divisibleByFive) {
                sum += i;
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
