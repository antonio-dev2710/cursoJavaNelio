package expressaoLabda.comsumer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 4598.0));
    list.add(new Product("Notbook", 87.0));
    list.add(new Product("Tablet", 50.0));

   //impelementação da interface
     //list.forEach(new PriceUpdateComsmer());

    //Reference method com método estático
    //list.forEach(Product::staticProductUpdate);

    //Reference method com método não estático
    //list.forEach(Product::ProductUpdate);

    //expressão lambda declarada
    /* Consumer<Product> con = p -> p.setPrice(p.getPrice()*1.1); 

    list.forEach(con); */

    //expresso lambda inline
    //list.forEach(p -> p.setPrice(p.getPrice()*1.1));
    list.forEach(System.out::println);
  }
}
