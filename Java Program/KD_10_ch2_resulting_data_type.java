package com.company;

public class KD_10_ch2_resulting_data_type {
    public static void main(String[] args) {
        byte x= 5;
        int y= 6;
        short z = 8;

        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        // Increment and Decrement operators
        int i = 56;
        // int b = i++; // First b is assigned i (56) then i is incremented
//        int j = 67;
//        int c = ++i; // First j is increment then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // quiz
        int k = 7;
        int d= ++k*8;
        System.out.println(d);

        char ch = 'a';
        System.out.println(ch++);
        System.out.println(++ch);
    }
}
