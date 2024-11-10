package se.lexicon;

public final class Drink extends Product {
    private boolean isDiet;

    public Drink(String id, String name, int price, boolean isDiet) {
        super(Integer.parseInt(id), name, price);
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
        return "Drink: " + getProductName() + (isDiet ? ", Diet" : "") + ", Price: " + getPrice() + " cents";
    }
}
