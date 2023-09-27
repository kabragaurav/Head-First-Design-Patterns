package creational.abstractfactory;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 27/Sep/2023
 **/

public class IndianCoffeeFactory implements CoffeeFactory {

    public static Coffee getCoffee(String type) {
        switch (type) {
            case "milk":
                return new Milk();
            default:
                return null;
        }
    }

}
