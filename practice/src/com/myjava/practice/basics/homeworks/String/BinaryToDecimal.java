package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        int decimal = 0, power = 0;
        while (binary > 0) {
            decimal += (binary % 10) * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}
