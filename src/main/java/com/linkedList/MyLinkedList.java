package com.linkedList;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    //UC2 Actual LinkedList
    public void add(INode newNode){
        if(this.tail == null){
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //UC3 append() method
    public void append(INode myNode) {
        if(this.head == null){
            this.head = myNode;
        }
        if(this.tail == null){
            this.tail = myNode;
        }else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    //UC4 insert() method
    public void insert(INode myNode, INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    //pop
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    //UC5 delete() or pop() method
    public INode pop(MyNode<Integer> myFirstNode){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //UC6 delete last element
    public INode popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    //UC7 search node in linkedList
    public INode search(INode key){
        INode tempNode = head;
        INode searchNode = null;
        while (tempNode != null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(key)){
                searchNode = tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return searchNode;
    }

    //print all the nodes
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
