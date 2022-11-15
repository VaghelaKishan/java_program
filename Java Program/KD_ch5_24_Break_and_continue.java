package com.company;

public class KD_ch5_24_Break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
        }

        // while loop break

//        int i=0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==3){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("loop end");

        // continue
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }


    }
}
