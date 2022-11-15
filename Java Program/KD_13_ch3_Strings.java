package com.company;

import java.util.Scanner;

public class KD_13_ch3_Strings {
    public static void main(String[] args) {
        //String name = new String("Kishan");
        String name = "KDVAGHELA";
        System.out.print("The name is: ");
        System.out.println(name);
        int a = 56;
        float b = 5.645f;
        System.out.printf("The value of a is %d and value of b is %.2f", a,b);
        //System.out.format("The value of a is %d and value of b is %f", a,b);

        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        System.out.println(st);
    }
}
