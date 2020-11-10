package com.ds;

public class MergeSort {

    public static void main(String[] args) {


        int a[] = {1, 4, 3, 7, 2, 6};
          int[] result =merge(a);
          for(int i : result)
          {
              System.out.println(i);
          }
    }


    public static int[]   merge(int[] a)
    {
        if(a.length <= 1){
            return a;

        }
        int[] first = new int[a.length/2];
        int[] second =new int [a.length-first.length];
        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);
        merge(first);
        merge(second);

         mergesort(first, second,a);

return a;


    }

    public  static int[] mergesort(int[] first,int[]  second,int[] result){
        int ifirst =0 ;
        int isecond =0;
        int imerge =0;

        while (ifirst <first.length  && isecond <second.length)
        {
            if(first[ifirst] < second[isecond])
            {
               // ifirst  =ifirst+1;
                result[imerge] =first[ifirst];
                ifirst++;
            }
            else {
               // isecond = isecond + 1;
                result[imerge] = second[isecond];
                isecond++;
            }
                imerge++;


        }

       return result;

    }
}
