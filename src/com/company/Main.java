package com.company;

public class Main {

    public static void main(String[] args) {
        var name = Console.getName();
       Console.welcome(name);
      float weight =  Console.getInput("Enter Your Weight in Kg: ");
      float height =  Console.getInput("Enter Your Height in Meters: ");

      var bmi = new BMICalculator(height, weight);

      Console.printBMI(bmi);
      Console.printCategory(bmi);
    }
}
