package p10.tuple;

/**
 * Created by ELISAV on 9.9.2016 г..
 */
public class Tuple<T, E, V> {

    private T firstObject;
    private E secondObject;
    private V thirdObject;

    public Tuple(T firstObject, E secondObject,V thirdObject) {
        this.setFirstObject(firstObject);
        this.setSecondObject(secondObject);
        this.setThirdObject(thirdObject);
    }

    private void setFirstObject(T firstObject) {
        this.firstObject = firstObject;
    }

    private void setSecondObject(E secondObject) {
        this.secondObject = secondObject;
    }

    private void setThirdObject(V thirdObject) {
        this.thirdObject = thirdObject;
    }

    @Override
    public String toString() {
        return this.firstObject + " -> " + this.secondObject + " -> " +this.thirdObject;
    }
}
