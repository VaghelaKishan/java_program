package com.company;

public class KD_ch7_34_Recursion {
        // factorial(n) = n*factorial(n-1)
        // factorial(0) = 1
        static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
        }

        static int factorial_iterative(int n){
            if (n == 0 || n == 1) {
                return 1;
            }
            else {
                int product = 1;
                for (int i = 1; i<= n; i++){ // 1 to n
                    product *= i;
                }
                return product;
            }

        }
      public static void main(String[]args){
            int x = 4;
            System.out.println("the value factorial x is: " + factorial(x));
            System.out.println("the value factorial x is: " + factorial_iterative(x));
    }
}
