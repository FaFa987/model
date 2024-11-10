package se.lexicon;

public final class Snacks extends Product {

    private int id;
    private String productName;
    private double price;

    public Snacks(int id, String productName, double price) {
        super(id, productName, price);
        this.price = price;
        this.productName = productName;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public String examine() {
        return super.getProductName();
    }
    @Override
    public String use() {
        return super.getProductName();
    }

    @Override
    public String productInfo() {
        return super.getDescription();
    }
}
