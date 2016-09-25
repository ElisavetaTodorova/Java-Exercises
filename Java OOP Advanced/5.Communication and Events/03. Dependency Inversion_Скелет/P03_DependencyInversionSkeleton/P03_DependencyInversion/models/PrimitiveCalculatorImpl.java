package P03_DependencyInversion.models;


import P03_DependencyInversion.interfaces.PrimitiveCalculator;
import P03_DependencyInversion.interfaces.Strategy;

public class PrimitiveCalculatorImpl implements PrimitiveCalculator{

    private Strategy strategy;

    public PrimitiveCalculatorImpl() {
        this.strategy=new AdditionStrategy();
    }

    public void setStrategy(String operation) {
        switch (operation) {
            case "-":
                this.strategy=new SubtractionStrategy();
                break;
            case "+":
                this.strategy=new AdditionStrategy();
                break;
            case "*":
                this.strategy=new MultiplyStrategy();
                break;
            case "/":
                this.strategy=new DavideStrategy();
                break;

        }
    }

    public int calculate(int firstOperand,int secondOperand){
        return this.strategy.Calculate(firstOperand,secondOperand);
    }
}
