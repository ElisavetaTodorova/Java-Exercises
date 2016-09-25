package P03_DependencyInversion;


import P03_DependencyInversion.interfaces.PrimitiveCalculator;
import P03_DependencyInversion.models.PrimitiveCalculatorImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        PrimitiveCalculator calculator=new PrimitiveCalculatorImpl();
        String line;
        while (!(line=reader.readLine()).equals("End")){
            String[] params=line.split("\\s+");
            if(params[0].equals("mode")){
                calculator.setStrategy(params[1]);
            }else {
                int firstOperand=Integer.parseInt(params[0]);
                int secondOperand=Integer.parseInt(params[1]);
                System.out.println(calculator.calculate(firstOperand,secondOperand));

            }
        }

    }

}
