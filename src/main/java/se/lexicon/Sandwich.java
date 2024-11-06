package se.lexicon;

public final class Sandwich extends Product{

    private String type;
    private boolean cheese;

    public Sandwich(int id, String productName, double price, String type, boolean cheese) {
        super(id, productName, price);
        this.type = type;
        this.cheese = cheese;
    }

    @Override
    public double calculatePrice() {
        return super.getPrice() * 0.1;
    }

    @Override
    public String productInfo() {
        return super.productInfo();
    }
}


