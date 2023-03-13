public class Main {
    public static void main(String[] args) {
        double mileage = 100;
        double kilometers = (mileage * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore; // add bonus points
        }

        int health = 1;
        if ((health < 25) && (highScore > 1000)) {
            highScore -= 1000;
            System.out.println(highScore);
        }
    }
}