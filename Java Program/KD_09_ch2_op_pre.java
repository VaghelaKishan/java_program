package com.company;

// precedence
public class KD_09_ch2_op_pre {
    public static void main(String[] args) {
        // Precedence & Associativity
    int a = 6*5-34/2;
    /*
    Highest precedence goes to * and /. They are then evaluated on the basic of left to right assocuativity
      30-34/2
      30-17
      =13
    */
    int b = 60/5-34*2;
    /*
    left to right
        12-34*2
        12-68
        =-56
     */
        System.out.println(a);
        System.out.println(b);



        // Quick quiz
        int x = 6;
        int y = 1;
        int k = x*y/2;     // x - y /2
        System.out.println(k);

        int l = 1;
        int m = 4;
        int n = 5;
        int h = (l*l - 4*l*m) / (2*l);   // b2 -4ac / 2a
        System.out.println(h);





    }
}
