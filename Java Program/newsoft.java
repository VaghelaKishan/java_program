package com.company;

public class newsoft {
//    public static void maxmin(int[] nums){
//        int min = nums[0];
//        int max = nums[0];
//
//        for(int i=1; i<nums.length; i++){
//            if(nums[i] > max){
//               max = nums[i];
//            }
//            else if(nums[i] < min){
//               min = nums[i];
//            }
//        }
//        System.out.println("minimum is : " +min);
//        System.out.println("maximum is : " +max);
//    }
    public static void main(String[] args) {
//        int [] nums = {5,7,2,4,9,6,-96,50,98,55,56,100,-2,-1,-66,-99};
//
//        maxmin(nums);
        int n = 5;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}
