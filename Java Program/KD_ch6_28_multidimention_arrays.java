package com.company;

public class KD_ch6_28_multidimention_arrays {
    public static void main(String[] args) {
        //int [] marks; //one 1-D dimensal arrays
        int [][] flats; // two-2-D arrays
        flats = new int[2][3];
        flats [0] [0]=101;
        flats [0] [1]=102;
        flats [0] [2]=103;
        flats [1] [0]=201;
        flats [1] [1]=202;
        flats [1] [2]=203;

        // display 2D
        System.out.println("2D arrays: ");
        for(int i=0;i<flats.length;i++) {
            for (int j = 0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
