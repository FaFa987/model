package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Product p1 = new Product(1,"popcorn", 2.5);
        //Product p2 = new Product(2,"pepsi", 3.0);
        //p2.
        Sandwich sandwich = new Sandwich(100, "chicken" ,21.5, "M", true);
        //System.out.println(sandwich.orderSandwich());
        //System.out.println(sandwich.toString());
        //System.out.println(sandwich);
        System.out.println(sandwich.productInfo());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}