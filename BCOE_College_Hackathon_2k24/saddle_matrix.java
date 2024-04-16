public class saddle_matrix {
    static int min_mat(int[] a) {
        int i;
        if (a[0] > a[1]) {
            if (a[1] > a[2]) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            if (a[0] > a[2]) {
                i = 2;
            } else {
                i = 0;
            }

        }
        return i;
    }

    static int max_mat(int[][] a, int c) {
        int i;
        if (a[0][c] < a[1][c]) {
            if (a[1][c] < a[2][c]) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            if (a[0][c] < a[2][c]) {
                i = 2;
            } else {
                i = 0;
            }

        }
        return i;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 15, 19, 10 } };
        for (int i = 0; i <= 2; i++) {
            int a = min_mat(matrix[i]);
            System.out.println(i);
            if (max_mat(matrix, a) == i) {
                System.out.println(matrix[i][a]);
                break;
            }
        }

    }

}
