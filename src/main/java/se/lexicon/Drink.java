package se.lexicon;

public final class Drink extends Product {
    private boolean isDiet;

    public Drink(int id, String name, int price, boolean isDiet) {
        super(id, name, price);
        this.isDiet = isDiet;
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
        return "Drink: " + getProductName() + (isDiet ? ", Diet" : "") + ", Price: " + getPrice();
    }
}
