package com.company;

public class KD_ch2_Operators {
    public static void main(String[] args) {
        int a=6;

        // 1. Arithmtic op
        //int b= 9+a;
        //int b= 9-a;
        //int b= 9*a;
        //int b= 9%a;  //Modulo operator
        //double b= 9/a;

        // 2. Assignment op
        int b=9;
        //b += 3;
        b *= 3;



        System.out.println(b);

        // 3. Comparison op
        System.out.println(9==3);
        System.out.println(3==3);
        System.out.println(64>6);
        System.out.println(64<6);

        // 4. Logical op
        System.out.println(64>5 && 64>99);
        System.out.println(64>5 || 64>99);


        // 5. Bitwise op
        System.out.println(2&3);
    }
}
