package com.company;

import java.util.Scanner;

public class DuplicateArray {
    private static boolean checkDuplicateArray(int[] arr) {


        int[] a = new int[5];


        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j])
                    return true;
                }

            }

            return false;
        }


    public static void main(String[] args) {
         int[] a={3,3,5,5,8};
        checkDuplicateArray(a);

    }


}
