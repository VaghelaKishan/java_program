package com.company;

import java.util.Scanner;

public class KD_ch4_19_ps4 {
    public static void main(String[] args) {
        // Question 1
        int a = 10;
        if(a==11){ // = error show becuase = assign op
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am not 11");
        }

        // Question 2
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in mathemetics");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);
        if (avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("congratulations, you are pass");
        }
        else {
            System.out.println("sorry, you are not been pass! please try again.");
        }

        // Question 3
        Scanner st = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = st.nextFloat();

        if(income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (income>5f && income<=10f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income-5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (10.0f-5f);
            tax = tax + 0.3f * (income-10.0f);
        }
        System.out.println("The Total tax paid by the employee is: " + tax);

        // Question 4
        Scanner sca = new Scanner(System.in);
        int day = sca.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Fridy");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // Question 5
        Scanner scan = new Scanner(System.in);
        long year;
        System.out.println("Enter the year you want");
        year = scan.nextLong();

        if(year%100==0 && year%400==0 || year %100!=0 && year % 4==0){
            System.out.println("Yes, this year is a leap year!");
        }
        else {
            System.out.println("no, this year is not a leap year!");
        }

        // Question 6
        Scanner scann = new Scanner(System.in);
        String website = scann.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
    }
}
