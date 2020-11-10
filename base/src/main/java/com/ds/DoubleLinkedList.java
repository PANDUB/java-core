package com.ds;

public class DoubleLinkedList {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addFront(4);
        doubleLinkedList.addFront(5);
        doubleLinkedList.addFront(6);
        doubleLinkedList.addEnd(7);

        System.out.println(doubleLinkedList.size);
    }

    public DoubleNode  front ;
    public DoubleNode last;
    public int size;

   public  DoubleLinkedList() {
        this.front=null;
        this.last=null;

    }

    public void addFront(int data){
        if(front == null){
            front = new DoubleNode(data);
        }
        else {
            DoubleNode temp =front;
            front = new DoubleNode(data,null,temp);
            front.next.prev=front;

        }
        size++;

    }
    public void addEnd(int data){
        if(front == null){
            front = new DoubleNode(data);
        }
        else {
            DoubleNode temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new DoubleNode(data, temp, null);

        }
size++;
        }


}
