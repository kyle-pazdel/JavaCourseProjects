public class Main {
    public static void main(String[] args) {
          int value = 3;
          if (value == 1) {
              System.out.println("Value was 1");
          } else if (value == 2) {
            System.out.println("Value was 2");
          } else {
            System.out.println("Was not 1 or 2");
          }
          int switchValue = 5;
          switch (switchValue) {
              case 1:
                  System.out.println("Switch value was 1");
                  break;
              case 2:
                  System.out.println("Switch value was 2");
                  break;
              case 3: case 4: case 5:
                  System.out.println("Actually it was a " + switchValue);
                  break;
              default:
                  System.out.println("Was not 1, 2, 3, 4 or 5");
                  break;
          }
    }
}