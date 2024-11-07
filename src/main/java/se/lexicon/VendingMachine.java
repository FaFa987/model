package se.lexicon;

public interface VendingMachine {

    public void addCurrency(String amount);
    public int getBalance();
    public Product request(int id);
    public int endSession();
    public String getDescription(int id);
    public String getProductName();

}
