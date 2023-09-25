package creational.factory;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 25/Sep/2023
 **/

public class Driver {

    // driver - main method
    public static void main(String[] args) {
        Starbucks starbucks = new Starbucks();
        starbucks.placeOrder("mocha");
        starbucks.placeOrder("latte");
        starbucks.placeOrder("americano");
    }

}
