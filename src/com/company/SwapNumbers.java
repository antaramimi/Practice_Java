package com.company;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        {
            int x,y,temp;

            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number");
            x=in.nextInt();
            y=in.nextInt();

            System.out.println("Before Swapping\nx ="+x+"\ny = "+y);
            temp=x;
            x=y;
            y=temp;

            System.out.println("After Swapping\nx = "+x+"\ny = "+y);





        }
    }

}
