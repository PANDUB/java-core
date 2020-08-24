package com.ds;

import com.common.util.InputConstant;

public class SearchNumber {

    public static void main(String[] args) {
        System.out.println("output"+search(789, InputConstant.arrayData));
    }

    public static int search(int n, int[] arr)
    {
        int f =0;
        int r =arr.length-1;

        while(f<=r) {
            int mid = (f + r) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            if (n > arr[mid]) f = mid + 1;
            if (n < arr[mid]) r = mid- 1;
        }

         return -1;

        }



}
