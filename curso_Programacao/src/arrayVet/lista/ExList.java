package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExList {

  public static void main(String[] args) {
    //homogenea
    //ordenada
    //Inicia vazia, alocados sob demanda
    //cada elemento ocupa um nó
    //tipo list é uma interface

    //tamanho variável

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Ana");

    list.add(2, "Marco");

    //tamanho dalista
    System.out.println(list.size());

    //remoção
    //list.remove("Ana");
    //list.remove(1);

    //predicado
    //remocao
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String lista : list) {
      System.out.println(lista);
    }

    //posicao de um elemento
    System.out.println("Posição de um elemento" + list.indexOf("Bob"));

    System.out.println("Posição de um elemento" + list.indexOf("Marco"));

    System.out.println("----------------------------------");
    List<String> result = list
      .stream()
      .filter(y -> y.charAt(0) == 'A')
      .collect(Collectors.toList());
    for (String lista : result) {
      System.out.println(lista);
    }

    System.out.println("----------------------------------");
    String name = list
      .stream()
      .filter(y -> y.charAt(0) == 'A')
      .findFirst()
      .orElse(null);

      System.out.println(name);
  }
}
