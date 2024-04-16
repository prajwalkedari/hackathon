import java.util.Scanner;

public class RevArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 7;
        int arry[] = new int[8];
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // for (int i = 0; i <=l; i++) {
        // a[i]=sc.nextInt();
        // }

        for (int i = 0; i < a.length; i++) {
            arry[i] = a[l - i];
        }

        // System.out.println(b[0]);
        for (int i = 0; i <= l; i++) {
            System.out.println(arry[i]);
        }
    }
}