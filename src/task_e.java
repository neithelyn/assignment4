import java.util.Scanner;

public class task_e {
    public static boolean nprime(int n){
        if (n<=1){
            return false;
        }
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                return false;

            }
        }
        return true;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (nprime(n)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
