package src.main.java.models;

import src.main.java.models.Shape;

/**
 * Triangle class.
 */
public class Triangle extends Shape {
  private double firstSide;
  private double secondSide;
  private double thirdSide;

  public Triangle(String color, boolean filled, double firstSide, double secondSide, double thirdSide) {
    super(color, filled);
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.thirdSide = thirdSide;
  }

  public double getA() {
    return firstSide;
  }

  public void setA(double a) {
    this.firstSide = a;
  }

  public double getSecondSide() {
    return secondSide;
  }

  public void setSecondSide(double secondSide) {
    this.secondSide = secondSide;
  }

  public double getThirdSide() {
    return thirdSide;
  }

  public void setThirdSide(double thirdSide) {
    this.thirdSide = thirdSide;
  }

  /**
   * Calculate Triangle area by Heron's formula.
   */
  @Override
  public double calculateArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
  }

  /**
   * Calculate perimeter of Triangle.
   */
  @Override
  public double getPerimeter() {
    return (firstSide + secondSide + thirdSide) / 2;
  }

  @Override
  public String toString(){
    return "triangle color is " + getColor()
        + ", triangle area " + calculateArea()
        + ", triangle perimeter " + getPerimeter();
  }
}
