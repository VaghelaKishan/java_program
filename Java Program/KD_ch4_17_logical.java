package com.company;

public class KD_ch4_17_logical {
    public static void main(String[] args) {
        //  &&-AND (two statment true) ,
        //  ||-OR (one statemnt true then true)
        //  !-NOT ( F-T ,T-F (change statement))

        // AND
        System.out.println("FOr logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("yes");
        }
        else {
            System.out.println("NO");
        }

        // OR
        System.out.println("FOr logical OR...");
        boolean a1 = false;
        boolean b1 = false;
        if (a1 || b1){
            System.out.println("yes");
        }
        else {
            System.out.println("NO");
        }


        // NOT
        System.out.println("FOr logical NOT...");
        System.out.println("Not(A) is ");
        System.out.println(!a);
        System.out.println("Not(B) is ");
        System.out.println(!b);

    }
}
