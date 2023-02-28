package expressaoLabda.funcoesRecebeFuncoes;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 4598.0));
        list.add(new Product("Notbook", 87.0));
        list.add(new Product("Tablet", 50.0));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p->p.getName().charAt(0)=='T');
        System.out.println("Sum = "+String.format("%.2f", sum));
    }
}
