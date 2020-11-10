package com.ds.trees;

class Node{

    int data;
    Node left;
    Node right;


}

public class BST {

    public Node createNode(int data)
    {

        Node node = new Node();
        node.data= data;
        node.left =null;
        node.right=null;
        return node;
    }

    public Node insertNode(Node node, int a)
    {

        if(node== null){
           return  createNode(a);
        }

        if(a < node.data)
        {
           node.left = insertNode(node.left, a) ;
        }
        else if(a > node.data)
        {
            node.right=insertNode(node.right,a);
        }


        return node;
    }

    public static void main(String[] args) {
         BST b = new BST();
         Node n = null;
        n = b.insertNode(n,8);
        n= b.insertNode(n,3);
        n= b.insertNode(n,13);



    }


}

