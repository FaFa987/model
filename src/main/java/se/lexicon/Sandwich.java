package se.lexicon;

public final class Sandwich extends Product{

    private int id;
    private String productName;
    private double price;

    public Sandwich(int id, String productName, double price) {
        super(id, productName, price);
        this.price = price;
        this.productName = productName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return super.productInfo();
    }
}


