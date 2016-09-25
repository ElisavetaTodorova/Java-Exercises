package p07.genericCustomList;

import java.lang.reflect.Array;


public class CustomListImpl<T extends Comparable<T>> implements CustomList {

    private int index = 0;
    private static final int DEFAULT_CAPACITY = 16;
    private T[] list;
    private Class<T> classType;

    @SuppressWarnings("unchecked")
    public CustomListImpl(Class<T> classType) {
        this.classType = classType;
        list = (T[]) Array.newInstance(classType,DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) Array.newInstance(this.classType, this.list.length * 2);
        for (int i = 0; i < this.list.length; i++) {
            newArray[i] = this.list[i];
        }
        this.list = newArray;

    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(Comparable element) {

        if (this.index == this.list.length) {
            resize();
        }
        this.list[this.index++] = (T) element;

    }


    @Override
    public Comparable remove(int index) {
        return this.list[--this.index];
    }

    @Override
    public boolean contains(Comparable element) {

        for (T t : list) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {

        T temp = list[firstIndex];
        list[firstIndex] = list[secondIndex];
        list[secondIndex] = temp;

    }

    @Override
    public int countGreaterThat(Comparable element) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (this.list[i].compareTo((T) element) > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Comparable getMax() {
        T max = list[0];
        for (int i = 1; i <index; i++) {

            if (max.compareTo(this.list[i]) < 0) {
                max = this.list[i];
            }
        }

        return max;
    }

    @Override
    public Comparable getMin() {
        T min = list[0];
        for (int i = 1; i <index ; i++) {

            if (min.compareTo(this.list[i]) > 0) {
                min = this.list[i];
            }
        }
        return min;
    }
    @Override
    public int length(){
        return this.index;
    }

    @Override
    public Comparable get(int index) {
        return this.list[index];
    }
}
