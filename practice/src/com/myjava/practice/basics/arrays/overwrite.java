package com.myjava.practice.basics.arrays;

public class overwrite {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("c")) {
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }
}
