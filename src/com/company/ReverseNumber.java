package com.company;

import java.util.Scanner;

public class ReverseNumber {


    public static void ReverseNumberUserInput(){
        int num;
        int rev=0;

        Scanner s =new Scanner(System.in);
        System.out.println("Input your number and press enter: ");
        num=s.nextInt();
        while(num!=0){
            int remainder = num % 10;
            rev=rev*10 + remainder;
            num=num/10;
            }
        System.out.println("Reverse of input number is:" + rev);


    }



    public static void main (String[]args){

        ReverseNumberUserInput();
    }

}
