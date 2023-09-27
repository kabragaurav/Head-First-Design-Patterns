package creational.abstractfactory;


/**
 * @author gaurav kabra
 * @since 27/Sep/2023
 **/

public class Driver {

    // driver - main method
    public static void main(String[] args) {
        Coffee indianCoffee = CoffeeFactory.getCoffee("india", "milk");
        Coffee usCoffee = CoffeeFactory.getCoffee("us", "mocha");

        System.out.println(indianCoffee);
        System.out.println(usCoffee);
    }

}
