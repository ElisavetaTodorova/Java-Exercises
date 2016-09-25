package P03_DependencyInversion.interfaces;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public interface PrimitiveCalculator {
    void setStrategy(String operation);
   int calculate(int firstOperand,int secondOperand);

}
