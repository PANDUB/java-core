package com.ds;

public class Stack {

    private  int top =-1;
    private  int max =100;
    private int[] stack = new int[max];


    public static void main(String[] args) {

        Stack stack =new Stack();
        stack.push(10);
        stack.push(12);
        stack.display();


    }
    public void display()
    {

        for( int i= 0 ; i<=top; i++)
        System.out.println(stack[i]);
    }

    public void  push(int data)
    {

        if(top >max-1){
            System.out.println("stack overflow");

            return ;
    }

        stack[++top] =data;


    }
}


