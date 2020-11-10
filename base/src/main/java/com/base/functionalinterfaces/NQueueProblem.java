package com.base.functionalinterfaces;

import java.util.Arrays;

public class NQueueProblem {
      static int n =8;

    public static void main(String[] args) {

        char[][] mat = new char[n][n];

        for(int i=0; i< n; i++ ){
            Arrays.fill(mat[i],'-');

        }
        //System.out.println(mat.length);
        nQueue(mat,0);


    }

    public static void nQueue(char[][] mat, int r){

        if(n == r){
            for(int i=0 ; i< n; i++){
                for(int j=0; j< n; j++){
                    System.out.print(mat[i][j]+ "");
                  //  System.out.println();
                }
                System.out.println();

            }
            return ;
        }

        for(int c=0 ;  c < n ; c++){

           if(issafe(mat,r,c)){
               mat[r][c]='Q';
                nQueue(mat,r+1);
                mat[r][c]='-';
            }

        }


    }
    public static  boolean issafe(char[][] mat, int r , int c){

        for( int i =0 ; i< r; i++){
            if(mat[i][c] =='Q')
                return false;
        }

        for( int i= r,j=c; i >=0 && j >=0; i--, j--){
            if(mat[i][j]== 'Q')
                return false;
        }
        for( int i= r,j=c; i >=0 && j <n; i--, j++){
            if(mat[i][j]== 'Q')
                return false;
        }
        return true;


    }
}
