package behavioral.strategy;

/**
 * @author gaurav kabra
 * @since 18/Sep/2023
 **/

public class driver {

    // driver - main method
    public static void main(String[] args) {
        Duck duck = new WhiteDuck();
        duck.setFlyable(new FlyWithWings());
        duck.setQuackable(new Quack());
        duck.display();

        duck = new RubberDuck();
        duck.setFlyable(new FlyNoWay());
        duck.setQuackable(new Squeak());
        duck.display();
    }

}
