package com.base.functionalinterfaces;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateArray {

    int[] arr = {1,2,3,5,5,7,10,22,45,33,7,22,27,32};


    public static void main(String[] args) {
        DuplicateArray duplicateArray =new DuplicateArray();
        duplicateArray.duplicate();

    }

    public void duplicate()
    {

        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int prev = arr[0];
        result[0] =prev;
        for(int i =1 ; i<arr.length;i++){
            int ch = arr[i];
            if(prev != i){
                result[i]=ch;
            }
            prev =ch;

        }

        for(int i : result)
        System.out.println(i);



        }

    }



