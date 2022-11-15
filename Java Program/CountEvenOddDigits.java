package com.company;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int num=12345;

        int even_num=0;
        int odd_num=0;

        while (num>0){ //1234 123 12 1
            int rem=num%10;  //4 3 2 1

            if(rem%2==0){
                even_num++; // 1 2
            }
            else {
                odd_num++;  // 1 2 3
            }
            num=num/10;
        }

        System.out.println("even Count number Digits: "+even_num);
        System.out.println("odd Count number Digits: "+odd_num);
    }
}
