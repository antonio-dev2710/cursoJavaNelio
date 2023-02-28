package expressaoLabda.fucao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import expressaoLabda.exemp01.Product;

public class App {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    /* A função "map"(não confunda com a estrutura de dados Map)
    é uma funçaõ que a plica uma função a todos elementos de uma stram */

    //Stream é uma sequencia de dados
    //a função map funciona a partir de uma stream
    list.add(new Product("TV", 4598.0));
    list.add(new Product("Notbook", 87.0));
    list.add(new Product("Tablet", 50.0));
//criando uma instacia dentro da função map
//A função map pega a coleção de valores e aplica na funcão
    //list.stream().map(new UpperCaseName());
    //CONVERTER ESSA STREAM DE NOVO PARA LISTA
    //atribuindo para uma lista de strings
    //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

    //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

    //List<String> names = list.stream().map(Product::nonstaticUpperCaseName).collect(Collectors.toList());

    Function<Product, String> func=p->p.getName().toUpperCase();

   // List<String> names = list.stream().map(func).collect(Collectors.toList());

    List<String> names = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());


    names.forEach(System.out::println);
  }
}
