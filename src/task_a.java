import java.util.Scanner;

public class task_a {
    public static int printStrip(int n,char s){
        for(int i = 1; i <=n; i++){
            System.out.print(s);
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
       printStrip(n, '#');


    }
}
