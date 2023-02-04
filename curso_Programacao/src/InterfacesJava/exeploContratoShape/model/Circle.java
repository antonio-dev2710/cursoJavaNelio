package InterfacesJava.exeploContratoShape.model;

import InterfacesJava.exeploContratoShape.model.enums.Color;

public class Circle extends AbstractShape {

  private Double radius;

  public Circle(Double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return Math.PI*radius*radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }
}
