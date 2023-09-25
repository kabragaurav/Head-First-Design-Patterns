package creational.factory;

/**
 * @author gaurav kabra
 * @since 25/Sep/2023
 **/

public class Starbucks {

    public void placeOrder(String coffeeType) {
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        System.out.println("Order placed for " + coffee);
    }

}
