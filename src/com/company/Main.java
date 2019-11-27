package com.company;

public class Main {

    public static void main(String[] args) {
      float weight = (float) Console.getInput("Enter Weight in Kg: ");
      float height = (float) Console.getInput("Enter Height in Meters: ");

      var bmi = new BMICalculator(height, weight);
      bmi.calculateBMI();
    }
}
