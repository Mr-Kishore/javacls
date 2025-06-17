package com.myjava.practice.basics.homeworks.fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterExample {
    public void writeToFile(String fileName, String content) throws IOException {
        // Using FileOutputStream to write content to a file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
            fos.flush();
        }
    }

    // Main method for standalone execution
    public static void main(String[] args) {
        FileWriterExample writer = new FileWriterExample();
        try {
            writer.writeToFile("output.txt", "Hello, this is a test content!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
