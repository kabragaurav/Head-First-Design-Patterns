package creational.decorator;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 23/Sep/2023
 **/

public class Saree extends PersonDecorator {

    Saree(Person person) {
        super(person);
    }

    @Override
    public String getDescription() {
        return person.getDescription() + ", wearing saree";
    }
}
