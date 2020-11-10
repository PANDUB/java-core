package com.recurrsion;

/*
Triangle problem  is sum of last and next digit
ex : 1 =1
     1+2 =3
     1+2+3 =6
     1+2+3+4=10

 */
public class Triangle {


    public static void main(String[] args) {
        System.out.println(triangle(10));

    }

    public static int triangle(int n){
        System.out.println("Entering: n=" + n);

        if( n <=1){
            System.out.println("Returning 1");
            return 1;
        }
        int temp = n + triangle(n-1);
        System.out.println("Returning " + temp);
        return temp;
    }


}
