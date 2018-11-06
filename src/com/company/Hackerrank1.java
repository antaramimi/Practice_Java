package com.company;

import java.util.Scanner;

public class Hackerrank1{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        int[] input = new int[3];
        for(int i=0; i<=myInt; i++){
            input[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("myInt is: " + myInt);
    }




}





