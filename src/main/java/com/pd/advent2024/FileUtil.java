package com.pd.advent2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {
    public static String readFile(String filePath) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            // Collect all lines into a single string
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            return "Error reading file.";
        }
    }

    public static String[] readFileAsArrayOfStrings(String filePath) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            // Collect all lines into a list of strings
            return reader.lines().toArray(String[]::new);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            return new String[] { "Error reading file." };
        }
    }

    public static List<String> readFileAsListOfStrings(String fileName) {
        // Get the class loader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            // Collect all lines into a list of strings
            return reader.lines().collect(Collectors.toList());
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            return List.of("Error reading file.");
        }
    }

}
