package expressaoLabda.exemp01;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
