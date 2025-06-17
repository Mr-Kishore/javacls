package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            sum += num %10;
            num /=10;
        }
        System.out.println("sum of digits" + sum);
        sc.close();
    }
}
