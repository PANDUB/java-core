package com.general;

public class ZigZagNumber {
    public static void main(String[] args) {
        String str ="PAYPALISHIRING";
        int row = 3 ;
      int k =0;

        for(int i=0 ; i < str.length(); i++){
            for(int j=0; j < row; j++) {

                System.out.println(str.charAt(j));
            }
            if(str.length()-1 > 0)
            str = str.substring(row,str.length());
        }
    }
}
