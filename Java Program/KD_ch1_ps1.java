package com.company;

import java.util.Scanner;

public class KD_ch1_ps1 {
    public static void main(String[] args) {
        //Question 1
        int a=6;
        int b= 7;
        int c = 9;
        int sum= a+b+c;
        System.out.println(sum);

        //Question 2
        float sub1= 45;
        float sub2 = 77;
        float sub3 = 85;
        float  cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);

        //Question 3
//        System.out.println("What is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

        //Question 4
        System.out.println("Enter the value in kilometers");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        double miles = (value/1.609);
        System.out.println("the value in miles is " + miles + " miles");


        //Question 5
//        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

    }
}
