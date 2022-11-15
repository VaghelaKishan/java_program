package com.company;

public class KD_ch6_29_ps6 {
    public static void main(String[] args) {
        // Question 1
        float[] marks = {55.5f, 77.5f, 99.2f, 45.5f, 66.5f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("the value of sum is " + sum);

        // Question 2
        float[] markss = {55.5f, 77.5f, 99.2f, 45.5f, 66.5f};
        float num = 55.7f;
        boolean isInArray = false;
        for (float element : markss) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }

        // Question 3
        float[] marks1 = {55.5f, 77.5f, 99.2f, 45.5f, 66.5f};
        float sum1 = 0;
        for (float element : marks) {
            sum1 = sum1 + element;
        }
        System.out.println("The value of average marks is " + sum1 / marks1.length);


        // Question 4
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Question 5
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Question 6
        // Practice Problem 6
        int [] arr11 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr11){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Question 7
        int []arrr = {1,2,3,4,5,6};
        int min = Integer.MAX_VALUE;
        for(int element: arrr){
            if(element<min){
                min=element;
            }
        }
        System.out.println("the value of minimum element in this array is:" +min);
        
        // Question 8
        boolean isSorted = true;
        int [] arr1 = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr1.length-1;i++){
            if(arr[i] > arr1[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
