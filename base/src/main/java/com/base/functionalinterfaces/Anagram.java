package com.base.functionalinterfaces;

public class Anagram {


    public static void main(String[] args) {
       compare("wordd","dorwx");

    }

    public  static void  compare(String s1,String s2){

        if(s1.length() != s2.length()){
            System.out.println("string are not equeal");
            return;
        }
        for(int i=0; i< s1.length() ;i++){

            Character ch =s1.charAt(i);
             if(ch!= -1 && s2.indexOf(ch) != -1){

             }
             else {
                 System.out.println("not !!1");
             }
        }

    }
}
