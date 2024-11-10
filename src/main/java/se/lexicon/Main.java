package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*VendingMachine vendingMachine = new CandyVendingMachine();

        System.out.println("Available products:");
        for (String product : vendingMachine.getProducts()) {
            System.out.println(product);
        }

        vendingMachine.addCurrency(200);
        System.out.println("Current balance: " + vendingMachine.getBalance());
        vendingMachine.request("C001");
        vendingMachine.request("S001");
        vendingMachine.endSession();
        System.out.println("Final balance after session: " + vendingMachine.getBalance());*/

        //Product p1 = new Product(1,"popcorn", 2.5);
        //Product p2 = new Product(2,"pepsi", 3.0);
        //p2.
        Sandwich sandwich = new Sandwich(10,"hamburge",25 , "cheese");
        //System.out.println(sandwich.orderSandwich());
        //System.out.println(sandwich.toString());
        //System.out.println(sandwich);
        System.out.println(sandwich.getDescription());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(sandwich.toString());

    }
}