package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num1 = sc1.nextInt();

        System.out.println("The number is : " + num1);

        sc1.close();

    }
}
