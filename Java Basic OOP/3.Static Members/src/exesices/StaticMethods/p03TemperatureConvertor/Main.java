package exesices.StaticMethods.p03TemperatureConvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public  class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        while (!line.equals("End")){
            String []params=line.split("\\s+");
            Double temperature=Double.parseDouble(params[0]);
            String type=params[1];
            switch (type){
                case "Celsius":TemperatureConvertor.fromCelsius(temperature);
                    break;
                case "Fahrenheit":TemperatureConvertor.fromFahrenheit(temperature);
                    break;
            }

            line=reader.readLine();
        }
    }

}
