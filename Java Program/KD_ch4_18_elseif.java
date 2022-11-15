package com.company;

import java.util.Scanner;

public class KD_ch4_18_elseif {
    public static void main(String[] args) {
        int age=56;
        System.out.println("Enter your age: ");
        Scanner st = new Scanner(System.in);
        age = st.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;

            default:
                System.out.println("Enjoy your life!");

        }

        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");

        }
        else{
            System.out.println("You are not experienced");
        }
    }
}
