package p01;

import javax.naming.OperationNotSupportedException;


public class Database {

    private Integer[] array;
    private int currentCapacity;

    public Database(Integer... values) throws OperationNotSupportedException {
        this.array = new Integer[16];
        this.currentCapacity = 0;
        this.addInitialElements(values);

    }

    public void addElement(Integer... values) throws OperationNotSupportedException {
        if (values.length == 0) {
            throw new OperationNotSupportedException("Can not add element with null value!");
        }
        if (values.length + this.currentCapacity > 16) {
            throw new OperationNotSupportedException("Invalid size");
        }
        int index = this.currentCapacity;
        int j = 0;
        for (int i = currentCapacity; i < index + values.length; i++) {
            if (values[j] == null) {
                throw new OperationNotSupportedException("Can not add element with null value!");
            }
            this.array[i] = values[j++];
            this.currentCapacity++;
        }
    }

    public Integer remove() throws OperationNotSupportedException {
        if (this.currentCapacity == 0) {
            throw new OperationNotSupportedException("Empty database!");
        }

        Integer valueToRemove = this.array[--this.currentCapacity];

        this.array[this.currentCapacity] = null;
        this.currentCapacity--;

        return valueToRemove;
    }

    public Integer[] fetch() {
        Integer[] newArray = new Integer[this.currentCapacity];
        for (int i = 0; i < this.currentCapacity; i++) {
            newArray[i] = this.array[i];
        }

        return newArray;

    }

    public int getCapacity() {
        return this.array.length;
    }

    public void addInitialElements(Integer... values) throws OperationNotSupportedException {
        if (values.length + this.currentCapacity > 16) {
            throw new OperationNotSupportedException("Invalid size");
        }
        int index = this.currentCapacity;
        for (int i = currentCapacity; i < index + values.length; i++) {
            if (values[i] == null) {
                throw new OperationNotSupportedException("Can not add element with null value!");
            }
            this.array[i] = values[i];
            this.currentCapacity++;
        }
    }
}
