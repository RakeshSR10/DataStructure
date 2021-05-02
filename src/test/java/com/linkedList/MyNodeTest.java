package com.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    //UC1 Simple LinkedList of 56,30,70
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest(){
        MyNode<Integer> myFiratNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFiratNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFiratNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
