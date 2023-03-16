public class ForStatementChallenge {

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//        System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
//        }
        int counter = 0;
        for (int i = 10; counter < 3 && i < 50; i++) {
            if (isPrime(i)) {
                counter += 1;
                System.out.println(i + " is a prime number.");
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
