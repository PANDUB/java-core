package com.ds;

class Solution {

    public static  int[] searchRange(int[] nums, int target) {

        int first =0;
        int last =nums.length-1 ;
        int [] result = new int[2];
        while( first <= last)
        {
            int mid =(first+last)/2;
            if(target == nums[mid]){
                 result[0]=mid;
                 result[1] =mid+1;
               return result;
            }
            if(target > nums[mid] ) first = mid +1;
            else if (target < nums[mid]) last =mid -1;
        }
        return result;

    }

    public static void main(String[] args) {

        int[] resp =searchRange(new int []{5,7,7,8,8,10},8);
        System.out.println(resp);

    }
}
