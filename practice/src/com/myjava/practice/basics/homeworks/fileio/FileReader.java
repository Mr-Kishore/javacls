package com.myjava.practice.basics.homeworks.fileio;

import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        // Specify the file to make read-only
        File file = new File("source/test.txt");

        // Check if file exists
        if (file.exists()) {
            // Set file to read-only
            if (file.setReadOnly()) {
                System.out.println("File '" + file.getName() + "' is now read-only.");
            } else {
                System.out.println("Failed to set file '" + file.getName() + "' to read-only.");
            }
        } else {
            System.out.println("File '" + file.getName() + "' does not exist.");
        }
    }
}
