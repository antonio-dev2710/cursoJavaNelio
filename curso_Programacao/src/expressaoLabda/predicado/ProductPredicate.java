package expressaoLabda.predicado;

import java.util.function.Predicate;
//interface funcional apenas um método implementado
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product t) {
        // TODO Auto-generated method stub
        return t.getPrice()>=100;
    }
    
}
