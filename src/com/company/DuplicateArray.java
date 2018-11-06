package com.company;

import java.lang.reflect.Array;

import static java.lang.reflect.Array.*;

public class DuplicateArray {

    public static void main(String[] args) {

        int[] a = {1,5,6,7};


        for (int i = 0; i < a.length-1 ; i++) {

             { for(int j=i+1;j<a.length;j++)
                if (a[i] == a[j]) {
                    System.out.println("result is " + a[j]);
                }

             }

        }


    }
}
