package com.queue;

import com.linkedList.INode;
import com.linkedList.MyLinkedList;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    //UC1 Added element in FIFO form.
    public void Enqueue(INode myNode) {
        myLinkedList.add(myNode);
    }

    //After adding 1st element append() rest of the element is updated.
    public void append(INode myNode) {
        myLinkedList.append(myNode);
    }

    //pop() method to delete 1st element
    public INode Dequeue() {
        return myLinkedList.pop();
    }

    //print the Queue
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}