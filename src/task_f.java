import java.util.Scanner;

public class task_f {
    public static boolean nprimee(int n){
        if(n <=1 ){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        for(int i = 10; i <= 30; i++){
            if(nprimee(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
