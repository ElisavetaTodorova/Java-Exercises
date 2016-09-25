package p03.models;

import p03.interfaces.Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;


public class StackImpl implements Stack, Iterable<Integer> {

    private List<Integer> elements;
    private Iterator<Integer> iterator;

    public StackImpl() {
        this.setElements();
    }

    private void setElements() {
        this.elements = new LinkedList<>();

    }

    public Iterator<Integer> getIterator() {
        return iterator;
    }


    @Override
    public void push(Integer element) {
        this.elements.add(element);
    }

    @Override
    public Integer pop() {
        this.iterator=new MyIterator();
        if (iterator.hasNext()) {
            return this.elements.remove(this.elements.size()-1);
        }
        throw new NoSuchElementException("No elements");
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterator<Integer> iterator = new MyIterator();
        action.accept(iterator.next());
    }

    private class MyIterator implements Iterator<Integer> {

        private int index;

        public MyIterator() {
            this.index = elements.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return elements.get(index--);
            }
            throw new NoSuchElementException("No elements");
        }
    }
}

