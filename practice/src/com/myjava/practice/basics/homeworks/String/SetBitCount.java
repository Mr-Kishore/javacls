package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class SetBitCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count += num & 1; // Check least significant bit
            num >>= 1;
        }
        System.out.println("Number of 1 bits: " + count);
        sc.close();
    }
}
