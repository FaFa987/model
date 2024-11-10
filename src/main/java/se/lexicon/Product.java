package se.lexicon;

public abstract class Product {

    private int id;
    private String productName;
    private double price;


    public Product(int id , String productName , double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public abstract String examine();

    public abstract String use();

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }

    public String getDescription(){
        return "Item: " + productName + ", price: " + price;
    }

}
