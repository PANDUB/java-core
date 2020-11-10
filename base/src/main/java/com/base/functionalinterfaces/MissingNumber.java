package com.base.functionalinterfaces;

public class MissingNumber {

    public static void main(String[] args) {

        int[] number = {0,1,2,3,4,5,6,7,8,9,10};
        int sum = ((number.length-1)*(number.length))/2;
        int actual=0;

        for(int i =0 ; i< number.length; i++){

           actual += number[i];

        }

        System.out.println( sum-actual);

    }
}
