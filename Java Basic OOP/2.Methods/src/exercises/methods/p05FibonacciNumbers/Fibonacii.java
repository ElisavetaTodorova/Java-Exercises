package exercises.methods.p05FibonacciNumbers;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Fibonacii {

    LinkedList<Long> fibonaciiNumbers;

    public Fibonacii() {
        this.fibonaciiNumbers = new LinkedList<>();
    }

    public ArrayList<Long> getNumbersInRange(int startPosition, int endPosition) {
        ArrayList<Long> result = new ArrayList<>();
        this.fibonaciiNumbers.add(0l);
        this.fibonaciiNumbers.add(1l);
        for (int i = 0; i <endPosition-2 ; i++) {
            this.fibonaciiNumbers.add(this.fibonaciiNumbers.get(i)+
                                        this.fibonaciiNumbers.get(i+1));

        }
        for (int i = startPosition; i <endPosition ; i++) {
            result.add(this.fibonaciiNumbers.get(i));
        }

        return result;
    }
}
