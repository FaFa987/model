package se.lexicon;

public class Product {
    private int id;
    private double price;
    private String ptoductName;
    public Product(int id, double price, String ptoductName) {
        this.id = id;
        this.price = price;
        this.ptoductName = ptoductName;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public String getPtoductName() {
        return ptoductName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String productInfo(){
        return "you chose: " + ptoductName + ", price: " + price;
    }

}
