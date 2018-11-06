package com.company;

public class ReverseString {

    //String class is immutable whereas StringBuffer is mutable class . Reverse function is avaliable in StringButter not string.

    public static void main(String arg[]) {

        String a = "ABCD";
        String rem = "";
        int len = a.length();
        for (int i = len - 1; i >= 0; i--) {
            rem = rem + a.charAt(i);
        }
        System.out.println(rem);


        //2.Second Method using stringBuffer.

        StringBuffer s=new StringBuffer(a);
        System.out.println(s.reverse());

    }

}