package com.company;

public class KD_ch6_26_arrays {
    public static void main(String[] args) {
        /* class room of 500 students -- you have to store marks of these 500 students
        you have 2 options:
        1. create 500 variables
        2. use arrays (recommended)
         */

        // three ways to arrays in java

        //1.  int[]marks = new int[5];

//        2.int [] marks;
//        marks = new int[5];
//        marks[0]=100;
//        marks[1]=70;
//        marks[2]=60;
//        marks[3]=50;
//        marks[4]=55;
        // marks[5]=54; -- error throws

       // 3.
        int [] marks={98,55,48,69,46,88};
        System.out.println(marks[4]);
    }
}
