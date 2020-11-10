package com.base.functionalinterfaces;

public class TwoSortedArrays {




    public static void main(String[] args) {
        int[] a1 = new int[]{21,34,41,22,35};
        int[] a2 = new int[] {61,34,45,21,11};

        compareTwo(a1,a2);
    }
    public static void compareTwo(int[] a1, int[] a2) {

        for (int i = 0; i < a1.length; i++) {

            for (int j = 0; j < a2.length; j++) {

                if (a1[i] == a2[j]) {
                    System.out.println(a1[i]);
                }

            }
        }
    }
}
