package com.company;

import java.util.Scanner;

public class KD_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner kd = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = kd.nextInt();
        //float a = kd.nextFloat();  // 55.22 value
        System.out.println("Enter number 2");
        int b = kd.nextInt();
        int sum = a+b;
        System.out.println("The sum of these number is: ");
        System.out.println(sum);

        boolean b1 = kd.hasNextInt(); // true or false
        System.out.println(b1);

        //String str = kd.next();   // single word
        String str = kd.nextLine(); // line
        System.out.println(str);
    }
}
