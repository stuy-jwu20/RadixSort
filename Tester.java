public class Tester {
  public static void main(String[] args) {
    System.out.println("Negative Number Testing \n -------------------");
    int negNumber = -1;
    String negNumberL = "" + negNumber;
    for (int i = 0; i < 10; i++) {
      if (Radix.length(negNumber) != negNumberL.length()-1) {
        System.out.println("Number: " + negNumber);
        System.out.println("Expected length: " + (negNumberL.length()-1));
        System.out.println("What we got: " + Radix.length(negNumber));
      }
      negNumber *= 10;
      negNumberL = "" + negNumber;
    }

    System.out.println("Positive Number Testing \n -------------------");
    int posNumber = 1;
    String posNumberL = "" + posNumber;
    for (int i = 0; i < 10; i++) {
      if (Radix.length(posNumber) != posNumberL.length()) {
        System.out.println("Number: " + posNumber);
        System.out.println("Expected length: " + posNumberL.length());
        System.out.println("What we got: " + Radix.length(posNumber));
      }
      posNumber *= 10;
      posNumberL = "" + posNumber;
    }
  }
}
