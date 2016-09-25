import java.util.Arrays;
import java.util.Scanner;

public class RecursiveFibonacii {
    static   long[]dictionary;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        dictionary=new long[n+1];
        System.out.println(fibonaci(n));


    }
    static long fibonaci(int n){
        if(n<2){
            return 1;
        }
        else {
            long f=dictionary[n];
            if(f==0){
                f=fibonaci(n-1)+fibonaci(n-2);
                dictionary[n]=f;
            }

                return f;

        }
    }
}
