package creational.abstractfactory;

/**
 * @author gaurav kabra
 * @since 27/Sep/2023
 **/

public interface CoffeeFactory {

    static Coffee getCoffee(String country, String type) {
        switch (country) {
            case "india":
                return IndianCoffeeFactory.getCoffee(type);
            case "us":
                return USCoffeeFactory.getCoffee(type);
            default:
                return null;
        }
    }
}
