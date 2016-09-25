package exercises.methods.p05FibonacciNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class FibonaciiNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Fibonacii fibonacii=new Fibonacii();
        int from=Integer.valueOf(reader.readLine());
        int to=Integer.valueOf(reader.readLine());
        ArrayList<Long> result=fibonacii.getNumbersInRange(from,to);
        for (int i = 0; i <result.size() ; i++) {
            if(i==result.size()-1){
                System.out.print(result.get(i));
            }else {
                System.out.print(result.get(i)+", ");
            }
        }
    }

}
