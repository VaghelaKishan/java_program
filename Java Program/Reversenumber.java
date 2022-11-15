package com.company;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

       // logic 1: using algorithm
        int rev=0;

        while (num!=0){
            rev=rev*10 + num%10;  //0+4=4   40+3=43     430+2=432   4320+1=4321
            num=num/10;            //123    12          1       0
        }

        // logic 2: StringBuffer
//        StringBuffer sb=new StringBuffer(String.valueOf(num));
//        StringBuffer rev=sb.reverse();

        //logic 3:StringBuilder
//        StringBuilder sbl=new StringBuilder();
//        sbl.append(num);
//        StringBuilder rev=sbl.reverse();
//        System.out.println(rev);


    }
}
