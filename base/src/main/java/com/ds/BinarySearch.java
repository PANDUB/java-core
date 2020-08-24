package com.ds;

import com.common.util.InputConstant;

public class BinarySearch {


    public static void main(String[] args) {

//find the element 50 in the list and return

        System.out.println( returnVal(50,InputConstant.arrayData));

    }

    public  static  int returnVal(int x, int[] arr)
    {
        int  first =0;
        int last =arr.length-1;
        while (first <= last)
        {
            int mid =(first+last)/2 ;
           if(arr[mid]==x)
           {
               return  x;
           }

           if( x >arr[mid]){
               first= mid+1;
           }
           else if(x < arr[mid])
           {
               last =mid-1;
           }


        }



        return -1;

    }
}
