package com.base.functionalinterfaces;

public class FibonacciNumber {

    public static void main(String[] args) {
         int n =9;
         int first =1;
         int second =1;
         int result =0;
         for(int i=1 ; i< 8; i++){
             System.out.println(first);
             result = first+second;
             first =second;
             second =result;

         }
        System.out.println(result);

    }
}
