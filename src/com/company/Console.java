package com.company;

import java.util.Scanner;

public class Console {
  private static Scanner scanner = new Scanner(System.in);

  public static double getInput(String prompt){
    return scanner.nextDouble();
  }
}
