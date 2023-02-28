package expressaoLabda.predicado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class App {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 4598.0));
    list.add(new Product("Notbook", 87.0));
    list.add(new Product("Tablet", 50.0));

    //list.removeIf(new ProductPredicate());
    //refernciar para metodo metodo

    //Reference method com método estático
    //list.removeIf(Product::staticProductPredicate);

    //Reference method com método não estático
    // list.removeIf(Product::nonstaticProductPredicate);

    //expressão lambda declarada
    /* Predicate<Product> pred = p -> p.getPrice() >= 100;

    list.removeIf(pred); */

    //expresso lambda inline
    list.removeIf(p -> p.getPrice() >= 100);
    for (Product p : list) {
      System.out.println(p);
    }
  }
}
