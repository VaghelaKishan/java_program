package com.company;

import java.util.Scanner;

public class KD_ch5_23_for_loop {
    public static void main(String[] args) {
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        // 2i = Even numbers = 0,2,4,6,8,10
        // 2i+1 = odd numbers = 1,3,5,7,9
//        int n = 11;
//        for(int i=0; i<n; i++){
//            System.out.println(2*i+1);
//        }
//        for(int i=10; i!=0; i--){
//            System.out.println(i);
//        }

        int n=10;
        System.out.println("n natural numbers are: ");
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
        System.out.println("reverse order: ");
        for (int i=n-1;i>=0;i--){
            System.out.println(i);
        }
    }
}
