package com.company;

public class KD_ch7_32_methods_overloading {
    // Methods
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static  void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int []arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    // class

    public static void main(String[] args) {
        //telljoke();
        int [] marks = {42,44,52,78,89,98,94};
        // case 1: changing the integer
        int x=45;
        change(x);
        System.out.println("The value of x after running change is : " +x);

        //case 2: chaging the array
        int [] markss = {42,44,52,78,89,98,94};
        change2(markss);
        System.out.println("he value of x after running change is : " +markss[0]);

        // Methods Overloading
        foo();
        foo(2000);
        foo(3000, 4000);
        // Arguments are actual!
    }
}
