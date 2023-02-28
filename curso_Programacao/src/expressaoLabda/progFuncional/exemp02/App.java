package expressaoLabda.progFuncional.exemp02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    //funcao objeto de primeira classe ou primeira ordem
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 4598.0));
        list.add(new Product("Notbook", 987.0));
        list.add(new Product("Tablet", 450.0));

      
            
       
        
         //passar uma funcao como arguemtno de outra funcao
         list.sort(App::compareProducts);

        for(Product p: list){
            System.out.println(p);
        }

    }
}
