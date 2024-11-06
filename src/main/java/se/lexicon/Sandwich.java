package se.lexicon;

public class Sandwich extends Product{

    private String size;
    private boolean cheese;

    public Sandwich(int id, String productName, double price, String size, boolean cheese) {
        super(id, productName, price);
        this.size = size;
        this.cheese = cheese;
    }
    public String getSize() {
        return size;
    }

    public String orderSandwich(){
        return "Your Order: " + productInfo() + " size: " + size;
    }
}
