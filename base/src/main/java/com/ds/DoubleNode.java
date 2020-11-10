package com.ds;

public class DoubleNode {

    private int data;
    public DoubleNode next;
    public DoubleNode prev;

    public DoubleNode(int data)
    {
        this.data =data;
        this.next=null;
        this.prev =null;
    }
    public DoubleNode(int data,DoubleNode prev,DoubleNode next)
    {
        this.data =data;
        this.next=next;
        this.prev =prev;
    }
}
