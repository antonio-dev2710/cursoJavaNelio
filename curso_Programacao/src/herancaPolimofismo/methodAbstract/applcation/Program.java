package methodAbstract.applcation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import methodAbstract.Entities.Circle;
import methodAbstract.Entities.Rectangle;
import methodAbstract.Entities.Shape;
import methodAbstract.Entities.enums.Color;

public class Program {

  //São metodos que não possuem implementação

  //Se uma classe possuir pelo menos um método abstrado, então esta classe tabem é abstrata
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter ther number of shapes: ");

    int n = sc.nextInt();
    List<Shape> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println("Shape #" + i + "data: ");

      System.out.println("Rectangle or Circle (r/c)?");

      char ch = sc.next().charAt(0);

      //converter o nome para as constantes d Class enum
      Color color = Color.valueOf(sc.next());

      if (ch == 'r') {
        System.out.println("width:");
        double width = sc.nextDouble();

        System.out.println("height:");
        double heigth = sc.nextDouble();
        list.add(new Rectangle(color, width, heigth));
      }

      if (ch == 'c') {
        System.out.println("radius:");
        double radius = sc.nextDouble();

        list.add(new Circle(color, radius));
      }
    }

    //sahpe aponta para cada subclass
    for (Shape shapes: list) {
        System.out.println(shapes.area());
    }
  }
}
