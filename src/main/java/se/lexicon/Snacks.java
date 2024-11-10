package se.lexicon;

public final class Snacks extends Product {

    private String flavor;

    public Snacks(int id, String productName, double price, String flavor) {
        super(id, productName, price);
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "";
    }

    @Override
    public String use() {
        return "";
    }

    @Override
    public String getDescription() {
        return "Snacks: " + getProductName() + ", Flavor: " + flavor + ", Price: " + getPrice() + " cents";
    }
}
