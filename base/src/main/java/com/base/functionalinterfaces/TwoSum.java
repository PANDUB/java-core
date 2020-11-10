package com.base.functionalinterfaces;

public class TwoSum {

    public static void main(String[] args) {

        int[] in = {3,2,3};
        int target =6;
        int[] result = new int[2];

        for(int i=0; i< in.length;i++){
          for(int j =i ; j < in.length ; j++) {
              if (i < in.length - 1 && in[i] + in[j] == target) {
                  result[0] = i;
                  result[1] = j;

              }
          }

        }
        System.out.println(result[0]);
        System.out.println(result[1]);


    }
}
