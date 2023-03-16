public class SwitchChallenge {

    public static void main(String[] args) {
//        char letter = 'A';
//        char letter = 'B';
//        char letter = 'C';
//        char letter = 'D';
//        char letter = 'E';
        char letter = 'Z';
        System.out.println(decodeNatoLetters((letter)));
    }

    public static String decodeNatoLetters(char letter) {
        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "not found";
        }
    }
}
