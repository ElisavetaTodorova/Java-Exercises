package p04.models;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;


public class Lake implements Iterable<String> {

    private String[] lakeElements;
    private Iterator<String> currentIterator;

    public Lake(String[] lakeElements) {
        this.setLakeElements(lakeElements);
    }

    private void setLakeElements(String[] lakeElements) {
        this.lakeElements = lakeElements;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        this.currentIterator = new Frog();
        action.accept(currentIterator.next());
    }

    @Override
    public Iterator<String> iterator() {
        return new Frog();
    }


    private class Frog implements Iterator<String> {

        private int index = 0;
        private int evenIndexes;
        private int oddIndexes;
        private int evenIndex = 0;
        private int oddIndex = 1;

        public Frog() {
            this.setEvenIndexes();
            this.setOddIndexes();

        }

        private void setEvenIndexes() {
            if (lakeElements.length % 2 != 0) {
                this.evenIndexes = lakeElements.length / 2 + 1;
            } else {
                this.evenIndexes = lakeElements.length / 2;
            }

        }

        private void setOddIndexes() {
            this.oddIndexes = lakeElements.length / 2;
        }

        @Override
        public boolean hasNext() {
            return this.index < lakeElements.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                if (evenIndexes > 0) {
                    int currentIndex = this.evenIndex;
                    this.evenIndex += 2;
                    this.index++;
                    evenIndexes--;
                    return lakeElements[currentIndex];
                } else if (oddIndexes > 0) {
                    int currentIndex = this.oddIndex;
                    this.oddIndex += 2;
                    this.index++;
                    oddIndexes--;
                    return lakeElements[currentIndex];
                }
            }
            throw new NoSuchElementException();
        }
    }
}
