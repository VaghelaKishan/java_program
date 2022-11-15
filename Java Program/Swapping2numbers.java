package com.company;

public class Swapping2numbers {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before swapping number : "+a+" "+b);
        // logic 1 : third variable
        int t=a;
        a=b;
        b=t;

        // logic 2: use + $ -
//        a=a+b;  // 10+20=30
//        b=a-b;  // 30-20=10
//        a=a-b;  //30-10=20

        // logic 3: use * $ /
//        a=a*b;
//        b=a/b;
//        a=a/b;

        // logic 4: bitwise XOR(^)
//        a=a^b;
//        b=a^b;
//        a=a^b;

        // logic 5: single line
//        b=a+b-(a=b);  // b=30-20=10   a=20


        System.out.println("After swapping number : " +a+" "+b);
    }
}
