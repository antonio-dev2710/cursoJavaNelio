package orientacaoObjeto;

public class Produto {
    private String name;
    private double price;
    private int quantity;
    double total;

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValuehStock(){
        this.total=this.price*this.quantity;
        return this.total;
    }
    
    @Override
    public String toString() {
        return "Produto [name=" + name + ", price=" + price + ", Quantity=" + this.quantity +", "+ " total "+ totalValuehStock()+"]";
    }
    public void addProducts (int quantity){
        this.quantity+=quantity;
    }

    public void removeProducts (int quantity){
        if(quantity>=0 && quantity<this.quantity);
        //this palavra reservada, signifca uma autoreferencia para o objeto
        this.quantity-=quantity;
    }

    
}
