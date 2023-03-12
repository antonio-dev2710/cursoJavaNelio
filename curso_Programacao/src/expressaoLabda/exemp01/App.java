package expressaoLabda.exemp01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//transpararencia referencial é quando o resultado da fução depende dos valores de enrada
public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 4598.0));
        list.add(new Product("Notbook", 987.0));
        list.add(new Product("Tablet", 450.0));

        //expressao lambda
        //funcao anonima
       // Comparator<Product> comp =(p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase();
    
        //sintaxe de classe anonima
        /* Comparator<Product> comp = new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                // TODO Auto-generated method stub
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
            
        }; */
        //list.sort(new MyComparator());
        //como argumento do sort foi passado um expresão lambda
        //p1 e p2 sao inferencia de tipos
        //Comparator com sitarxe de expressão lambda 
         list.sort((p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p: list){
            System.out.println(p);
        }

    }
}
