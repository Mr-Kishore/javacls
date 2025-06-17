package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original + (original == reversed ? " is a Palindrome" : " is not a Palindrome"));
        sc.close();
    }
}
