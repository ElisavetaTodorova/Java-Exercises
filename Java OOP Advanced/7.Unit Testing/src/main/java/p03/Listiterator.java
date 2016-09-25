package p03;

import javax.naming.OperationNotSupportedException;
import java.util.LinkedList;
import java.util.List;


public class Listiterator {

    private List<String> list;
    private int currentIndex;

    public Listiterator(String... strings) throws OperationNotSupportedException {
        this.list = new LinkedList<String>();
        this.currentIndex = 0;
        this.setList(strings);
    }

    private void setList(String... strings) throws OperationNotSupportedException {
        if (strings.length != 0) {
            for (String string : strings) {
                if (string == null) {
                    throw new OperationNotSupportedException("Strings can not be null!");
                }
                this.list.add(string);
            }
        }

    }

    public boolean hasNext() {
        if (this.list.size() == 1) {
            if (this.currentIndex <= this.list.size() - 1) {
                return true;
            }
        } else {
            if (this.currentIndex < this.list.size() - 1) {
                return true;
            }
        }

        return false;
    }

    public boolean move() {
        if (this.hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public String print() throws OperationNotSupportedException {
        if (this.list.size() == 0) {
            throw new OperationNotSupportedException("Invalid operation!");
        }
        return this.list.get(this.currentIndex);
    }

}
