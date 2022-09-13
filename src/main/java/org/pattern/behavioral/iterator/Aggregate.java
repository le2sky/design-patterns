package org.pattern.behavioral.iterator;

public interface Aggregate {
    public abstract Iterator iterator(int type);
    public int getLength();
}
