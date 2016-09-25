package exercises.methods.p10DateModifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class P10DateModifier {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String firstDate=reader.readLine();
        String secondDate=reader.readLine();
        DateModifier dateModifier=new DateModifier(firstDate,secondDate);
        System.out.println(dateModifier.getDayDifference());




    }


}
