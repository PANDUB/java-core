package com.ds;

public class myRecursion {

    public static void main(String[] args) {

        System.out.println( count(4));

    }

    public  static int count(int n)
    {
        if(n >=1 )
        {
            return n * count(n-1);
        }

     else
       return  1;


    }


}
