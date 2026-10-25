import java.util.Scanner;

public class task_c {
    public static void printStrip(int n){
         for(int i = 0; i<n; i++){
             int re = 2*(n-i)-1;

             for(int j = 0; j<re; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

        
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        printStrip(n);


    }
}
