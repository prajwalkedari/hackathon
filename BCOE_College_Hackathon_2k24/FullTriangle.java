public class FullTriangle {
    public static void main(String[] args) {
        int row = 8;
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
        row--;
        for (int i = 2 * row; i >= 1; i--) {

            if (i % 2 == 1) {
                for (int j = (2 * (row + 1) - i); j >= 0; j--) {
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
