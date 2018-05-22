package com.company;

import java.util.Scanner;

public class SmallestArray {

    public static void smallestArray( int[] arr ) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min is:" + min);

    }
    public static void checkwhileuserinput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num from 1 to 6");
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = s.nextInt();
        }
        smallestArray(input);
    }

    public static void main (String[] args){
        int[] a={1,5,6,10};
        smallestArray(a);
        checkwhileuserinput();



    }


}
