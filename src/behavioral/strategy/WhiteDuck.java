package behavioral.strategy;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 18/Sep/2023
 **/

public class WhiteDuck extends Duck {

    @Override
    void display() {
        System.out.println("I am a white duck");
        flyable.fly();
        quackable.quack();
    }

}
