package com.myjava.practice.basics.homeworks.String;

import java.util.Scanner;

public class DailyExpenditure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly expenditure: ");
        double monthly = sc.nextDouble();
        System.out.print("Enter number of days in the month: ");
        int days = sc.nextInt();
        double daily = monthly / days;
        System.out.printf("Daily expenditure: %.2f\n", daily);
        sc.close();
    }
}
