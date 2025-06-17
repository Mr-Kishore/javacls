package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a);
        if (n > 1) {
            System.out.print(", " + b);
            for (int i = 3; i <= n; i++) {
                int next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }
        }
        System.out.println();
        sc.close();
    }
}
