package P03_DependencyInversion.models;

import P03_DependencyInversion.interfaces.Strategy;

public class SubtractionStrategy implements Strategy {
    public int Calculate(int firstOperand, int secondOperand){
        return firstOperand - secondOperand;
    }
}
