package exercises.methods.p04NumberInReversedOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class NumberInReversedOrder {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String number=reader.readLine();
        DecimalNumber num=new DecimalNumber(number);
        num.printDigitsInReversedOrder();

    }

}
