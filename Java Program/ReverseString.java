package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str= sc.next();

        // logic 1: using string concatenation operator
//        String str="ABCD";
        String rev=" ";

        int len=str.length(); //4
        for(int i=len-1; i>=0; i--){ // 3 2 1 0
            rev=rev+str.charAt(i); //d c b a

        }

        System.out.println("Reversed string is "+rev);

        // Logic 2: using character array
//        char a[]=str.toCharArray();
//        int len=a.length; //4
//        for(int i=len-1; i>=0; i--){ //d c b a
//            rev=rev+a[i];
//
//        }
//        System.out.println("Reversed string is "+rev);


        // logic 3: stringBuffer class
//        StringBuffer sb=new StringBuffer(str);
//        System.out.println(sb.reverse());
    }
}
