package com.xue.study.linkedlist.model;

public class Node {
    public Object data;
    public Node next;

    public Node(){

    }

    public Node(Object data){}

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }
}
