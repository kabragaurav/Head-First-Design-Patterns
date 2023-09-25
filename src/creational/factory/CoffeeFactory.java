package creational.factory;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 25/Sep/2023
 **/

public class CoffeeFactory {

    public static Coffee getCoffee(String coffeeType) {
        switch (coffeeType) {
            case "mocha":
                return new Mocha();
            case "latte":
                return new Latte();
            default:
                return null;
        }
    }

}
