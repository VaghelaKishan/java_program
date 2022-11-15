package com.company;

public class KD_ch6_27_arrays_for_each_loop {
    public static void main(String[] args) {
//          float [] marks ={98.1f,55,48,69,46,88};
//        String[] students = {"kishan","kirtan","nishit","bodo","kevin"};
//        System.out.println(students.length);
//        System.out.println(students[0]);

        int [] marks={98,55,48,69,46,88};
        System.out.println(marks.length);
        // Displaying the array (naive way)
        System.out.println("Printing using naive way: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // Displaying the array (for loop)
        System.out.println("Printing using for loop: ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // reverse order
        System.out.println("Printing using for loop reverse orser: ");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }


        // For each loop in java //
        // Displaying the array (for-each  loop)
        System.out.println("Printing using for-each loop: ");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
