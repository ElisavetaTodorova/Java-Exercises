package exesices.StaticMethods.p06PlanckConstant;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public abstract class Calculation {
    public static final double PLANCK_CONSTANT=6.62606896e-34;
    public static final double PI=14159;

    public static double reducePlanckConstant(){
        return PLANCK_CONSTANT/(2*PI);
    }

}
