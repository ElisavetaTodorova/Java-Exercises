package exesices.StaticMethods.p07MultiMath;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public  abstract class MultiMath {
    public static double sum(double num1,double num2){
        return num1+num2;
    }

    public static double subtract(double num1,double num2){
        return num1-num2;
    }

    public static double multiply(double num1,double num2){
        return num1*num2;
    }

    public static double devide(double num1,double num2){
        return num1/num2;
    }
    public static double precentage(double num,double precent){
        return num*(precent/100.0);
    }


}
