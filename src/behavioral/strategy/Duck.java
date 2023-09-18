package behavioral.strategy;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 18/Sep/2023
 **/

public abstract class Duck {

    protected Flyable flyable;
    protected Quackable quackable;

    void display() {
        System.out.println("I am visible");
    }

    void swim() {
        System.out.println("I can swim");
    }

    void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

}
