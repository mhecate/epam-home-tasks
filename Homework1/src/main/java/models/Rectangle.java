package src.main.java.models;

import src.main.java.models.Shape;

/**
 * Rectangle class.
 */
public class Rectangle extends Shape {
  private double width;
  private double length;

  public Rectangle(String color, boolean filled, double width, double length) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  /**
   * Calculate area of Rectangle.
   */
  @Override
  public double calculateArea() {
    return width * length;
  }

  /**
   * Calculate perimeter of Rectangle.
   */
  @Override
  public double getPerimeter() {
    return (width * 2) + (length * 2);
  }

  @Override
  public String toString(){
    return "Rectangle color is " + getColor()
        + ", rectangle area " + calculateArea()
        + ", rectangle perimeter " + getPerimeter();
  }
}
