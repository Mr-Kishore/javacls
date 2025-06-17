package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        if (num == 0) {
            binary.append(0);
        } else {
            while (num > 0) {
                binary.insert(0, num % 2);
                num /= 2;
            }
        }
        System.out.println("Binary: " + binary);
        sc.close();
    }
}
