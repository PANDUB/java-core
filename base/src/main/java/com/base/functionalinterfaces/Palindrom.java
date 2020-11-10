package com.base.functionalinterfaces;

public class Palindrom {


    public static void main(String[] args) {

        int i = 1212;
        System.out.println(palindrum(i));
    }

    public static boolean palindrum(int i) {
        int sum = 0;
        int j =i;

        while (j > 0) {
            int rem = j % 10;
            sum = (sum * 10) + rem;
            j = j / 10;
        }

    return   i == sum;
    }
}
