package com.stack;

import com.linkedList.INode;
import com.linkedList.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    //UC 1 Create stack and push element to the stack, check peek
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode(){
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peek =  myStack.peek();
        Assertions.assertEquals(myThirdNode,peek);
    }
    //UC 2 pop() element from Stack
    @Test
    public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode(){
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode,pop);
    }
}
