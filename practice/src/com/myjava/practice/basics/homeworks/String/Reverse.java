package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int reversed = 0;
        while (num>0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number" + reversed);
        sc.close();
    }
}
