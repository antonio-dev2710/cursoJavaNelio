package expressaoLabda.exercico01;

public class Product {
    private String name;
    private Double price;
    
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    
}
