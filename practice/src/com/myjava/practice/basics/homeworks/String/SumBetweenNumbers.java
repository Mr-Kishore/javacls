package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class SumBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from " + start + " to " + end + ": " + sum);
        sc.close();
    }
}
