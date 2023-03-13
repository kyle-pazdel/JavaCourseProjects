public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Kyle");
//        boolean isHuman = true;
//        boolean isAlien = false;
//        if (isAlien == false){
//            System.out.println("FALSE");
//            System.out.println("It is not an alien!");
//        }
//
//        int topScore = 50;
//        int secondTopScore = 60;
//        if (topScore >= 100) {
//            System.out.println("You got the high score!");
//        } else if (topScore < 100) {
//            System.out.println("You didn't get the high score...");
//        }
//
//        boolean test = true;
//        if ((test == true) || (topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Boo you, boo.");
//        }
//
//        int newValue = 50;
//        if (newValue == 50) {
//            System.out.println("This is true.");
//        }
//
//        boolean isCar = false;
//        if (!isCar) {
//            System.out.println("This is now supposed to happen.");
//        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }

        // Challenge
        double firstValue = 20.00;
        double secondValue = 80.00;
        double total = (firstValue + secondValue) * 100.00;
        double remainder = total % 20.00;
        boolean result = remainder == 0.00 ? true : false;
        if (!result) {
            System.out.println("Got some remainder.");
            System.out.println(remainder);
        } else {
            System.out.println("There is no remainder.");
        }

    }
}
