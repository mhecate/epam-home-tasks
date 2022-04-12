package src.main.java;

import src.main.java.models.Circle;
import src.main.java.models.Shape;
import src.main.java.models.Rectangle;
import src.main.java.models.Triangle;

public class Homework1 {
  public static void main(String[] args){
    System.out.println("       --------------------------------------------------------");
    Shape circle = new Circle("red", true, 2.1);
    System.out.println(circle.toString());

    System.out.println("       --------------------------------------------------------");
    Shape rectangle = new Rectangle("blue", false, 5.5, 3);
    System.out.println(rectangle.toString());

    System.out.println("       --------------------------------------------------------");
    Shape triangle = new Triangle("yellow", true, 10, 3, 3);
    System.out.println(triangle.toString());


  }
}
