package com.naumovets.patterns.Iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        T element = list.get(index);
        index++;

        return element;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
