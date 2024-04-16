public class triangle {
  public static void main(String[] args) {

    int row = 9;
    for (int i = 1; i <= 2 * row; i++) {

      if (i % 2 == 1) {
        for (int j = (2 * row - i); j >= 0; j--) {
          System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }

  }
}