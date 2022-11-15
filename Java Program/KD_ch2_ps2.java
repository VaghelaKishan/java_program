package com.company;

import java.util.Scanner;

public class KD_ch2_ps2 {
    public static void main(String[] args) {
        // Question 1
        float a =7/4.0f *9/2.0f;
        System.out.println(a);

        // Question 2
        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);
        grade = (char) (grade-8);
        System.out.println(grade);

        //Question 3
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(d>8);

        // Question 4  ---: v2 - u2 / 2as
        float v=10.0f;
        float u = 5.0f;
        float k= 6.0f;
        float s = 8.0f;
        float i = (u*u - v*v) / (2*k*s);
        System.out.println(i);

        // Quesion 5
        int x = 7;
        double z = 7*49/x + 35/x;
        System.out.println(z);

    }
}
