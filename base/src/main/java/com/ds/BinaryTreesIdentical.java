package com.ds;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.locks.Lock;

public class BinaryTreesIdentical {

    static class   Node{
        int key;
        Node left=null;
        Node right= null;
        Node(int key){

            this.key = key;
        }
    }

    static class Pair<U,V> {

        public U first;
        public V second;

        Pair(U first, V second){
            this.first =first;
           this. second = second;
        }
    }

    public static boolean isIdentical(Node x, Node y)
    {

        if( x == null && y == null ){

            return false;
        }

        Deque<Pair<Node,Node>>  stack = new ArrayDeque<>();
        stack.add(new Pair(x,y));

        while(!stack.isEmpty()){
            x = stack.peekLast().first;
            y =stack.peekLast().second;

            stack.pollLast();


            if(x.key != y.key)
            {
                return false ;
            }

            if(x.left != null && y.left != null){
                stack.add( new Pair<>(x.left, y.left));
            }
            else if (x.left != null || y.left != null){
                return false ;
            }


            if(x.right != null && y.right!= null){

                stack.add( new Pair<>(x.right,y.right));
            }
            else if (x.right != null || y.right != null){
                return false ;
            }







        }
        return true;

    }


    public static void main(String[] args) {

        Node x = new Node(15);
        x.left =new Node(10);
        x.right =new Node(20);
        x.left.left = new Node(8);
        x.left.right= new Node(12);
        x.right.left= new Node(18);
        x.right.right= new Node(25);

        Node y = new Node(15);
        y.left =new Node(10);
        y.right =new Node(20);
        y.left.left = new Node(8);
        y.left.right= new Node(12);
        y.right.left= new Node(18);
        y.right.right= new Node(25);

        System.out.println(isIdentical(x,y));


    }

}
