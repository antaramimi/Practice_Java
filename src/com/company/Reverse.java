package com.company;

public class Reverse{

    public static void main (String[]args){
        for(int i=100;i>0;i--) {
            System.out.println(i);
        }
        System.out.println("******************");

        for(int i=100;i>0;i--){
            if(i%2==0)
                System.out.println(i);
        }
        System.out.println("***************");
         for(int i=100;i>0;i=i-2){
             System.out.println(i);
         }

        }
    }




