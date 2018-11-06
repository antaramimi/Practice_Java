package com.company;

public class Find2LargestNumber {

    public static int print2largest(int[] a){

        int biggest=a[0];
        int secBiggest=a[0];
        int length= a.length;
        for(int i=1;i< length ;i++){

            {
                if(a[i] > biggest){
                        secBiggest= biggest;
                        biggest=a[i];

            }

            else if ( secBiggest < a[i]){
                    secBiggest=a[i];


            }
            }
        }

        return secBiggest;

    }

    public static void main(String arg[]){
        int a[]={2,4,9,5,1};
        System.out.println("second largest number" +print2largest(a));
    }
}


