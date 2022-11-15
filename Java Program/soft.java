package com.company;
import  java.util.Arrays;


public class soft {

  static int arr[] = new int[] {1,2,3,4,5,6,7,8,9};

  static void last()
  {
      int x = arr[arr.length-1],i;
      for(i = arr.length-1; i>0; i--)
           arr[i] = arr[i-1];
      arr[0] = x;
  }

    public static void main(String[] args) {
        System.out.println("array is");
        System.out.println(Arrays.toString(arr));

        last();

        System.out.println("last array");
        System.out.println(Arrays.toString(arr));
    }
}
