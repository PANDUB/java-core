package com.ds;

public class LinkedList {

    public static void main(String[] args) {

        Node nodeA = new Node(3);
        Node nodeB = new Node(4);
        Node nodeC = new Node(5);
        Node nodeD = new Node(6);

        nodeA.next(nodeB);
        nodeB.next(nodeC);
        nodeC.next(nodeD);


        System.out.println(length(nodeA));

    }

    private static int length(Node node){
        int i =0;
        while(node.get(node) != null) {
            node = node.get(node);
            i++;

        }
        return i ;
    }
}
