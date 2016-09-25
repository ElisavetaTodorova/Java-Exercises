package exesices.StaticMethods.p07MultiMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String input=reader.readLine();
        while (!input.equals("End")){
            String [] params=input.split("\\s+");
            String operation=params[0];
            double firstNumber= Double.parseDouble(params[1]);
            double secondNumber= Double.parseDouble(params[2]);
            double result=0.0;

            switch (operation){
                case "Sum":result=MultiMath.sum(firstNumber,secondNumber);
                    break;
                case "Multiply":result=MultiMath.multiply(firstNumber,secondNumber);
                    break;
                case "Percentage":result=MultiMath.precentage(firstNumber,secondNumber);
                    break;
                case "Divide":result=MultiMath.devide(firstNumber,secondNumber);
                    break;
                case "Subtract":result=MultiMath.subtract(firstNumber,secondNumber);
                    break;
            }

            System.out.printf("%.2f%n",result);
            input=reader.readLine();

        }




    }

}
