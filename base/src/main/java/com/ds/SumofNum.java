package com.ds;

public class SumofNum {


    public static void main(String[] args) {

        System.out.println(sum(20));

    }
    public static int sum(int n)
    {
        if(n > 0)
        {
            return n+ sum(n-1);
        }
        else
            return 0;

    }
}
