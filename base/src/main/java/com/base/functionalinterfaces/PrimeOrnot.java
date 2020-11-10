package com.base.functionalinterfaces;

public class PrimeOrnot {

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2,4,15};
        prime(a1);

    }
        public static void prime(int[] a1)
        {
            for(int i : a1) {
                isprime(i);
            }
        }

        public static boolean isprime(int i)
        {

            if( i <2) {
                 System.out.println("not prime");
                 return false;
             }
                if( i ==2) {System.out.println(" prime second loop");
                    return true;}
                if(i %2 == 0){

                    System.out.println("not prime 3rd");
                    return false ;
                }

                int sqrt = (int)Math.sqrt(i);
                for(int j=3; j<= sqrt ; j=+2) {
                    if (i % j == 0) {

                        System.out.println("not prime also");
                        return false;
                    } else {
                        return true;
                    }
                }
                return true;


        }






}
