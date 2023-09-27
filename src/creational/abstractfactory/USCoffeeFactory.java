package creational.abstractfactory;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 27/Sep/2023
 **/

public class USCoffeeFactory implements CoffeeFactory {

    public static Coffee getCoffee(String type) {
        switch (type) {
            case "mocha":
                return new Mocha();
            case "latte":
                return new Latte();
            default:
                return null;
        }
    }

}
