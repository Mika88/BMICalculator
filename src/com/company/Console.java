package com.company;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static float getInput(String prompt) {
        float value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value > 0)
                break;
            System.out.println("Enter a value bigger than 0");
        }
        return value;
      }

     public static void printBMI(BMICalculator calculator) {
         System.out.println("Your BMI is: ");
         System.out.println(calculator.calculateBMI());
      }

      public static void printCategory(BMICalculator calculator) {
        var bmi = Float.parseFloat(calculator.calculateBMI());

        if (bmi < 18.5)
            System.out.println("Your BMI category is: Underweight");
        else if (bmi < 25 && bmi > 18.5)
            System.out.println("Your BMI category is: Normal Weight");
        else if (bmi < 30 && bmi > 25 )
            System.out.println("Your BMI category is: Over Weight");
        else
            System.out.println("Your BMI category is: Obesity");
      }
    }

