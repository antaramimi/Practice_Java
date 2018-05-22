package com.company;

public class SearchInArray {


    private static boolean isPresent(int n) {
        int[] a = {1, 5, 25, 30};
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (n == a[i]) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        boolean result = isPresent(5);
        System.out.println(result);

        result = isPresent(57);
        System.out.println(result);

        result = isPresent(30);
        System.out.println(result);

    }
}