package com.queue;

import com.linkedList.INode;
import com.linkedList.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    //UC1 Ability to create Queue of 56->30->70
    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.Enqueue(myFirstNode);
        myQueue.append(mySecondNode);
        myQueue.append(myThirdNode);
        myQueue.printQueue();
    }
    //UC2 Ability to Dequeue first element = 56
    @Test
    public void given3NumbersInQueueWhenDequeuedShouldMatchWithLastAddedNode(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.Enqueue(myFirstNode);
        myQueue.append(mySecondNode);
        myQueue.append(myThirdNode);
        myQueue.printQueue();
        INode dequeue = myQueue.Dequeue();
        myQueue.printQueue();
        Assertions.assertEquals(myFirstNode,dequeue);
    }
}
