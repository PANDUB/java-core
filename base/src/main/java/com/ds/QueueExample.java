package com.ds;

public class QueueExample {
    int max =5;

    int rear =0;
    int[] queue = new int[max];

    public static void main(String[] args) {

        QueueExample queueExample =new QueueExample() ;
        queueExample.queuePush(3);
        queueExample.queuePush(4);
        queueExample.queuePush(5);
        queueExample.queuePush(6);
        queueExample.queuePush(7);
        queueExample.queuePush(8);
        queueExample.display();

    }
    public  void display()
    {
        for( int i =0 ; i< rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public void queuePush(int data)
    {
        if(rear > max-1){
            System.out.println("queue full");
            return;
        }
        if( rear == 0) {
             queue[rear] = data;
            rear++;
        }
        else {

            queue[rear++] = data;
        }



    }
    public void queuePop(int data)
    {
        if(rear > max-1){
            System.out.println("queue full");
            return;
        }
        if( rear == 0) {
            queue[rear] = data;
            rear++;
        }
        else {

             queue[rear]  =queue[rear+1];

        }



    }
}
