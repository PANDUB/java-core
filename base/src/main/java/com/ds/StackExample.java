package com.ds;

public class StackExample {

    int[] dataStack ;

    public static void main(String[] args) {

       StackExample  stackExample =new StackExample();
       stackExample.push(2);
        stackExample.push(3);
        stackExample.push(4);
        stackExample.push(5);
        stackExample.dispaly();


    }

    public  void dispaly()
    {
        int i =0;
        while(dataStack!= null)
        {
            System.out.println(dataStack[i]);
            i++;
        }
    }

    public void push(int data)
    {
           if(size() ==0)
           {
               dataStack =new int[0];

               dataStack[size()] =data;
           }
           else {
               dataStack =new int[size()];
               dataStack[size()] =data;
           }






    }
    public int size()
    {
        int size =0;
        while(dataStack != null && dataStack[size] !=0)
        {
            size++;
        }
        return  size;

    }
}
