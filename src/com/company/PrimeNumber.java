package com.company;

public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 50; i++) {
            boolean flag=true;
            for (int n = 2; n <i; n++) {
                if (i % n == 0) {
                    count++;
                     flag=false;

                }
            }
           if (flag==true)
               System.out.println("Prime numbers from 1 to n are :" + i );
        }

    }
}