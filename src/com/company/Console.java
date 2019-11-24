package com.company;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double getInput(String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value < 0)
                break;
            System.out.println("Enter a value bigger than 0");
            }
           return value;
        }
    }

