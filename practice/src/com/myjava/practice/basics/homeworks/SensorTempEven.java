package com.myjava.practice.basics.homeworks;

import java.util.Scanner;

public class SensorTempEven
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sensors: ");
        int n = scanner.nextInt();

        int[] sensorIds = new int[n];
        double[] temperatures = new double[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Sensor ID for sensor " + (i + 1) + ": ");
            sensorIds[i] = scanner.nextInt();

            System.out.print("Enter Temperature for Sensor " + sensorIds[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        System.out.println("\nEven Temperatures:");
        for (int i = 0; i < n; i++) {
            if (temperatures[i] % 2 == 0) {
                System.out.println("Sensor " + sensorIds[i] + ", temp " + temperatures[i]);
            }
        }

        scanner.close();
    }
}