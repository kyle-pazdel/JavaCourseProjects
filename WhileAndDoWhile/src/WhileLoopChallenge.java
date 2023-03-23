public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i = 4;
        int oddCount = 0;
        int evenCount = 0;
        while (i <= 20) {
            i++;
            if (!isEvenNumber(i)) {
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println(i);
            if (evenCount >= 5) break;
        };
        System.out.println("Total Odd Numbers " + oddCount);
        System.out.println("Total Even Numbers " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
