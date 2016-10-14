package system.split;

import system.split.models.InformationProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 9.10.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        InformationProcessor informationProcessor = new InformationProcessor();

        while (true) {
            String input = reader.readLine();
            String result;
            if(input.equals("System Split")) {
                result = informationProcessor.proceedInformation(input);
                System.out.println(result);
                break;
            }
            result = informationProcessor.proceedInformation(input);
            if(result != null) {
                System.out.println(result);
            }

        }
    }
}
