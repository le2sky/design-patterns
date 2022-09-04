package org.pattern.structural.bridge.list;

import org.pattern.structural.bridge.impl.AbstractList;

public class Queue<T> extends List<T> {
    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("큐를 구현합니다.");
    }
    public void enqueue(T obj) {
        impl.addElement(obj);
    }

    public T dequeue() {
        return impl.deleteElement(0);
    }
}
