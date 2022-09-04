package org.pattern.structural.bridge;

import org.pattern.common.Testable;
import org.pattern.structural.bridge.impl.ArrayImpl;
import org.pattern.structural.bridge.impl.LinkedListImpl;
import org.pattern.structural.bridge.list.Queue;
import org.pattern.structural.bridge.list.Stack;

public class BridgeTest implements Testable {
    @Override
    public void run() {
        Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());
        linkedListStack.push("aaa");
        linkedListStack.push("bbb");
        linkedListStack.push("ccc");

        System.out.println(linkedListStack);

        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());

        System.out.println("===================================================");

        Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());
        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");

        System.out.println(arrayStack);


        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());


        System.out.println("===================================================");
        Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());

        arrayQueue.enqueue("aaa");
        arrayQueue.enqueue("bbb");
        arrayQueue.enqueue("ccc");

        System.out.println(arrayQueue);

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());

        System.out.println("===================================================");
        Queue<String> linkedListQueue = new Queue<String>(new LinkedListImpl<String>());

        linkedListQueue.enqueue("aaa");
        linkedListQueue.enqueue("bbb");
        linkedListQueue.enqueue("ccc");

        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());


    }
}
