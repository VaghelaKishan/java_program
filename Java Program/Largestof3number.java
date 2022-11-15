package com.company;

import java.util.Scanner;

public class Largestof3number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number: ");
        int a= sc.nextInt();

        System.out.println("enter second number: ");
        int b= sc.nextInt();

        System.out.println("enter third number: ");
        int c= sc.nextInt();

        // logic 1:
        if(a>b && a>c){
            System.out.println(a+ "is largest");
        }
        else if (b>a && b>c) {
            System.out.println(b+ "is largest");
        }
        else {
            System.out.println(c+ " is largest");
        }

        // logic 2
//        int largest1=a>b?a:b;
//        int largest2=c>largest1?c:largest1;
//        System.out.println(largest2+ "is largest");

        // logic 3
//        int largest=c>(a>b?a:b)?c:(a>b?a:b);
//        System.out.println(largest+ "is largest");
    }
}
