package se.lexicon;

public interface VendingMachine {

    void addCurrency(int amount); // Add money to the deposit pool
    void request(String productId); // Buy a requested product if enough money is provided
    void endSession(); // End session and return the money
    String getDescription(String productId); // Get product description
    int getBalance(); // Get the current balance of money in the deposit pool
    String[] getProducts(); // Get list of all available products
}
