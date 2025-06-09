package com.myjava.practice.basics;

import java.util.Scanner;

public class AverageFinder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the device id: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter temperature 1: ");
        int t1 = scanner.nextInt();

        System.out.print("Enter temperature 2: ");
        int t2 = scanner.nextInt();

        System.out.print("Enter temperature 3: ");
        int t3 = scanner.nextInt();

        System.out.print("Enter temperature 4: ");
        int t4 = scanner.nextInt();

        System.out.print("Enter temperature 5: ");
        int t5 = scanner.nextInt();

        int sum = t1 + t2 + t3 + t4 + t5;
        int average = sum / 5;

        System.out.println("The average temperature of "
                + deviceId + " is = " + average);

        scanner.close();
    }
    }


