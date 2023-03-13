public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tanya", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(1000));
        displayHighScorePosition("Sally", calculateHighScorePosition(500));
        displayHighScorePosition("Tim", calculateHighScorePosition(100));
        displayHighScorePosition("Laney", calculateHighScorePosition(25));
    }
        public static void displayHighScorePosition(String name, int position) {
            System.out.println(name + " managed to get into position " + position + " on the high score list");
        }

        public static int calculateHighScorePosition(int score) {
            int result = 4;
            if (score >= 1000) {
                result = 1;
            } else if (score >= 500) {
                result = 2;
            } else if (score >= 100 ) {
                result = 3;
            }
            return result;
        }
}
