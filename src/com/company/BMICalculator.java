package com.company;

import java.text.DecimalFormat;

public class BMICalculator {
  private float height;
  private float weight;

  public BMICalculator(float height, float weight) {
    this.height = height;
    this.weight = weight;
  }

  public String calculateBMI() {
    return  (new DecimalFormat("##.##").format(weight/(Math.pow(height, 2))));
  }
}
