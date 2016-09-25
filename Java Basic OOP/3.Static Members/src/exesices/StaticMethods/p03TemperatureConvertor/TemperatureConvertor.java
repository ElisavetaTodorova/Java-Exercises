package exesices.StaticMethods.p03TemperatureConvertor;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public abstract class TemperatureConvertor {
    public static void fromCelsius(double temperature){
        double result=temperature*1.8 +32;
        System.out.printf("%.2f Fahrenheit%n",result);
    }
    public static void fromFahrenheit(double temperature){
        double result=(temperature-32)/1.8;
        System.out.printf("%.2f Celsius%n",result);
    }

}
