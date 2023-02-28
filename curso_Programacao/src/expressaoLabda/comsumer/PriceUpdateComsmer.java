package expressaoLabda.comsumer;

import java.util.function.Consumer;



public class PriceUpdateComsmer implements Consumer<Product> {

    
    @Override
    public void accept(Product t) {
        // TODO Auto-generated method stub
        t.setPrice(t.getPrice()*1.1);
        
    }
    
}
