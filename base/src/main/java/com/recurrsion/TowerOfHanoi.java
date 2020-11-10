package com.recurrsion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        int[] h = {1, 2, 3, 4, 5};
        towerHanoi(h);


    }

    public static void towerHanoi(int[] n) {
        int[] temp = new int[5];
        int[] last = new int[5];
        int k = 0;

        for (int i = n.length-1 ; i >= 0; i--) {
            temp[i] = n[k];
            k++;

        }
        int j=0;
        System.out.println(temp.toString());
        for (int i = temp.length-1 ; i >= 0; i--) {
            last[i] = temp[j];
            j++;

        }
        System.out.println(last.toString());


    }
}
