package p07.genericCustomList;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public interface CustomList<T extends Comparable<T>> {

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThat(T element);

    T getMax();

    T getMin();

    public int length();

    T get(int index);


}
