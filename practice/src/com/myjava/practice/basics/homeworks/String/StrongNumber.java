package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num, sum = 0;
        while (num > 0){
            int digit = num % 10;
             int fact = 1;
             for (int i = 1; i <=digit; i++){
                 fact *= i;
             }
             sum += fact;
             num /= 10;
        }
        System.out.println(original + (sum == original ? " is a Strong number" : " is not a Strong number"));
        sc.close();
    }
}
