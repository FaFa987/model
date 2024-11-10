package se.lexicon;

public final class Sandwich extends Product{

    private String regular;

    public Sandwich(int id, String productName, double price, String regular) {
        super(id, productName, price);
        this.regular = regular;
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
        return "Sandwich: " + getProductName() + ", Regular: " + regular + ", Price: " + getPrice() + " cents";
    }
}


