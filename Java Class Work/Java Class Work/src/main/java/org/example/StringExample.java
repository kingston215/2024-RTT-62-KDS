package org.example;

public class StringExample {
    public static void main(String[] args) {
        String str =  "Hello World";

        System.out.println("The length of string" + str.length());

        String str2 = str.toUpperCase();

        System.out.println(str);
        System.out.println(str2);

        // 0123456789
        // string
        String filename = "Hello.java";

        System.out.println("The filename is " + filename + "and the length is" + filename.length());

        System.out.println("The filename is " + filename);
    }
}
