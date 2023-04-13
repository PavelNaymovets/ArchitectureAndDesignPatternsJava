package com.naumovets.patterns.Iterator;

public interface Iterator<T> {
    T next();
    void first();
    void last();
    boolean hasNext();
}
