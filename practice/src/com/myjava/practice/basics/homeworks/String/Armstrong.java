package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, digits = (int) Math.log10(num) + 1, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        System.out.println(original + (sum == original ? " is an Armstrong number" : " is not an Armstrong number"));
        sc.close();
    }
}
