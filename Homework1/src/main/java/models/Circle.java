package src.main.java.models;

import src.main.java.models.Shape;

/**
 * Circle class.
 */
public class Circle extends Shape {
  private double radius;

  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Calculate area of Circle.
   */
  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  /**
   * Calculate area of Circle.
   */
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public String toString(){
    return "Circle color is " + getColor()
        + ", circle area " + calculateArea()
        + ", circle perimeter " + getPerimeter();
  }
}
