package behavioral.strategy;

/**
 * @author gaurav kabra
 * @since 18/Sep/2023
 **/

public class FlyWithWings implements Flyable {

    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }

}
