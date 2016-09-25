package exercises.methods.p03LastDigitName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class LastDigitName {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.valueOf(reader.readLine());
        Number number=new Number(num);
        System.out.println(number.getLastDigitAsWord());


    }

}
