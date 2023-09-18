package behavioral.strategy;

/**
 * @author gaurav kabra
 * @since 18/Sep/2023
 **/

public class Squeak implements Quackable {

    @Override
    public void quack() {
        System.out.println("I squeak");
    }

}
