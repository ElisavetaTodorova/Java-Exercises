package P03_DependencyInversion.models;

import P03_DependencyInversion.interfaces.Strategy;


public class MultiplyStrategy implements Strategy {


    @Override
    public int Calculate(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
