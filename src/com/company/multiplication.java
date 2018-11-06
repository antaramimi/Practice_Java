package com.company;

import java.util.Scanner;

public class multiplication {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number -> ");
         N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+ " = "+i*N);

        }

        scanner.close();
    }
}

