package com.company;

public class BMICalculator {
  private float height;
  private float weight;

  public BMICalculator(float height, float weight) {
    this.height = height;
    this.weight = weight;
  }

  public float calculateBMI() {
    return (float) (weight/(Math.pow(height, 2)));
  }
}
