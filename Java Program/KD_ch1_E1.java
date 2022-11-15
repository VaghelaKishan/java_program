package com.company;

import java.util.Scanner;

public class KD_ch1_E1 {
    public static void main(String[] args) {
        System.out.println(" Total number of subject marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject: ");
        int a = sc.nextInt();
        System.out.println("Enter 2st subject: ");
        int b = sc.nextInt();
        System.out.println("Enter 3st subject: ");
        int c = sc.nextInt();
        System.out.println("Enter 4st subject: ");
        int d = sc.nextInt();
        System.out.println("Enter 5st subject: ");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        System.out.println("Total marks of subject: " + sum);

        int avg = sum*100/500;
        System.out.println("percentage: " +avg);

    }
}
