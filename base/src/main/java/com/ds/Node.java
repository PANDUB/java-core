package com.ds;

public class Node {

    private int data;
    private Node next=null;

    public Node(int data){
        this.data=data;
    }

    public void next(Node node){

        this.next =node;
    }
    public Node get(Node node){

        return node.next;
    }

}
