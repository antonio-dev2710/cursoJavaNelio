package InterfacesJava.exeploContratoShape.program;

import InterfacesJava.exeploContratoShape.model.AbstractShape;
import InterfacesJava.exeploContratoShape.model.Circle;
import InterfacesJava.exeploContratoShape.model.Rectangle;
import InterfacesJava.exeploContratoShape.model.Shape;
import InterfacesJava.exeploContratoShape.model.enums.Color;

public class App {

  public static void main(String[] args) {
    AbstractShape s1 = new Circle(2.0, Color.BLACK);
    AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

    System.out.println("Circle color: " + s1.getColor());
    System.out.println("Circle area: " + String.format("%.3f", s1.area()));
    System.out.println("Rectangle color: " + s2.getColor());
    System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
  }
}
