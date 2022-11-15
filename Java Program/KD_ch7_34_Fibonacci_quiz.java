package com.company;

public class KD_ch7_34_Fibonacci_quiz {
    static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int f=20;
        for (int i=0; i<=f;i++){
            int r=Fibonacci(i);
            System.out.println(r);
        }
    }
}
