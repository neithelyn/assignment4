import java.util.Scanner;

public class task_g {
    public static void factt(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            count = count*i;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        factt(n);

    }
}
