package com.myjava.practice.basics.homeworks.String;

import javax.xml.transform.Source;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Prime factors:");
        for (int i=2; i <= num; i++){
            while (num % i == 0) {
                System.out.println(i + " ");
                num /= i;
            }
        }
        sc.close();
    }
}
