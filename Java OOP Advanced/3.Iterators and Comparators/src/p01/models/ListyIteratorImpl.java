package p01.models;


import p01.interfaces.ListyIterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class ListyIteratorImpl<E> implements ListyIterator<E>, Iterable<E> {

    private List<E> elements;
    private int currentIndex;
    private Iterator<E> currentIterator;

    public ListyIteratorImpl(List<E> elements) {
        this.setElements(elements);
        this.setCurrentIndex(0);
    }

    public List<E> getElements() {
        return elements;
    }

    private void setElements(List<E> elements) {
        this.elements = elements;
    }

    private int getCurrentIndex() {
        return currentIndex;
    }

    private void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    @Override
    public boolean move() {
        if (this.hasNext()) {
            this.setCurrentIndex(this.getCurrentIndex() + 1);
            return true;
        }
        return false;
    }

    @Override
    public E print() {
        if (this.getCurrentIndex() < this.elements.size()) {
            return this.elements.get(this.getCurrentIndex());
        }
        throw new IllegalArgumentException("Invalid Operation!");
    }

    @Override
    public boolean hasNext() {
        return this.getCurrentIndex() < this.elements.size() - 1;
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public String printAll() {
        StringBuilder sb=new StringBuilder();
        for (E element : elements) {
            sb.append(element).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        this.currentIterator = new MyIterator<>();
        action.accept(this.currentIterator.next());
    }

    private class MyIterator<E> implements Iterator<E> {

        private int index;

        private MyIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < elements.size();
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                return (E) elements.get(index++);
            }
            throw new NoSuchElementException();
        }
    }
}
