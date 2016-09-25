package p01.genericClass;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class GenericBox <T> {

    private T parameter;

    public GenericBox(T parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return this.parameter.getClass().getName()+": "+this.parameter;
    }
}
