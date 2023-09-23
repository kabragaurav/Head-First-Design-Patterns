package creational.decorator;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 23/Sep/2023
 **/

public abstract class PersonDecorator extends Person {
    Person person;

    PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription();
    }
}
