package com.company;

import java.util.Scanner;

public class LargestArray {

    private static void checkLargestArray(int[] arr) {

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max in array: " + max);
    }

    private static void checkLargestFromUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] input = new int[5];
        for(int i=0;i<5;i++){
            input[i] = s.nextInt();
        }
        checkLargestArray(input);
    }

    public static void main (String[]args){
        int[] a = {1,2,3,4};
        checkLargestArray(a);

        checkLargestArray(new int[]{3,4,5,6});

        checkLargestFromUserInput();
    }
}
