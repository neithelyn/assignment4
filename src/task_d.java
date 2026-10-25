

import java.util.Scanner;

public class task_d {
    public static void printMatriX(int n, int m) {
        int cut = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(cut + " ");
                cut++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        printMatriX(n, m);

    }
}
