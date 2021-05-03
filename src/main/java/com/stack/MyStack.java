package com.stack;

import com.linkedList.INode;
import com.linkedList.MyLinkedList;

public class MyStack {
    private final MyLinkedList myLinkedList;
    //UC1 Add stack element using push() method
    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
    //peek() method
    public INode peek() {
        return myLinkedList.head;
    }
    //UC2 pop() element
    public INode pop() {
        return myLinkedList.pop();
    }
    //printStack() method
    public void printStack() {
        myLinkedList.printMyNodes();
    }
}
