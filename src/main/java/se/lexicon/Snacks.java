package se.lexicon;

public final class Snacks extends Product {

    private Size size;
    private boolean nuts;

    public Snacks(int id, String productName, double price, Size size, boolean nuts) {
        super(id, productName, price);
        this.size = size;
        this.nuts = nuts;
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
