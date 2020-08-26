package com.ds;

public class CircularLinkedList {


    private Node head =null;
    private Node tail =null;

    private void addNode(int value)

    {

        Node node = new Node(value);

        if(head == null){
            head =node ;
        }
        else {
            tail.next(node);
        }
        tail = node;
        tail.next(head);
    }



    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.addNode(3);
        cl.addNode(4);
        cl.addNode(5);



    }
    private  int searchVal(int val)
    {



        return 1;
    }


}
