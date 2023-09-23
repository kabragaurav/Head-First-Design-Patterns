package creational.decorator;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 23/Sep/2023
 **/

public class Raincoat extends PersonDecorator {

    Raincoat(Person person) {
        super(person);
    }

    @Override
    public String getDescription() {
        return person.getDescription() + ", wearing raincoat";
    }
}
