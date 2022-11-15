package com.company;

public class KD_ch7_33_variable_arguments {
//    static int sum(int a, int b){
//        return  a+b;
//    }
//    static int sum(int a, int b , int c){
//        return  a+b+c;
//    }

    static int sum(int ...arr){
       // Available as : int []arr;
        int result=0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("the sum of 4 and 5: " + sum(4 ,5 ));
        System.out.println("the sum of 4 and 5 , 6: " + sum(4 ,5 , 6));

    }
}
