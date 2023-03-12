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

    //implementação de interface
    //list.removeIf(new ProductPredicate());

    //refernciar para metodo metodo

    //Referencia para metodo com método estático
    //list.removeIf(Prod com método não estático
    // list.removeoduct::staticProductPredicate);

    //Reference methIf(Product::nonstaticProductPredicate);

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
