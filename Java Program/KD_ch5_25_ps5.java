package com.company;

import java.security.KeyStore;
import java.util.Scanner;

public class KD_ch5_25_ps5 {
    public static void main(String[] args) {
        // Question 1
        int n = 3;
        for (int i = n; i>0; i--) {
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // Question 2
        int sum = 0;
        int m=6;
        for(int i=0;i<m;i++){
            sum = sum +(2*i);
        }
        System.out.print("sum of even numbers is: ");
        System.out.println(sum);

        // Question 3
        int o=5;
        for (int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n", o,i,o*i);
        }

        // Question 4
        int p=10;
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", p,i,p*i);
        }

        // Question 5
        System.out.println("Enter the number whose factorial you want");
        Scanner sc = new Scanner(System.in);
        int fac = 1;
        int k= sc.nextInt();
        for(int i=1;i<=k;i++){
            fac = (fac*i);
        }
        System.out.printf("Factorial of %d=%d",k,fac);


        // Question 6
//        int d=5;
//        // 5! = 5*4*3*2*1
//        int i=1;
//        int factorial=1;
//        while (i<=d){
//            factorial *=i;
//            i++;
//        }
//        System.out.print(factorial);

        // Question 7
        int a=5;
        int i=n;
        while (i>0){
            int j=0;
            while (j<i){
            for (int b=0;b<a;b++){
                System.out.println("*");
                j++;

            }
            System.out.println("\n");
            a--;
        }


        // Question 8
       //  true

        // Question 9
//        int b=8;
//        int sum1 = 0;
//        for(int i=1;i<=10;i++){
//            sum1 += b*i;
//        }
//        System.out.println(sum1);

        // Question 10
        // A) at least once.

         // Queston 11

    }
}
}
