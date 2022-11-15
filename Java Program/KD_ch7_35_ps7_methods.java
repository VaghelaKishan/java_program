package com.company;

import java.util.Scanner;

public class KD_ch7_35_ps7_methods {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n" , n,i, n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0;i<n; i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static int sumRect(int n){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }
    static void pattern2(int n){
        for(int i=0;i<n; i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if (n==2){
//             return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib (n-1) + fib(n-2);
        }
    }
    float average(float ...arr){
        float total = 0;
        for(float e:arr){
            total += e;
        }
        float avg = total/ arr.length;
        return avg;
    }
    static void  pattern_recur(int rows){
        if(rows>0){
            for(int i=rows;i>0;i--){
                System.out.println("*");
            }
            System.out.println();
            pattern_recur(rows-1);
        }
    }
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static float fahrenheit(float cel) {
        float fahren = (cel * (9/5.0f)) + 32.0f;
        return fahren;
    }
    static int nSum(int n) {
        int sum = 0;
        for(int i=1; i<n+1; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Question 1
        multiplication(7);

        // Question 2
        pattern1(4);

        // Question 3
        int c = sumRect(4 );
        System.out.println(c);

        //  Question 4
        pattern2(4);

        // Question 5
        int result = fib(7);
        System.out.println(result);

        // Question 6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers you want to pass? :");
//        int a = sc.nextInt();
//        float[] arr = new float[a];
//        for (int i=0;i<a;i++){
//            System.out.println("Enter element" +(i+1)+ ":");
//            float el= sc.nextFloat();
//            arr[i]=el;
//        }
//        KD_ch7_35_ps7_methods obj = new KD_ch7_35_ps7_methods();
//        System.out.println("Average is: "+obj.average(arr));

        // Quesr=tion 7
        int r=4;
        pattern_recur(r);

        // Question 8
        pattern1_rec(4);

        // Question 9
        float celcius = 15.7f;
        System.out.println(celcius + " °C" + " -> " + fahrenheit(celcius) + " °F");

        // Question 10

        int num = 5;
        System.out.println("The sum of first " + num + "th natural numbers is: " + nSum(num));


    }
}
