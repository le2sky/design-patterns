package org.pattern.structural.bridge.list;

import org.pattern.structural.bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("스택을 구현합니다.");
    }

    public void push(T obj) {
        impl.insertElement(obj, 0);
    }


    public T pop() {
        return impl.deleteElement(0);
    }

}
