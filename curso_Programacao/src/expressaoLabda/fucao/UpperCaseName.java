package expressaoLabda.fucao;

import java.util.function.Function;

import expressaoLabda.exemp01.Product;

//o tipo de entrada vai ser Produto e tipo de saida vai ser String
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        // TODO Auto-generated method stub
        return p.getName().toUpperCase();
    }
    
}
