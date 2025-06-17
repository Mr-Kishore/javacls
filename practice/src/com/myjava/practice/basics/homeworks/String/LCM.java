package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = a;
        while (b != 0) {
            int temp = b;
            b = gcd % b;
            gcd = temp;
        }

        int lcm = (a * b) / gcd;
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}
